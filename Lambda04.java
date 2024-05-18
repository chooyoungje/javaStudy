package lesson_0507;


/*
 * 매개변수도 있고, 리턴값도 있는 경우. Function<T,R> = R apply(T, t)
 * 람다식 내부에 실행되는 구문이 한개인 경우 { } 생략 가능
 * 람다식 내부에 실행되는 구문이 한개인 경우 return 생략 가능
 */
@FunctionalInterface
interface LambdaInterface4 {
    int method(int x, int y);
}
public class Lambda04 {
    public static void main(String[] args) {
        LambdaInterface4 f4 = (x,y) -> {
            return x * y;
        };
        System.out.println("두 수의 곱 = "+f4.method(2,5));

        f4 = (x,y) -> {
            return x+y;
        };
        System.out.println("두 수의 합 = "+ f4.method(3,4));

        f4 = (x,y) ->{
            return  x/y;
        };
        System.out.println("나누기 = "+f4.method(6,2));

        f4= (x,y)->{
            return x%y;
        };
        System.out.println("두 수의 나머지 = " + f4.method(6,2));

        f4=(x,y)->{
            return (x >y) ? x : y;
        };
        System.out.println("두 수 중에서 큰 수 = "+f4.method(15,24));

        f4 = (x,y) ->{
            return (x<y) ? x : y;
        };
        System.out.println("두 수중에서 작은 수" + f4.method(12,4));

        excute((x,y)-> sum(x,y), 33,11);
    }
    static int sum(int x, int y){
        return x+y;
    }
    static void excute(LambdaInterface4 f4, int x, int y){
        System.out.println(f4.method(x,y));
    }
}
