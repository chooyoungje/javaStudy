package ch17_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamEx11_FlatMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student3> studentList1 = Arrays.asList(
	            new Student3("홍길동", 10),new Student3("강나라", 20),
	            new Student3("장일동", 30));
	    List<Student3> studentList2 = Arrays.asList(
	            new Student3("나자바", 10),new Student3("신용권", 20),
	            new Student3("유미선", 30));
	    
	    List<List<Student3>> stu = new ArrayList<List<Student3>>();
	    stu.add(studentList1);
	    stu.add(studentList2);
	    
	    long sum = stu.stream()
	    // .flatMap(s -> s.stream())
	    .flatMap(List::stream)
	    // .mapToInt(s -> s.getScore())
	    .mapToInt(Student3::getScore)
	    .sum();
	    System.out.println(sum);

	}

}
