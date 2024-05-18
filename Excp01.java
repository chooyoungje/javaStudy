package lesson_0425;


/*
 * 예외처리   에러가 나도 프로그램이 정상적으로 끝나게 해줌
 * try 블럭: 예외가 발생할 가능성이 있는 문장들.
 *          예외가 발생한 경우 제어 catch 블럭으로 이동.
 * catch블럭 : 예외가 발생하면 호출되는 블럭
 *           예외가 발생되면, 예외는 잡고, 정상적으로 실행을 함.
 *           try 블럭과 함께 사용 해야함.
 */

public class Excp01 {
    public static void main(String[] args) {

    try{
        System.out.println(2);
        System.out.println(1/0); // ArithmeticException 발생
        System.out.println(3);
        System.out.println(4);
    }catch (Exception e){
        System.out.println(e.getMessage());
    }
        System.out.println(5);

    }
}

