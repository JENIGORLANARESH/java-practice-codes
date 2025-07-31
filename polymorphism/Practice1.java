package polymorphism;

class Aaa{
    public void run(){
        System.out.println("In A class");
    }
}

class Bbb extends Aaa{
    public void run(){
        System.out.println("IN B class");
    }
}

public class Practice1 {
    public static void main(String[] args) {
        // Bbb b = new Bbb();
        // B.run();
        Aaa a = new Aaa();
        a.run();
    }
}
