package lesson_0425;

public class Exinter01 {
    public static void main(String[] args) {
        Animal a = new Dove();
        a.eat();

        // 인터페이스에 아무것도 쓰지않아도 instanceof 사용이 가능하다
        // 즉 인터페이스를 가지고 객체를 분류를 할 수 있다
        // 어떤 걸 실행할 지 나눌 수 있는 척도가 된다
        if(a instanceof Flyable){
            // Flyable f = (Flyable) a;
            System.out.println(a.name);
            // f.fly();
        }

        a = new Monkey();
        a.eat();

        if( a instanceof  Flyable){
           // ((Flyable) a).fly();
        }
    }
}

abstract class Animal{
    String name;
    public Animal(String name){
        this.name = name;
    }
    abstract void eat();
}

interface Flyable{
//    void fly();
}

class Dove extends Animal implements Flyable{
    public Dove(){
        super("Dove");
    }

//    @Override
//    public void fly(){
//        System.out.println(name+" 하늘을 날 수 있다");
//    };

    @Override
    public void eat(){
        System.out.println(name+" 곡물를 먹는다");
    };

}

class Monkey extends Animal{
    public Monkey(){
        super("Monkey");
    }

    @Override
    public void eat(){
        System.out.println(name+" 바나나를 먹는다");
    };
}