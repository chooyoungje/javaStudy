package lesson_0507;

// 아들이 돈을 계속 빼내가다 잔액이 0이되면 wait
// 엄마가 돈을 넣으면 notify로 아들 깨우기

public class Thread10 {
    public static void main(String[] args) {
        Account acc = new Account();
        Thread mother = new Mother(acc);
        Thread son = new Son(acc);
        son.start();
        mother.start();
    }

}

// 스레드가 공유하는 클래스(객체)
class Account{
    int money ;//잔액
    // 출금
    synchronized void output(){
        while(money ==0){
            try {
                wait();
            }catch (InterruptedException e){
                
            }
        }
        notifyAll(); // wait() 상태인 스레드 모두 Runnable 상태로 변환
        System.out.println(Thread.currentThread().getName() + " : " + money+"원 출금");
        money = 0;
    }
    // 입금
    synchronized void input(){
        while(money >0){
            try {
                wait(); // 엄마 스레드가 wait
            } catch (InterruptedException e){
                
            }
        }
        money = ((int)(Math.random()*3)+1) * 10000;
        notifyAll();
        System.out.println(Thread.currentThread().getName() + " : " + money+"원 입금");
    }
}


class Mother extends  Thread{

    Account acc;
    Mother(Account acc){
        super("엄마스레드");
        this.acc = acc;

    }
    @Override
    public void run() {
        for(int i=0;i<20;i++){
            acc.input();
        }
        try {
            sleep((int)(Math.random()*3000));
        } catch (InterruptedException e){

        }

    }
}
class Son extends  Thread{
    Account acc;
    Son(Account acc){
        super("아들스레드");
        this.acc = acc;

    }
    @Override
    public void run() {
        for(int i=0;i<20;i++){
            acc.output();
        }
        try {
            sleep((int)(Math.random()*1000));
        } catch (InterruptedException e){

        }
    }
}