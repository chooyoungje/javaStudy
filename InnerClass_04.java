package lesson_0425;


import javax.swing.text.LabelView;

interface I{
    void test();
}

abstract class Abs{
    abstract void test();
}

public class InnerClass_04 {
    public static void main(String[] args) {
        // 인터페이스만으로는 객체생성이 불가능하지만 이렇게 하면 가능하다

        // 인터페이스를 상속받는 클래스를 즉석으로 만든다
        // 무명 클래스
        // 인터페이스를 상속하는 무명클래스를 만듬과 동시에 생성자를 써서 객체를 만들었다
        // 추상 클래스도 무명클래스를 사용하여 바로 쓸 수 있다
//        I i = new I() {
//            int iv = 100;
//            @Override
//            public void test() {
//                int iv = 10;
//                System.out.println("Interface I의 iv = "+iv);
//                System.out.println("this.iv = "+this.iv);
//                System.out.println("I를 상속받은 클래스의 test 메소드");
//            }
//        };

        I i = new I(){
            int iv = 300;
            @Override
            public void test(){
                int iv = 10;
                System.out.println("오버로드한 test 안에 있는 iv = " + iv);
                System.out.println("익명 클래의 인스턴수 변수로 있는 iv = "+this.iv);
            }
        };
        i.test();
        System.out.println("=================================================");
        // 람다식  익명함수를 사용하여 간단하게 표현한 식
        // 간단하게 표현하기 위헤 화살표를 이용한다
        I i2 = () -> {
            int iv =50;
            System.out.println("iv = "+ iv);
            System.out.println("람다");
        };

        i2.test();

        System.out.println("=================================================");
        // 무명클래스를 만들 때 무명 클래스 안에 있는 인스턴스 변수는 final 이여야 한다
        int iv = 200;
        // i++; final 변수여야 한다
        Abs a1 = new Abs() {
            @Override
            void test() {
                System.out.println("Abs iv = "+iv); // 지역변수 iv
                System.out.println("Abs 클래스를 상속받은 클래스의 test 메소드");
            }
        };
        a1.test();
    }
}

