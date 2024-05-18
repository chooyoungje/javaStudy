package lesson_0507;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Stream04 {


    public static void main(String[] args) throws FileNotFoundException{
        System.out.println("파일의 내용을 스트림을 이용하여 화면에 출력");
        BufferedReader br = new BufferedReader (new FileReader( new File ("src/ch17_Stream/StreamEx04_File.java")));
        br.lines().forEach(s -> System.out.println(s));


        Scanner sc = new Scanner(new File("src/ch14_Collection/Chess.txt"));
        System.out.println("1) 월별 리스트");
        sc
                .tokens() // stream
                .map(s -> new Chess(s))
                .collect(Collectors.groupingBy(s -> s.getResult()))
                .forEach((k, v) -> {
                    System.out.println(k + "월");
                    for (Object o : v) {
                        System.out.println(o);
                    }
                });


    }
}
class Chess {
    int result;
    String openingname;
    int num;
    String how;
    public Chess(String line) {
        String[] str = line.split(",");
        this.result = Integer.parseInt(str[0]);
        this.openingname = str[1];
        this.num = Integer.parseInt(str[2]);
        if (str.length == 4)
            this.how = str[3];
        else
            this.how = "";
    }


    public int getResult() {
        return result;
    }


    public void setResult(int result) {
        this.result = result;
    }


    public String getOpeningname() {
        return openingname;
    }


    public void setOpeningname(String openingname) {
        this.openingname = openingname;
    }


    public int getNum() {
        return num;
    }


    public void setNum(int num) {
        this.num = num;
    }


    public String getHow() {
        return how;
    }


    public void setHow(String how) {
        this.how = how;
    }


    @Override
    public String toString() {
        return "Product [result=" + result + ", openingname=" + openingname + ", num=" + num + ", how=" + how + "]";
    }
}


