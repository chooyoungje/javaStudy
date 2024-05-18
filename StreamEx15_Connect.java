package ch17_stream;

import java.util.function.Function;

/*Function<T, R>
andThen()과 compose() 디폴트 메소드
함수적 인터페이스가 가지고 있는 디폴트 메소드
andThen()
두 개의 함수적 인터페이스를 순차적으로 연결해 실행
첫 번째 리턴값을 두 번째 매개값으로 제공해 최종 결과값 리턴
compose()
어떤 함수적 인터페이스부터 처리하느냐*/
public class StreamEx15_Connect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Function<Member2, Address> functionA;
Function<Address,String> functionB;
Function<Member2, String> functionAB;
String city;

functionA = member2 -> member2.getAddress();
functionB = s -> s.getCity();
functionAB = functionA.andThen(functionB);

city = functionAB.apply(new Member2("홍길동", "hong",
				new Address("한국", "서울")));
System.out.println(city);
//		Function<Member2, Address> functionA;
//		Function<Address, String> functionB;
//		Function<Member2, String> functionAB;
//
//		String city;
//		// functionA = Member::getAddress;
//		// functionB = Address::getCity;
//		functionA = m -> m.getAddress();
//		functionB = a -> a.getCity();
//
//		functionAB = functionA.andThen(functionB);	// A -> B
//		city = functionAB.apply(
//				new Member2("홍길동", "hong", new Address("한국", "서울")));
//		System.out.println("andThen --> 거주도시 : " + city);
//		System.out.println();

functionAB = functionB.compose(functionA);
city = functionAB.apply(
		new Member2("홍길동", "hong", new Address("한국", "서울")));
System.out.println("compose "+city);

//		functionAB = functionB.compose(functionA); // B <- A
//		city = functionAB.apply(
//				new Member2("홍길동", "hong", new Address("한국", "서울")));
//		System.out.println("compose --> 거주도시 : " + city);
//

	}

}
