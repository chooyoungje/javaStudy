package ch17_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreamEx08_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("홍길동전", "춘향전", "구운몽", "전우치전", "사씨남정기");
		
		System.out.println();
		IntStream isr = list.stream()
				.mapToInt(String::length);
		isr.forEach(System.out::println);
		
		System.out.println();
		
		list.stream()
		.mapToInt(s -> s.length())
		.forEach(s -> System.out.println(s));
	}

}
