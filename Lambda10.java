package lesson_0507;

/*Operator 함수적 인터페이스
매개값과 리턴값이 모두 있는 추상 메소드 가짐
주로 매개값을 연산하고 그 결과를 리턴할 경우에 사용
매개 변수의 타입과 수에 따라 분류*/


import java.util.function.IntBinaryOperator;

public class Lambda10 {
    private static int[] scores = {92,95,97};

    public static void main(String[] args) {
        int max = maxOrMin((a,b)-> (a>=b) ? a : b);
        System.out.println("최댓값" + max);
    }
    public static int maxOrMin(IntBinaryOperator operator){
        int result = scores[0];
        for(int score : scores){
            result = operator.applyAsInt(result,score);
        }
        return result;
    }

}
