package ch17_stream;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class StreamEx09_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student3> studentList = Arrays.asList(
	            new Student3("홍길동", 10),
	            new Student3("신용권", 20),
	            new Student3("유미선", 30)
	      );
		
//		studentList.stream()
//		.mapToInt(Student3 :: getScore)
//		.forEach(score -> System.out.println(score));
		System.out.println("학생들의 점수 : ");
		studentList.stream()
				.mapToInt(Student3::getScore)
				.forEach(s -> System.out.println(s));
	}
}

class Student3{
	String name;
	int score;
	
	public Student3(String name, int score) {
		super();
		this.name = name;
		this.score =score;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
}