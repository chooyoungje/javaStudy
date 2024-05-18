package lesson_0425;


// 다중 catch 구문 예제
// top -> down 으로 처리
//서로 상관없는 Exception은 상관이 없지만
//상속 관계의 Exception은 조상이 아래에 있어야 한다
public class Excp02 {
    public static void main(String[] args) {
        try {
            System.out.println(args[0]);
            System.out.println(Integer.parseInt("a"));
            System.out.println(10 / Integer.parseInt("0"));
            String str = null;
            System.out.println(str.charAt(0));

        } catch(Exception e) {
            e.printStackTrace(); // 시스템이 알려주는 메시지(빨간문장)으로 에러를 알려준다
        }
        // 다중 catch 구문
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println(e);
//        }catch (NumberFormatException e){
//            System.out.println(e);
//        }catch (ArithmeticException e){
//            System.out.println(e);
//        }catch (NullPointerException e){
//            System.out.println(e);
//        }

    }
}
