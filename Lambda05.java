package lesson_0507;



public class Lambda05 {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.method();
    }
}

/*
 * 람다식의 객체는 local inner Class 로 표현된다.
 */

class Outer{
    public int iv =10;
    void method(){
        int iv = 40;
        LambdaInterface5 f5 = () ->{
//            int iv = 50;
//            iv = 10;  method의 로컬 변수이기에 여기에서 수정이 불가능하다
            System.out.println("Outer.this.iv = "+Outer.this.iv); // 10
            System.out.println("this.iv = "+this.iv); // 10

            // Outer 클래스의 iv 멤버
            System.out.println("iv = "+iv); // 40
        };
        f5.method();
    }
}

interface LambdaInterface5{
    void method();
}