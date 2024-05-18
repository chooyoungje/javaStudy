package ch17_stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamEx13_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list = Arrays.asList(	         
			     new Student("홍길동", 55, 60, "컴공"),
		         new Student("이몽룡", 95, 90, "경영"),
		         new Student("김삿갓", 75, 80, "심리"),
		         new Student("임꺽정", 65, 70, "전자"),
		         new Student("성춘향", 65, 0, "컴공"));
		list.stream()
		.sorted()	// 기본방식 (Comparable)
		.forEach(System.out::println);
		
		System.out.println("영어 점수 역순으로 정렬하여 출력하기 : 람다방식");
		list.stream() // 추가방식 (Comparator)
		.sorted(new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o2.getEng() - o1.getEng();
			}
		})
		.forEach(System.out::println);
		
		System.out.println("수학 점수 역순(descending)으로 정렬하여 출력하기 : 람다방식");
		list.stream()
		.sorted((o1,o2) -> o2.getMath()- o1.getMath())
		.forEach(System.out::println);
		
		System.out.println();
		System.out.println("합계 점수 역순(descending)으로 정렬하여 출력하기 : 람다방식");
		list.stream()
		.sorted((o1,o2) -> (o2.getMath()+ o2.getEng())- (o1.getMath() + o1.getMath()))
		.forEach(System.out::println);
	}
}



class Student implements Comparable<Student>{
	 private String name;
	 private int eng;
	 private int math;
	 private String major;
	 
	@Override
    public int compareTo(Student o) {
		return name.compareTo(o.name);
	}
	Student() {
	}

	public Student(String name, int eng, int math, String major) {
	   this.name = name;
	   this.eng = eng;
	   this.math = math;
	   this.major = major;
	}

	public String getName() {
	   return name;
	}

	public void setName(String name) {
	   this.name = name;
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

	public String getMajor() {
	   return major;
	}

	public void setMajor(String major) {
	   this.major = major;
	}
	   
	@Override
	public String toString() {
		return "Student [name=" + name + ", eng=" + eng + ", math=" + math + ", major=" + major + "]";
	}
	   
	   
}