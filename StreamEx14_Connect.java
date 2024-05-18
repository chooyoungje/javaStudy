package ch17_stream;

import java.util.function.Consumer;

/* Consumer<T> default 메소드 andThen()
 * 함수적 인터페이스가 가지고 있는 디폴트 메소드
 * 두 개의 함수적 인터페이스를 순차적으로 연결해 실행
 * */

public class StreamEx14_Connect {

	public static void main(String[] args) {

Consumer<Member2> consumerA = (m) -> {
	System.out.println("consumerA : " + m.getName());
};
consumerA.accept(new Member2("홍길동","hong",null));

Consumer<Member2> consumerB = (m) -> {
	System.out.println("consumerB : " + m.getId());
};
consumerB.accept(new Member2("김씨","kim",null));

Consumer<Member2> consumerAB = consumerA.andThen(consumerB);
consumerAB.accept(new Member2("AB","ab",null));

//		Consumer<Member2> consumerA = (m) -> {
//			System.out.println("consumerA: " + m.getName());
//		};
//		consumerA.accept(new Member2("홍길동", "hong", null));
//
//		Consumer<Member2> consumerB = (m) -> {
//			System.out.println("consumerB: " + m.getId());
//		};
//		consumerB.accept(new Member2("홍길동", "hong", null));
//
//		System.out.println("===========================");
//		Consumer<Member2> consumerAB = consumerA
//				.andThen(consumerB)
//				.andThen(consumerA);
//
//		consumerAB.accept(new Member2("홍길동", "hong", null));
	}
	
}

class Member2 {
	   private String name;
	   private String id;
	   private Address address;
	   
	   public Member2(String name, String id, Address address) 
	   {
	      this.name = name;
	      this.id = id;
	      this.address = address;
	   }

	   public String getName() { return name; }
	   public String getId() { return id; }
	   public Address getAddress() { return address; }
	}

	class Address {
	    private String country;
	    private String city;
	    
	    public Address(String country, String city) {
	       this.country = country;
	       this.city = city;
	    }
	    
	    public String getCountry() { return country; }
	   public String getCity() { return city; }
	}
