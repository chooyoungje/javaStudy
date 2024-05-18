package ch17_stream;

import java.util.function.Predicate;

public class StreamEx18_Connect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<String> predicate;

predicate = Predicate.isEqual(null);
System.out.println("nll값이 들어왔니 ? : "+predicate.test(null));

predicate = Predicate.isEqual("java");
System.out.println("java ? = "+predicate.test("java"));

//		Predicate<String> predicate;
//
//		predicate = Predicate.isEqual(null);
//		System.out.println("null, null: " + predicate.test(null));
//
//		predicate = Predicate.isEqual("Java8");
//		System.out.println("null, Java8: " + predicate.test(null));
//
//		predicate = Predicate.isEqual(null);
//		System.out.println("Java8, null: " + predicate.test("Java8"));
//
//		predicate = Predicate.isEqual("Java8");
//		System.out.println("Java8, Java8: " + predicate.test("Java8"));
//
//		predicate = Predicate.isEqual("Java8");
//		System.out.println("Java7, Java8: " + predicate.test("Java7"));
	}

}
