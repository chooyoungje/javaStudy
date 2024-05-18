package ch17_stream;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import ch17_stream.Student5.Level;

public class StreamEx25_Collect {

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
		
		System.out.println("1. 반별 리스트");
		Map<Integer, List<Student5>> stuBan =
				Stream.of(stuArr)
				.collect(Collectors.groupingBy(Student5::getBan));
		
		for(Integer it : stuBan.keySet()) {
			System.out.println(it + "반");
			for(Student5 s : stuBan.get(it)) {
				System.out.println(s);
			}
		}
		System.out.println();
		
		System.out.println("2. Level별 리스트");
		Map<Student5.Level, List<Student5>> stuLevel =
				Stream.of(stuArr)
				.collect(Collectors.groupingBy(s -> {
					if(s.getScore() >= 200) {
						return Student5.Level.HIGH;
					} else if(s.getScore() >= 100) {
						return Student5.Level.MID;
					} else {
						return Student5.Level.LOW;
					}
				}));
		
		TreeSet<Student5.Level> keySet = new  TreeSet<> (stuLevel.keySet());
		
		for(Level it : keySet) {
			System.out.println(it + "반");
			for(Student5 s : stuLevel.get(it)) {
				System.out.println(s);
			}
		}
		
		System.out.println("3. Level별 인원수");
		Map<Student5.Level, Long> stuLevelCount =
				Stream.of(stuArr)
				.collect(Collectors.groupingBy(s -> {
					if(s.getScore() >= 200) {
						return Student5.Level.HIGH;
					} else if(s.getScore() >= 100) {
						return Student5.Level.MID;
					} else {
						return Student5.Level.LOW;
					}
				}, Collectors.counting()));
		
		TreeSet<Student5.Level> keySet1 = new  TreeSet<> (stuLevel.keySet());
		
		for(Level it : keySet1) {
			System.out.println(it + "반" + stuLevelCount.get(it) + "명");
		}
		
		System.out.println("4. 학년별 반별 리스트");
		
		Map<Integer, Map<Integer, List<Student5>>> stuHakBan =
				Stream.of(stuArr)
				.collect(Collectors.groupingBy(Student5::getHak,
						Collectors.groupingBy(Student5::getBan)));
		
		for( Map<Integer, List<Student5>> hak : stuHakBan.values()) {
			for(List<Student5> ban : hak.values()) {
				System.out.println();
				for(Student5 s : ban) {
					System.out.println(s);
				}
			}
		}
		
		System.out.println("5. 학년 반 별 1등 학생 프린트 ");
		Map<Integer, Map<Integer, Optional<Student5>>> stuHakBanTop = 
				Stream.of(stuArr)
				.collect(Collectors.groupingBy(Student5::getHak,
						Collectors.groupingBy(Student5::getBan,
						Collectors.maxBy(
								Comparator.comparing(Student5::getScore)))));
		
		for(Map<Integer, Optional<Student5>> hak : stuHakBanTop.values()) {
			for(Optional<Student5> s : hak.values()) {
				System.out.println(s.get());
			}
		}
						
		
		System.out.println("6. 학년 반 별 평균");
		
		Map<Integer, Map<Integer, Double>> stuHakBanAvg = Stream.of(stuArr)
				.collect(Collectors.groupingBy(Student5::getHak,
						Collectors.groupingBy(Student5::getBan,
						Collectors.averagingDouble(Student5::getScore))
								));
		
		for(Entry<Integer, Map<Integer, Double>> hak : stuHakBanAvg.entrySet()) {
			System.out.println(hak.getKey() +"학년");
			for(Entry<Integer, Double> ban : hak.getValue().entrySet()) {
				System.out.println(ban.getKey() +"반 평균 :"+ban.getValue());
			}
		}
	}

}
