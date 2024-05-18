package lesson_0507;



public class Thread08 {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Thread son = new Thread(atm,"아들");
        Thread daughter = new Thread(atm,"딸");
        son.start();
        daughter.start();

    }
}


class ATM implements Runnable{
    private int money = 100000;
    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(1);
            }catch (InterruptedException e){

            }
            if(money<=0){
                break;
            }
            withdraw();
        }
    }
    synchronized void withdraw(){
        if(money<=0){
            return;
        }
        money -=10000;
        System.out.println(Thread.currentThread().getName() + "10000 출금. 잔액 : " + money);
    }
}
