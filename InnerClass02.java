package lesson_0425;

public class InnerClass02 {
    public static void main(String[] args) {
        Outer02 o = new Outer02();
        o.method(0);
    }
}


class Outer02{
    private static int outercv = 20;
    private int outeriv = 10;
    void method(final int pv){
        final int i = 0;
        // i 를 바꾸면 오류가 생김
        outeriv++;
        outercv++;
        class LocalInner{
            int liv = outeriv;
            int liv2 = outercv;
            void method(){
                // 지역 내부클래스에서 내부클래스가 속한 메소드의 지역변수 변경은 안 됨
                // i = 100;
                System.out.println("i="+i);
                System.out.println("pv="+pv);
                System.out.println(liv + "," + liv2);
                System.out.println(outeriv + "," + outercv);
                //외부클래스의 private 멤버 접근 가능
            }
        }
        LocalInner l = new LocalInner();
        l.method();
    }
}