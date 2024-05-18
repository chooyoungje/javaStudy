package lesson_0507;

/*
 * Thread 예제1
 * Thread 생성
 *   1. Thread 클래스 상속 =>ThreadEx1.java
 *
 */
/*
 * start() 기능
 * 1. 스택영역을 병렬화 함.
 * 2. 자신의 스택 영역에 run()메서드 호출
 */


class Thread1 extends  Thread{
    Thread1(String name){
        super(name);
    }
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(i + "=" +getName());
        }
        try {
            sleep((1000)); // 단위 : ms
        } catch (InterruptedException e){
            
        }
    }
}


public class Thread01 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main 스레드 시작");
        Thread1 t1 = new Thread1("First"); // 스레드 이름 정의
        Thread1 t2 = new Thread1("Second");
        t1.start();
        t2.start();
        // 문제점 : 스레드 2개가 번갈어가며 실행이된다

        System.out.println("main 스레드 종료");
        
    }
}
