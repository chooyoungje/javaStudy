package lesson_0425;

public class Final02 {
    public static void main(String[] args) {
        FinalValue f1 = new FinalValue(200);
    }
}



class FinalValue{
    // final 은 무조건 한 번은 초기화를 해야한다
    final int NUM;  // 1.명시적 초기화
    {NUM = 300;}    // 2.초기화 블럭
    FinalValue(int num){
         // NUM = num; // 3. 생성자에서 한 번 변경 가능
    }

}