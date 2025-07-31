package innerclasses;

abstract class InnerAbb {
    public abstract void run();
    public abstract void walk();

}

// class Dd extends InnerAbb{

// }

class Cc{
    void display(){
        System.out.println("hello in Cc...");
    }
}

public class Abb {
    public static void main(String[] args) {
        Cc obj = new Cc(){
            void display(){
                System.out.println();
                System.out.println("Anonymous inner class.....");
            }
        };
        obj.display();

        InnerAbb obj1 = new InnerAbb() {
            public void run(){
                System.out.println("Abstract Anonymous inner class..");
            }
            public void walk(){
                System.out.println("walking...");
            }
        };
        obj1.run();
        obj1.walk();

    }
}
