package ch17_stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamEx21_Boxed {
	static int sum = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int sum = 0; Stream.forEach() Consumer 인터페이스 메소드 사용
		// 로컬 변수로 할 수 없음
		// 클래스 변수로 할 수있음
int[] intArr= {1,2,3,4,5};
IntStream intStream = Arrays.stream(intArr);
intStream.asDoubleStream().forEach(s -> System.out.println(s));

intStream = Arrays.stream(intArr);
intStream.boxed().forEach(obj -> System.out.println(obj.intValue()));


IntStream stream = IntStream.rangeClosed(1,10);
stream.forEach(a  -> sum+=a);
System.out.println(sum);

sum = 0;
stream = IntStream.range(1,10);
stream.forEach(a -> sum+=a);
System.out.println(sum);
//		int[] intArray = { 1, 2, 3, 4, 5};
//		IntStream intStream = Arrays.stream(intArray);
//		intStream
//		.asDoubleStream()
//		.forEach(d -> System.out.println(d));
//		System.out.println();
//
//		intStream = Arrays.stream(intArray);
//		intStream
//		.boxed()
//		.forEach(obj -> System.out.println(obj.intValue()));
//
//		IntStream stream = IntStream.rangeClosed(1,  100);
//		stream.forEach(a -> sum += a);
//		System.out.println("총합 : " + sum);
//		sum = 0;


//		stream = IntStream.range(1, 100);
//		stream.forEach(a -> sum += a);
//		System.out.println("총합 : " + sum);
		
	}

}


