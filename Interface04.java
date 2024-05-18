package lesson_0425;

public class Interface04 {
    public static void main(String[] args) {
        Printerable able = PrinterManager.getPrinter("MySQL");
        able.print();
        able = PrinterManager.getPrinter("Oracle");
        able.print();

    }
}

interface Printerable{
    void print();
}

class PrinterManager{
    public static Printerable getPrinter(String type){
        if(type.equals("Oracle")) {
            return new InkZet();
        } else{
            return new LazerZet();
        }
    }
}

class InkZet implements  Printerable{
    @Override
    public void print(){
        System.out.println("Oracle print에서 출력");
    }
}

class LazerZet implements  Printerable{
    @Override
    public void print(){
        System.out.println("MySQL print에서 출력");
    }
}




