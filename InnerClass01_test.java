package lesson_0425;

public class InnerClass01_test {

    public static void main(String[] args) {
        Outer1 outer = new Outer1();
        Outer1.StaticInner outerStatic = new Outer1.StaticInner();
        System.out.println(outerStatic.num);
        System.out.println(outerStatic.iv);
        System.out.println(outerStatic.cv);
        System.out.println(outerStatic.MAX);
        System.out.println("===========================");

        Outer1.InstanceInner2 outerInstance= outer.new InstanceInner2();
        System.out.println(outerInstance.num);
        System.out.println(outerInstance.iv);
        System.out.println(outerInstance.cv);
        System.out.println(Outer1.InstanceInner2.MAX);

        System.out.println("===========================");



        outer.method();
    }

}


class Outer1{
    // 인스턴스 내부 클래스
    class InstanceInner2{
        static int num;
        int iv =100;
        static int cv = 10;
        final static int MAX = 200;
    }


    // 스태틱 내부 클래스
    static class StaticInner{
        static int num;
        int iv =300;
        static int cv = 400;
        final static int MAX = 500;
    }


    void method(){
        // 클래스 정의
        class LocalInner{
            int iv = 1000;
            static int cv = 2000;
            final static int MAX = 3000;
        }

        // 클래스 주소 할당 => 객체 생성
        LocalInner localIn = new LocalInner();
        System.out.println(localIn.iv);
        System.out.println(localIn.cv);
        System.out.println(localIn.MAX);
        System.out.println(LocalInner.MAX);
    }
}


