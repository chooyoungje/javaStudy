package lesson_0507;


/*
 * Supplier 인터페이스 예제
 * 매개변수는 없고, 리턴값은 존재
 */

import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class Lambda07 {
    public static void main(String[] args) {
//        Supplier<String> s1 = () -> "java";
//        System.out.println(s1.get());
        // 내가 직접 타입을 지정해주는 경우
        Supplier<String> s1 = () -> "java";
        System.out.println(s1.get());
//        //
        // 미리 만들어져 있느 걸 가져다 쓰는 경우
        IntSupplier s2 = ()-> 1004;
        System.out.println(s2.getAsInt());
//        IntSupplier s2 = () -> (int)(Math.PI);
//        System.out.println("파이 값 정수 = " +s2.getAsInt());
//        //

        DoubleSupplier s3 = () -> Math.PI;
        System.out.println(s3.getAsDouble());
//        DoubleSupplier s3 = () -> Math.PI;
//        System.out.println("파이값 실수 = "+ s3.getAsDouble());


    }
}
