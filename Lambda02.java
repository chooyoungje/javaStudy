package lesson_0507;

public class Lambda02 {
    public static void main(String[] args) {

        System.out.println("main 시작");
        Runnable r0 = new Runnable() {
            @Override
            public void run() {
                int sum=0;
                for(int i=0;i<10;i++){
                    sum+=i;
                }
                System.out.println("1~10 까지 합 : "+sum);
            }
        };
        
        
        Runnable r1 = ()->{
            int sum=0;
            for(int i=0;i<10;i++){
                sum+=i;
            }
            System.out.println("1~10 까지 합 : "+sum);
        } ;
        Thread t = new Thread(r1);
        
        Thread t2 = new Thread(()->{
            int sum=0;
            for(int i=0;i<10;i++){
                sum+=i;
            }
            System.out.println("1~10 까지 합 : "+sum);
        });
        t.start();
        t2.start();
        System.out.println("main 종료");
        
    }
}
