package polymorphism;

 class D {
    void run() {
        System.out.println(" D run");
    }
}

class B extends D {
    void run() {
        System.out.println("B run");
    }
}

class C extends D {
    void run() {
        System.out.println("C run");
    }
}

public class A {

     public static void main(String[] args) {
        D b = new B();
        b.run();
        D c = new C();
        c.run();
        C e = new C();
        e.run();
        
     }
}
