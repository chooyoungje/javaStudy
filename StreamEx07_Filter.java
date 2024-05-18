package ch17_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx07_Filter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Member> list = Arrays
				.asList(new Member("홍길동", Member.MALE, 30),
						new Member("김나리", Member.FEMALE, 20),
						new Member("신용권", Member.MALE, 45),
						new Member("박수미", Member.FEMALE, 27));
		double ageAvg =
				list.stream()
				.filter(m -> m.getGender() == Member.MALE)
				// .mapToInt(Member::getAge) // method reference
				.mapToInt(s -> s.getAge())
				.peek(s -> System.out.println(s)) // peek는 최종 연산자가 있어야 출력이 된다
				.average() // mapToInt로 지금 내가 다루고 있느 자료를 Member에서 age로 바꿨기 때문에 사용가능
				.getAsDouble();
		System.out.println("남자 평균 나이: " + ageAvg);

		// 스트림 내에서는 원본 list의 상태를 변경해서는 안된다
		/*
		peek은 파이프라인의 특정 시점의 요소를 확인하고 싶은 경우와 같이 디버깅을 지원하기 위해 존재
		* 1. 전체학생 중에서 어떤 학생을 가져올 것인지 filter로 거르기
		* 2. 그 학생 객체에서 어떤 데이터를 가져올 지 map으로 지정
		* 3.
		* */

		double ageAvg2 =
				list.stream()
						.filter((m) -> m.getGender() == Member.FEMALE) // 뭘 갖고 올 건지 표본 거르기
						.mapToInt(s -> s.getAge())
						.peek(s -> System.out.println(s))
						.average()
						.getAsDouble();

		System.out.println("여자의 평균 나이 : "+ ageAvg2);
		List<String> animals = Arrays.asList("cat","dog");


		List<String>list2 = animals.stream().map(animal -> animal.split(""))
				.flatMap(Arrays::stream)
				.collect(Collectors.toList());

		for(String s : list2){
			System.out.print(s);
		}

	}


}
class Member {
	   public static int MALE = 0;
	   public static int FEMALE = 1;
	   private String name;
	   private int gender;
	   private int age;
	   
	   
	   
	   public Member(String name, int gender, int age) {
	      super();
	      this.name = name;
	      this.gender = gender;
	      this.age = age;
	   }
	   public String getName() {
	      return name;
	   }
	   public void setName(String name) {
	      this.name = name;
	   }
	   public int getGender() {
	      return gender;
	   }
	   public void setGender(int gender) {
	      this.gender = gender;
	   }
	   public int getAge() {
	      return age;
	   }
	   public void setAge(int age) {
	      this.age = age;
	   }

	   
	}