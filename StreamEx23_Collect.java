package ch17_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx23_Collect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student4> totalList = Arrays.asList(
	            new Student4("홍길동", 10, Student4.Sex.MALE),
	            new Student4("김수애", 6, Student4.Sex.FEMALE),
	            new Student4("신용권", 10, Student4.Sex.MALE),
	            new Student4("박수미", 6, Student4.Sex.FEMALE)
	      );
		
		System.out.println("1. 남학생의 이름, 점수를 프린트 한다 List");
//		List<Student4> maleList =
//				totalList.stream()
//				.filter(s -> s.getSex() == Student4.Sex.MALE)
//				.collect(Collectors.toList());
//		maleList.stream().forEach(s -> System.out.println(s.getName()+ "," + s.getScore()));
//
		List<Student4> maleList = totalList.stream()
						.filter(m -> m.getSex() == Student4.Sex.MALE)
								.collect(Collectors.toList());
		maleList.stream().forEach(s -> System.out.println(s.getName() + " - : -" + s.getScore()));
		
		System.out.println("2. 여학생의 이름, 점수를 프린트 한다 Set");
		List<Student4> femaleList =
				totalList.stream()
				.filter(s -> s.getSex() == Student4.Sex.FEMALE)
				.collect(Collectors.toList());
		femaleList.stream().forEach(s -> System.out.println(s.getName()+ "," + s.getScore()));
		
	}

}

class Student4 {
	   public enum Sex { MALE, FEMALE }
	   public enum City { Seoul, Pusan }
	   
	   private String name;
	   private int score;
	   private Sex sex;
	   private City city;
	   
	   public Student4(String name, int score, Sex sex) {
	      this.name = name;
	      this.score = score;
	      this.sex = sex;
	   }   
	   
	   public Student4(String name, int score, Sex sex, City city) {
	      this.name = name;
	      this.score = score;
	      this.sex = sex;
	      this.city = city;
	   }

	   public String getName() { return name; }
	   public int getScore() { return score; }
	   public Sex getSex() { return sex; }
	   public City getCity() { return city; }
	   
}
