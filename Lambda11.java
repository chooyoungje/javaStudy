package lesson_0507;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Lambda11 {

    private static List<Student2> list2 = Arrays.asList(
            new Student2("홍길동", "남자", 90),
            new Student2("김순희", "여자", 90),
            new Student2("감자바", "남자",  95),
            new Student2("박한나", "여자", 92)
    );

    public static void main(String[] args) {
        int maleAvg = avg((t -> t.getSex().equals("남자")));
        System.out.println("남자 평균 점수" + maleAvg);

        int femaleAvg = avg(t -> t.getSex().equals("여자"));
        System.out.println("여자 평균 점수" + femaleAvg);
    }
    // 매개변수 1개, 리턴 값 타입 = boolean
    static int avg(Predicate<Student2> predicate){
        int sum = 0;
        int cnt = 0;
        for(Student2 student2 : list2){
            if(predicate.test(student2)){
                cnt++;
                sum += student2.getScore();
            }
        }
        return sum/cnt;
    }

//    public static void main(String[] args) {
//        double maleAvg = avg(t -> t.getSex().equals("남자"));
//        System.out.println("남자 평균 점수" + maleAvg);
//        double femaleAvg = avg(t -> t.getSex().equals("여자"));
//        System.out.println("여자 평균 점수" + femaleAvg);
//    }
//
//    public static double avg(Predicate<Student2> predicate){
//        int count=0;
//        int sum = 0;
//        for(Student2 student2 : list2){
//            if(predicate.test(student2)){
//                count++;
//                sum+=student2.getScore();
//            }
//        }
//        return (double) sum / count;
//
//    }
}


/*
Predicate
매개값 조사해 true 또는 false를 리턴할 때 사용
*/

class Student2 {
    private String name;
    private String sex;
    private int score;

    public Student2(String name, String sex, int score) {
        this.name = name;
        this.sex = sex;
        this.score = score;
    }


    public String getSex() {
        return sex;
    }

    public int getScore() {
        return score;
    }

}