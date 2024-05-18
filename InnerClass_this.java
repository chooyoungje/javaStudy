package lesson_0425;

public class InnerClass_this {
    public static void main(String[] args) {
//        Outer03 out3 = new Outer03();
//        Outer03.InstanceInner ii = out3.new InstanceInner();
//        ii.method();


    }
}

class Outer03{
    int iv = 30;
    int iv2 = 20;

    class InstanceInner{
        int iv = 100;
        void method(){
            int iv = 300;
            System.out.println(iv);
            System.out.println(this.iv);
            System.out.println(Outer03.this.iv2);
        }
    }
}
