package ch17_stream;

import java.util.function.UnaryOperator;

public class StreamEx16_Connect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		UnaryOperator<Member2> operator = UnaryOperator.identity();
//		Member2 member = operator.apply(new Member2("홍길동", "hong", null));
//		System.out.println("이름: " + member.getName());
//		System.out.println("아이디: " + member.getId());

UnaryOperator<Member2> operator= UnaryOperator.identity();
Member2 member2 = operator.apply(new Member2("이름","아이디",null));
System.out.println(member2.getName());
System.out.println(member2.getId());
	}

}
