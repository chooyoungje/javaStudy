package lesson_0507;


/* 표준 API
 * Java API 함수적 인터페이스 예제 : Consumer 인터페이스
 * 매개변수가 있고, 리턴값은 없는 경우 */

import java.util.function.*;

public class Lambda06 {
    public static void main(String[] args) {
        //
//        Consumer<String> c1 = t-> System.out.println(t+8);
//        c1.accept("java");
        Consumer<String> c01 = t -> System.out.println(t+"Consumer String");
        c01.accept("test");

        Consumer<Integer> c02 = t -> System.out.println(t*10);
        c02.accept(10);
        IntConsumer  c03 = t -> System.out.println(t*100);
        c03.accept(20);

        //
//        BiConsumer<String,String> c2 = (t,u) ->{
//            System.out.println(t+u);
//        };
//        c2.accept("6","2");

        BiConsumer<String, Integer> bi01 = (t, u) -> {
            System.out.println("매개변수 1 : "+t);
            System.out.println("매개변수 2 : " + u);
        };
        bi01.accept("자바", 80);
        //
//        DoubleConsumer c3 = d-> System.out.println("DoubleConsumer : "+d);
//        c3.accept(1.4);


        DoubleConsumer c04 = d -> System.out.println("Doble" + d);
        c04.accept(0.14);
        //
        ObjIntConsumer<String> c4 = (t,i) -> System.out.println(t+i);
        c4.accept("String 매개변수, Integer = ",14);
        //
        IntConsumer c5 = x->{
            int sum=0;
            for(int i=0;i<x;i++){
                sum +=i;
            }
            System.out.println("1부터"+ x+ "까지의 합 ="  +sum);
        };
        c5.accept(10);
        c5.accept(100);

    }


}
