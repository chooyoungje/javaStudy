package ch17_stream;

import java.util.Arrays;
import java.util.List;

public class StreamEx10_FlatMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1 
	      = Arrays.asList("자바 8 버전에 ", "추가된 스트림을", "열심히 공부하자");
	    list1.stream()
	    .flatMap(data -> Arrays.stream(data.split(" ")))
	    .forEach(word -> System.out.println(word));
		
		System.out.println("====================");
	}

}
