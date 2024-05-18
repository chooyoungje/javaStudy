package lesson_0507;

public class Lambda01 {
    public static void main(String[] args) {
        // 기존 방식으로 코딩
        LambdaInterface1 fi = new LambdaInterface1() {
            @Override
            public void method() {
                System.out.println("기존 방식으로 코딩");
            }
        };
        fi.method();
        //
        fi = () -> {
            String str2 = "2) 람다를 쓴 방식";
            System.out.println(str2);
        };
        fi.method();
        //
        fi = () ->{
            String str3 = "3) 메소드 재정의";
            System.out.println(str3);
        };
        fi.method();
        execute(()->{
            System.out.println("람다인터페이스 파라미터를 이용한 방식");
        });
    }


    static void execute(LambdaInterface1 fi){
        fi.method();
    }

}


@FunctionalInterface
interface LambdaInterface1{
    void method();
}
