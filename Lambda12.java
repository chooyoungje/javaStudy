package lesson_0507;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Lambda12 {
    private static List<Student> list3 = Arrays.asList(
            new Student("홍길동", 55, 60, "컴공"),
            new Student("이몽룡", 95, 90, "경영"),
            new Student("김삿갓", 75, 80, "심리"),
            new Student("임꺽정", 65, 70, "전자"),
            new Student("성춘향", 65, 0, "컴공"));

    public static void main(String[] args) {
        System.out.println("영어 점수가 70점 이상인 학생의 평균");
        System.out.print(engAvg(s -> s.getEng() >=70 ));
        System.out.println();

        System.out.println("컴공과 학생의 영어 점수 평균");
        System.out.print(engAvg2(s -> s.getMajor().equals("컴공")));
        System.out.println();

        System.out.println("컴공과가 아닌 학생의 영어 점수 평균");
        System.out.print(engAvg2(s -> !s.getMajor().equals("컴공")));
        System.out.println();

    }

    static int engAvg2(Predicate<Student> pr){
        int sum = 0;
        int cnt =0;
        for(Student st : list3){
            if(pr.test(st)){
                sum+=st.getEng();
                cnt++;
            }
        }
        return sum/cnt;

    }
    static int engAvg(Predicate<Student> pr){
        int sum = 0;
        int cnt = 0;
        for(Student student : list3){
            if(pr.test(student)){
                sum+=student.getEng();
                cnt++;
            }
        }
        return sum/cnt;

    }
}
//        System.out.print("영어 점수가 60점 이상인 학생의 영어 평균");
//        System.out.print(avg1(s -> s.getEng() >=60)); // return 이 boolean 타입, 매개변수 1개
//        System.out.println();
//
//        System.out.print("수학 점수가 60점 이상인 학생의 수학 평균");
//        System.out.print(avg2(s -> s.getMath() >=60));
//        System.out.println();
//
//
//        System.out.print("컴공과인 학생의 영어 평균");
//        System.out.print(avg1(s -> s.getMajor().equals("컴공"))); // return 이 boolean 타입, 매개변수 1개
//        System.out.println();
//
//        System.out.print("컴공과가 아닌 학생의 영어 평균");
//        System.out.print(avg1(s -> !s.getMajor().equals("컴공")));
//        System.out.println();
//
//        System.out.print("컴공과인 학생의 이름 리스트 ");
//        System.out.print(avg3(s -> s.getMajor().equals("컴공"))); // return 이 boolean 타입, 매개변수 1개
//        System.out.println();
//
//        System.out.print("컴공과가 아닌 학생의 이름 리스트 ");
//        System.out.print(avg3(s -> !s.getMajor().equals("컴공")));
//        System.out.println();


//    public static double avg1(Predicate<Student> predicate){
//        int sum = 0;
//        int count=0;
//        for(Student s : list3){
//            if(predicate.test(s)){
//                sum += s.getEng();
//                count++;
//            }
//        }
//        return (double)sum/count;
//
//    }
//    public static double avg2(Predicate<Student> predicate){
//        int sum = 0;
//        int count=0;
//        for(Student s : list3){
//            if(predicate.test(s)){
//                sum += s.getMath();
//                count++;
//            }
//        }
//        return (double)sum/count;
//    }
//
//
//    public static String avg3(Predicate<Student> predicate){
//        String nameList ="";
//        for(Student st : list3){
//            if(predicate.test(st)){
//                nameList += st.getName()+", ";
//            }
//        }
//        return nameList;
//    }

