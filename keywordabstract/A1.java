package keywordabstract;

abstract class Bus {
    private String msg;
    private int num;

    Bus(String msg) {
        this.msg = msg;
    }
    Bus(String msg, int num){
        this.msg = msg;
        this.num = num;
    }

    void display() {
        System.out.println(msg);
        System.out.println(num);
    }
}

class Car extends Bus {
    Car(){
        super("hello");
    }

    Car(String msg) {
        super(msg);
    }
    Car(String msg,int num){
        super(msg,num);
    }

}

public class A1 {
    public static void main(String[] args) {
        Car obj = new Car("naresh jenigorla.....");
        obj.display();
        Car obj1 = new Car("hello ", 22);
        obj1.display();
    }
}
