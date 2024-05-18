package ch17_stream;

import java.util.function.BinaryOperator;

/*
 * minBy(), maxBy() 정적 메소드
BinaryOperator<T> 함수적 인터페이스의 정적 메소드*/

class Fruit {
	public String name;   public int price;
	public Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}
}

public class StreamEx19_Connect {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

BinaryOperator<Fruit> binaryOperator;
Fruit fruit;
binaryOperator = BinaryOperator.minBy((f1,f2)->Integer.compare(f1.price, f2.price));
fruit = binaryOperator.apply(new Fruit("딸기", 6000),
		new Fruit("수박", 10000));
System.out.println(fruit.name);

binaryOperator = BinaryOperator.maxBy((f1,f2)-> Integer.compare(f1.price,f2.price));
fruit = binaryOperator.apply(new Fruit("딸기", 6000),
		new Fruit("수박", 10000));
System.out.println(fruit.name);

//		BinaryOperator<Fruit> binaryOperator;
//		Fruit fruit;
//		binaryOperator = BinaryOperator
//				.minBy((f1, f2) -> Integer.compare(f1.price, f2.price));
//
//		fruit = binaryOperator.apply(new Fruit("딸기", 6000),
//				new Fruit("수박", 10000));
//		System.out.println(fruit.name);
//
//		binaryOperator = BinaryOperator
//				.maxBy((f1, f2) -> Integer.compare(f1.price, f2.price));
//		fruit = binaryOperator
//				.apply(new Fruit("딸기", 6000),new Fruit("수박", 10000));
//		System.out.println(fruit.name);
	}

}
