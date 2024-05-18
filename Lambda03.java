package lesson_0507;

public class Lambda03 {
    public static void main(String[] args) {
        LambdaInterface3 f3;
        f3 = (x) -> System.out.println(x * 5);
        f3.method(2);
        f3.method(10);

        f3 = (x) -> System.out.println(x + x);
        f3.method(10);

        f3 = (x) -> System.out.println(x * 3);
        f3.method(10);

        LambdaInterface3 f4 = new LambdaInterface3() {
            @Override
            public void method(int x) {
                System.out.println(x);
            }
        };
        excute(x -> print(x), 3); // ???
    }

    static void excute(LambdaInterface3 f3, int num) {
        f3.method(num);
    }

    static void print(int x) {
        System.out.println(x + 3);
    }
}

interface LambdaInterface3 {
    void method(int x);
}
