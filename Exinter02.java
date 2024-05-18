package lesson_0425;

public class Exinter02 {
    public static void main(String[] args) {
        Tank t = new Tank();
        DropShip d = new DropShip();
        Marine m = new Marine();
        AsCenter as = new AsCenter();

        as.repair(t);
        as.repair(d);
        // as.repair(m);
    }
}



class Unit{
    int hp;
    final int MAX;
    public Unit(int hp){
        this.hp = hp;
        MAX = hp;
    }
}
interface Repairable{

}

class AsCenter{
    // 매개변수를 통해서 거른다
    void repair(Repairable repair){
        System.out.println(repair+ " 수리");
    };
}



class AirUnit extends Unit{
    public AirUnit(int hp){
        super(hp);
    }
}


class GroundUnit extends Unit{
    public GroundUnit(int hp){
        super(hp);
    }
}


class Tank extends GroundUnit implements Repairable{
    public Tank(){
        super(300);
    }

    @Override
    public String toString() {
        return "Tank";
    }
}

class DropShip extends AirUnit implements Repairable{
    public DropShip(){
        super(200);
    }
    @Override
    public String toString() {
        return "DropShip";
    }
}

class Marine{
    public String toString() {
        return "Marine";
    }
}



