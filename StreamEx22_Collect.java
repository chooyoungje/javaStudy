package ch17_stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx22_Collect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student2[] stuArr = {
		new Student2("이자바", 3, 34, 55, 80),
		new Student2("김자바", 1, 60, 45, 90),
		new Student2("안자바", 2, 80, 95, 60),
		new Student2("박자바", 2, 75, 85, 70),
		new Student2("소자바", 1, 65, 65, 90),
		new Student2("나자바", 3, 60, 85, 50),
		new Student2("감자바", 3, 40, 75, 60)
};
		
//		System.out.println("1. 학생 이름만 뽑아서 List<String>에 저장한다.");
//		List<String> names = Stream.of(stuArr)
//				.map(Student2::getName)
//				.collect(Collectors.toList());
//
//		System.out.println(names);
System.out.println("1. 학생 이름만 뽑아서 List<String>에 저장한다.");
List<String> names = Stream.of(stuArr)
		.map(s -> s.getName())
		.collect(Collectors.toList());
System.out.println(names);



// 컬렉러를 쓰지 않고 배열로 바꾸기
	System.out.println("2. 학생 이름만 뽑아서 String[]에 저장한다.");
//		String[] arrnames = Stream.of(stuArr)
//				.map(Student2::getName)
//				.toArray(String[]::new);
//		System.out.println(Arrays.asList(arrnames));
//
String[] arrnames = Stream.of(stuArr)
		.map(Student2::getName)
		.toArray(String[] :: new);
System.out.println(Arrays.asList(arrnames));


//		Map<Object, Object> map =
//				Stream.of(stuArr)
//				.collect(Collectors.toMap(s -> s.getName(), s-> s));
//		for(Object name : map.keySet()) {
//			System.out.println(name + "-" + map.get(name));
//		}
System.out.println("3. Map<String, Student>로 변환한다 key는 name");
Map<String, Object> map =
		Stream.of(stuArr)
		.collect(Collectors.toMap(s->s.getName(), s->s));

for(String name : map.keySet()){
	System.out.println(name + " - " +map.get(name));
}
		
System.out.println("4. Stream의 size : Collectors.counting()");
long count= Stream.of(stuArr)
		.collect(Collectors.counting());
System.out.println("사이즈 " + count);
//		long count = Stream.of(stuArr)
//				.collect(Collectors.counting());
//		System.out.println("size: " + count);
		
//System.out.println("5. score의 합 : Collectors.summingInt()");
//int sumtotal = Stream.of(stuArr)
//		.collect(Collectors.summingInt(s -> s.getScore()));
//System.out.println("score 합계 : " + sumtotal);
//
		System.out.println("6. score의 합 : Collectors.reducing()");
//		int redtotal = Stream.of(stuArr)
//		//		.collect(Collectors.reducing(0, s -> s.getScore(), (a,b) -> a + b);
//											// 초기값, mapper, 계산 method
//				.collect(Collectors.reducing(10000, Student2::getScore,
//						Integer::sum));
//		System.out.println("score 합계 : " + redtotal);
int reducingTotal = Stream.of(stuArr)
				.collect(Collectors.reducing(1000, s->s.getScore(),(a,b)->a+b));
System.out.println("reduce 합계 : " + reducingTotal);


		
		System.out.println("7. score의 최소, 최대값 구하기 Collectors.minBy(). maxBy()");
//		Optional<Student2> stu = Stream.of(stuArr)
//		.collect(Collectors.minBy(
//				Comparator.comparingInt(s -> s.getScore())));
Optional<Student2> stu = Stream.of(stuArr).collect(Collectors.minBy(
		Comparator.comparingInt(s->s.getScore())
));
System.out.println("점수가 가장 낮은 학생 : " + stu.get());


		
		System.out.println("8. 학생이름 리스트 프린트하기 : Collectors.joining()");
//		String list = Stream.of(stuArr).map(Student2::getName)
//				.collect(Collectors.joining(",","{","}"));
//		System.out.println(list);
//
String joiningList = Stream.of(stuArr).map(Student2::getName)
		.collect(Collectors.joining("," , "{","}"));
System.out.println(joiningList);
	}

}


class Student2  {
	   String name;   
	   int ban;   
	   int eng;   
	   int math;
	   int kor;
	   int score;

	   Student2(String name, int ban, int eng, int math, int kor) { 
	      this.name =name;
	      this.ban =ban;
	      this.eng =eng;
	      this.math=math;
	      this.kor=kor;
	      score=eng+math+kor;   }

	   public String toString() { 
	       return String.format("[%s, %d, %d, %d, %d, %d]"
	             , name, ban, eng, math, kor, score).toString(); 
	   }

	   

	   public String getName() {
	      return name;
	   }

	   public void setName(String name) {
	      this.name = name;
	   }

	   public int getBan() {
	      return ban;
	   }

	   public void setBan(int ban) {
	      this.ban = ban;
	   }

	   public int getEng() {
	      return eng;
	   }

	   public void setEng(int eng) {
	      this.eng = eng;
	   }

	   public int getMath() {
	      return math;
	   }

	   public void setMath(int math) {
	      this.math = math;
	   }

	   public int getKor() {
	      return kor;
	   }

	   public void setKor(int kor) {
	      this.kor = kor;
	   }

	   public int getScore() {
	      return score;
	   }

	   public void setScore(int score) {
	      this.score = score;
	   }   
}