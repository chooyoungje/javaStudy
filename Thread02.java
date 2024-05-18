package lesson_0507;



// Runnable 인터페이스를 상속받아서 구현하기

class Runnable1 implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println(i+"="+Thread.currentThread().getName());
        }
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            
        }
    }
}

public class Thread02 {
    public static void main(String[] args) {
        System.out.println("main 스레드 시작");
        Runnable r = new Runnable1(); // 스레드 객체 아님
        Thread t1 = new Thread(r,"First");
        Thread t2 = new Thread(r,"Second");
        Thread t3 = new Thread(r,"Third");
        t1.start();
        t2.start();
        t3.start();
        System.out.println("main 스레드 종료");
        
        
        
    }
}
