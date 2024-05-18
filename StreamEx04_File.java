package ch17_stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StreamEx04_File {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("파일의 내용을 스트림을 이용하여 화면에 출력");
		BufferedReader br = new BufferedReader(new FileReader(new File("src/lesson_0507/StreamEx04_File.java")));
		br.lines().forEach(s -> System.out.println(s));
		
		Scanner sc = new Scanner(
				new File("src/ch14_collection/product.txt"));
		System.out.println("1) 월별 리스트");
		System.out.println();
		sc
		.tokens() // stream
		.map(s -> new Product(s))
		.collect(Collectors.groupingBy(s -> s.getMon()))
		.forEach((k, v) -> {
			System.out.println(k + "월");
			for(Object o : v) {
				System.out.println(o);
			}
		});
		
		sc = new Scanner(new File("src/ch14_collection/product.txt"));
		System.out.println("2) 월별 \t 생산 \t 판매 \t 반품 합계 현황");
		sc
		.tokens() // stream
		.map(s -> new Product(s))
		.collect(Collectors.groupingBy(s -> s.getMon()))
		.forEach((k, v) -> {
			System.out.print(k + "월 : ");
			int[] tot = new int[3];
			for(Product o : v) {
				tot[o.getCon() - 1] = o.qty;
			}
			System.out.println(tot[0] + "\t" + tot[1] + "\t" + tot[2] + "\t");
		});
		
		sc = new Scanner(new File("src/ch14_collection/product.txt"));
		System.out.println("3) 제품별 \t 생산 \t 판매 \t 반품 합계 현황");
		sc
		.tokens() // stream
		.map(s -> new Product(s))
		.collect(Collectors.groupingBy(s -> s.getCarname()))
		.forEach((k, v) -> {
			System.out.print(k + ": \t");
			int[] tot = new int[3];
			for(Product o : v) {
				tot[o.getCon() - 1] = o.qty;
			}
			System.out.println(tot[0] + "\t" + tot[1] + "\t" + tot[2] + "\t");
		});
				
	}

}
class Product {
	   int mon;
	   int con;
	   String carname;
	   int qty;
	   String remark;
	   public Product(String line) {
	      String[] str = line.split(",");
	      
	      this.mon = Integer.parseInt(str[0]);
	      this.con = Integer.parseInt(str[1]);
	      this.carname = str[2];
	      this.qty = Integer.parseInt(str[3]);
	      if (str.length==5)
	      this.remark = str[4];
	      else 
	      this.remark="";
	   }
	   
	   
	public int getCon() {
		return con;
	}


	public void setCon(int con) {
		this.con = con;
	}


	public String getCarname() {
		return carname;
	}


	public void setCarname(String carname) {
		this.carname = carname;
	}


	public int getQty() {
		return qty;
	}


	public void setQty(int qty) {
		this.qty = qty;
	}


	public String getRemark() {
		return remark;
	}


	public void setRemark(String remark) {
		this.remark = remark;
	}


	public int getMon() {
		return mon;
	}


	public void setMon(int mon) {
		this.mon = mon;
	}


	@Override
	   public String toString() {
	      return "Product [mon=" + mon + ", con=" + con + ", carname=" + carname + ", qty=" + qty + ", remark=" + remark
	            + "]";
	   }
}
