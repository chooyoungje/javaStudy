package lesson_0507;


import java.util.function.Function;
import java.util.function.ToIntFunction;

/*
 * Function 계열 함수 인터페이스 : applyXXX  추상메서드를 멤버로 가진다.
 * 매개변수도 있고, 리턴값도 존재.
 * 주로 매개값을 리턴값으로 매핑(타입 변환)할 경우 사용
 * Function<Parameter,Return> : 매개변수 : Parameter, 리턴타입 : Return
 * 함수를 변수에 할당하고 이를 넘겨주거나 하는 동작이 가능해졌다.
Function.apply도 이의 일환으로 자바 8에서 함께 도입된 것으로,
* 이 인터페이스를 이용하면 변수로 넘겨진 함수를 이후에 apply 메서드를 통해 적용가능하다
 */

public class Lambda08 {
    private static Student[] list = {
            new Student("홍길동", 90, 80, "경영"),
            new Student("김삿갓", 95, 70, "컴공")
    };

    public static void main(String[] args) {
        System.out.println("학생의 이름");
        printString(t -> t.getName());
    }
//        System.out.println("전공 이름");
//        printString(t -> t.getMajor());


//        System.out.println("수학 점수");
//        printInt(t -> t.getMath());
//
//        System.out.println("수학 점수 총합");
//        printTot(t -> t.getMath());
//
//        System.out.println("수학 점수 평균");
//        printAvg(t -> t.getMath());

    static void printString(Function<Student, String> fn){
        for(Student student : list){
            System.out.print(fn.apply(student)+", ");
            // fn.pply() 괄호 안 매개변수 타입 = Student
            // String 타입을 반환 => fn.apply(student)의 결과
        }
        System.out.println();
    }


//        printString(new Function<Student, String>() {
//            @Override
//            public String apply(Student student) {
//                return student.getName();
//            }
//        });
    }
    //                             이걸로 받아서, 이걸로 리턴해라
//    static void printString(Function<Student,String> f){
//        for(Student s : list){
//            System.out.print(f.apply(s)+", "); // ???
//        }
//        System.out.println();
//    }
//
//    static void printInt(ToIntFunction<Student> f){
//        for(Student s : list){
//            System.out.print(f.applyAsInt(s)+", ");
//        }
//        System.out.println();
//    }
//
//    static void printTot(ToIntFunction<Student> f){
//        int sum = 0;
//        for(Student s : list){
//            sum+= f.applyAsInt(s);
//        }
//        System.out.println(sum);
//    }
//
//    static void printAvg(ToIntFunction<Student> f){
//        int sum = 0;
//        for(Student s:list){
//            sum+= f.applyAsInt(s);
//        }
//        int avg = sum / list.length;
//        System.out.println(avg);
//    }



class Student {
    private String name;
    private int eng;
    private int math;
    private String major;

    public Student(String name, int eng, int math, String major) {
        this.major = major;
        this.math = math;
        this.eng = eng;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getEng() {
        return eng;
    }

    public int getMath() {
        return math;
    }

    public String getMajor() {
        return major;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
