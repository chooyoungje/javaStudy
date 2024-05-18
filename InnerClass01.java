package lesson_0425;

public class InnerClass01 {
    public static void main(String[] args) {
        Outer01.StaticInner si = new Outer01.StaticInner();
        System.out.println(si.iv);
        System.out.println(Outer01.StaticInner.cv);
        System.out.println(Outer01.StaticInner.MAX);

        // Outer01.InstanceInner si = new Outer01.InstanceInner();
        Outer01.InstanceInner iil = (new Outer01()).new InstanceInner();

        Outer01 outer = new Outer01();
        Outer01.InstanceInner ii2= outer.new InstanceInner();

        System.out.println(ii2.iv);
        System.out.println("Outer01.InstanceInner.cv : "+ Outer01.InstanceInner.cv);
        System.out.println("Outer01.InstanceInner.MAX : "+ Outer01.InstanceInner.MAX);
        outer.method();

    }
}

/*
 * 내부 클래스
 *
 *  인스턴스 내부클래스 :  (static)클래스 멤버를 가질 수 있다.
 *  static 내부클래스 : (static)클래스 멤버를 가질 수 있다.
 *  지역내부클래스        : 메서드 내에 선언된 클래스. 메서드 내부에서만 사용이 가능함.
 *  이름없는(무명의 익명)내부클래스 : 클래스 없이 객체화 가능한 클래스
 *                        추상클래스,인터페이스 의 객체화 가능함.
 * 익명 클래스는 부모 클래스의 자원을 일회성으로 재정의하여 사용하기 위한 용도 인 것이다.
 */

// 클래스 안에 있는 클래스를 내부 클래스라고 한다
// 클래스는 주소를 만들어야지 사용가능 => 객체를 만들어야 사용가능
//
class Outer01{
    class InstanceInner{  // 인스턴스 내부클래스, 주소없이 바로 사용 못함
        static int num;
        int iv = 100;
        static int cv = 10;
        final static int MAX = 200;
    }

    static class StaticInner{ // static 내부 클래스, 주소 없이 바로 사용 가능
        static int num;
        int iv = 300;
        static int cv = 400;
        final static int MAX = 500;
    }
    void method(){
        class LocalInner{ // 지역 내부 클래스
            int iv = 100;
            static  int cv = 600;
            final static int MAX = 700;
        }
        LocalInner lc  = new LocalInner();
        System.out.println(lc.iv);
        System.out.println(lc.MAX);
        System.out.println(LocalInner.MAX);
        System.out.println(LocalInner.cv);
    }

    void method2(){
        InstanceInner i = new InstanceInner();
        // 이건 가능
        //  LocalInner i = new LocalInner(); 이걸 불가능
    }
}
