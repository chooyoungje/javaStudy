package lesson_0507;

/*
 * Operator 인터페이스 예제 : apply 계열 추상 메서드 소유
 *   매개변수 있고, 리턴값도 존재. =>
 *    단 매개변수의 자료형과 리턴값의 자료형이 같다.
 *   Function 인터페이스의 하위 인터페이스임.
 *   result = op.applyAsInt(result, next);
 */

import java.util.function.IntBinaryOperator;

public class Lambda09 {
    private static Student[] list = {
            new Student("홍길동", 90, 80, "경영"),
            new Student("김삿갓", 95, 70, "컴공"),
            new Student("이몽룡", 100, 70, "수학")
    };

    public static void main(String[] args) {
        System.out.println("최대 수학 점수");
        int max = maxMath((a, b) -> (a >= b) ? a : b);
        System.out.println(max);
    }

    static int maxMath(IntBinaryOperator operator) {
        int result = 0;
        int value = list[0].getMath(); // 1번째 학생의 수학값 가져오기
        for (Student student : list) {
            result = operator.applyAsInt(value, student.getMath());
        }
        return result;
    }

}
//
//    public static void main(String[] args) {
//        System.out.println("최대 수학값");
//        int max = maxOrMinMath((a,b)-> (a>=b) ? a : b);
//        System.out.println(max);
//
//        System.out.println("최소 수학값");
//        int min = maxOrMinMath((a,b)-> (a<=b) ? a : b);
//        System.out.println(min);
//
//        System.out.println("수학 영어 평균값");
//        int avg = avgMathEng((a,b)-> (a+b)/2);
//        System.out.println(avg);
//
//    }
//    // BinaryOperator    => 두 개의 인자를 받고 그 인자의 타입으로 리턴
//    // IntBinaryOperator
//    static int maxOrMinMath(IntBinaryOperator op) {
//        int result = list[0].getMath();
//        for(Student s : list) {
//            result = op.applyAsInt(result, s.getMath());
//        }
//        return result;
//    };
//
//    static int avgMathEng(IntBinaryOperator op){
//        int result=0;
//        for(Student s : list){
//            result += op.applyAsInt(s.getMath(),s.getEng());
//        }
//        return result/ list.length;
//    };
//
//


