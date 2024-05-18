package lesson_0425;


/*
final 제어자 : 변경 불가의 의미.
final 클래스 : 상속 불가 클래스.
             다른 클래스의 부모클래스 불가.
             String 클래스가 final 클래스임.
*/

public class Final01 {

}

class FinalClass{
    final void finalMethod(){
        System.out.println("파이널 메소드는 오버라이딩 불가");
    }
}

class SubMethod extends FinalClass{
//    final void finalMethod(){
//        System.out.println("파이널 메소드는 오버라이딩 불가");
//    }
}

