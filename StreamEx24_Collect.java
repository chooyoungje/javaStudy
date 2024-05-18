package ch17_stream;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx24_Collect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student5[] stuArr = {
	            new Student5("나자바", true,  1, 1, 300),   
	            new Student5("김지미", false, 1, 1, 250),   
	            new Student5("김자바", true,  1, 1, 200),   
	            new Student5("이지미", false, 1, 2, 150),   
	            new Student5("남자바", true,  1, 2, 100),   
	            new Student5("안지미", false, 1, 2,  50),   
	            new Student5("황지미", false, 1, 3, 100),   
	            new Student5("강지미", false, 1, 3, 150),   
	            new Student5("이자바", true,  1, 3, 200),   
	            new Student5("나자바", true,  2, 1, 300),   
	            new Student5("김지미", false, 2, 1, 250),   
	            new Student5("김자바", true,  2, 1, 200),   
	            new Student5("이지미", false, 2, 2, 150),   
	            new Student5("남자바", true,  2, 2, 100),   
	            new Student5("안지미", false, 2, 2,  50),   
	            new Student5("황지미", false, 2, 3, 100),   
	            new Student5("강지미", false, 2, 3, 150),   
	            new Student5("이자바", true,  2, 3, 200)   
				};
		
		System.out.println("1. Map<Boolean, List<Generic>> Collectors.partitioningBy()");
		
		Map<Boolean, List<Student5>> stu =
				Stream.of(stuArr)
				.collect(Collectors.partitioningBy(s -> s.isMale));
		
		System.out.println("남학생 리스트");
		stu.get(true).stream().forEach(System.out::println);
		System.out.println("여학생 리스트");
		stu.get(false).stream().forEach(System.out::println);
		
		
		System.out.println("2. Collectors.partitioningBy(Key, 집계(counting))");
		Map<Boolean, Long> stuCount = Stream.of(stuArr)
				.collect(Collectors.partitioningBy(
						s -> s.isMale, Collectors.counting()));
		System.out.println("남학생수: " + stuCount.get(true));
		System.out.println("여학생수: " + stuCount.get(false));
		
		System.out.println("3. Collectors.partitioningBy(Key, 집계(1등))\" ");
		Map<Boolean, Optional<Student5>> stuTopScore = 
		Stream.of(stuArr)
		.collect(Collectors.partitioningBy(s -> s.isMale(),
		Collectors.maxBy(Comparator.comparingInt(Student5::getScore))));
		
		System.out.println("남학생 1등 : " + stuTopScore.get(true).get());
		System.out.println("여학생 1등 : " + stuTopScore.get(false).get());
	
		System.out.println("3. Collectors.partitioningBy(Key, 집계(합불))\" ");
		Map<Boolean, Map<Boolean, List<Student5>>> stuFail = 
		Stream.of(stuArr)
		.collect(Collectors.partitioningBy(s -> s.isMale,
				Collectors.partitioningBy(s -> s.getScore() <= 100)));
		System.out.println("남자 불합격 리스트");
		stuFail.get(true).get(true).stream().forEach(System.out::println);
		System.out.println("여자 불합격 리스트");
		stuFail.get(false).get(true).stream().forEach(System.out::println);
		
		System.out.println("남자 합격 리스트");
		stuFail.get(true).get(false).stream().forEach(System.out::println);
		System.out.println("여자 합격 리스트");
		stuFail.get(false).get(false).stream().forEach(System.out::println);
		
	}
}
class Student5 {
		   String name;
		   boolean isMale; // 성별
		   int hak;      // 학년
		   int ban;      // 반
		   int score;

		   Student5(String name, boolean isMale, int hak, int ban, int score) { 
		      this.name   = name;
		      this.isMale   = isMale;
		      this.hak   = hak;
		      this.ban   = ban;
		      this.score  = score;
		   }

		   String   getName()  { return name;}
		   boolean isMale()   { return isMale;}
		   int      getHak()   { return hak;}
		   int      getBan()   { return ban;}
		   int      getScore() { return score;}

		   public String toString() { 
		      return String.format("[%s, %s, %d학년 %d반, %3d점]", name, isMale ? "남":"여", hak, ban, score); 
		   }

		   enum Level {
		      HIGH, MID, LOW
		   }
}