package ch17_stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
 * Stream 정렬하기
 * Compareable을 기본으로 상속 받은 객체
 * 
 * sorted : order by (sql)
 */
public class StreamEx12_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list
		= Arrays.asList("홍길동", "김삿갓", "이몽룡", "임꺽정");
		list.stream()
		.forEach(System.out::println);
		System.out.println();
		
		System.out.println("기본정렬");
		list.stream()
		.sorted()
		.forEach(System.out::println);
		
		System.out.println();
		System.out.println("기본의 역순 정렬");
		list.stream()
		.sorted(Comparator.reverseOrder())
		.forEach(System.out::println);
	}

}
