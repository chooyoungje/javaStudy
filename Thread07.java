package lesson_0507;


/*
 * 동기화 영역
 *   동기화 메서드 예제
 *   => 공유객체의 메서드여야 함.
 *   => 공유객체 : 모든 스레드가 하나의 객체를 공유하고 있어야 한다. */

public class Thread07 {
    public static void main(String[] args) {
        Printer ptr = new Printer();
        Thread t1 = new PrintThread3(ptr,'A');
        Thread t2 = new PrintThread3(ptr,'B');
        Thread t3 = new PrintThread3(ptr,'C');
        t1.start();
        t2.start();
        t3.start();
    }
}


class Printer{ // 모든 스레드가 공유할 객체
    public synchronized void printChar(char ch){  // 동기화 메소드
        for (int j = 0; j < 5; j++) {
            System.out.print(ch);
        }
        System.out.println();
    }

}

class PrintThread3 extends  Thread{
    char ch;
    Printer ptr;
    PrintThread3(Printer ptr, char ch){
        this.ptr = ptr;
        this.ch = ch;
    }

    static int[] lock = new int[3];
    @Override
    public void run() {
        // 이 부분만 블럭으로 만들어서 동기화하기
        for(int i=0;i<20;i++){
            ptr.printChar(ch);
            }
        }
}