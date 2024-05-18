package lesson_0507;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream03 {
    private static List<Student3> list = Arrays.asList(new Student3("홍길동", 55, 60, "정공"), new Student3("이몽정", 95, 90, "경영"), new Student3("김삿갓", 75, 80, "심리"), new Student3("임꺽정", 65, 70, "전자"), new Student3("성춘향", 65, 0, "정공"));

    public static void main(String[] args) {
        Stream<Student3> st1 = list.stream();

        st1
                .filter(s -> s.getEng() >= 60)
                .map((s) -> s.getName())
                .forEach(s -> System.out.println(s));
        System.out.println("============================");

        Stream<Student3> st2 = list.stream();
        int tot = 0;
        st2
                .filter(s -> s.getEng() >= 60)
                .map((s) -> s.getEng())
                .peek(s -> System.out.println(s));// 최종처리 전 프린트할 수 있게 해준다

        // .reduce((a,b) -> a + b)
        // .get();
        System.out.println(tot);


    }
}

class Student3 {
    private String name;
    private int eng;
    private int math;
    private String major;

    Student3() {
    }

    public Student3(String name, int eng, int math, String major) {
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

}