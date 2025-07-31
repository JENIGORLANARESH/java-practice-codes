package ThreadsJava;

class A extends Thread {
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("in A. after i = " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("in B. after i = " + i);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class C extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("C");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class D extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("D");
            try{Thread.sleep(1000);}catch(Exception e){System.out.println(e);}
        }
    }
}

public class Threads {
    public static void main(String[] args) {
        // A obj1 = new A();
        // B obj2 = new B();

        // obj1.start();
        // obj2.start();

        C obj3 = new C();
        D obj4 = new D();

        obj3.start();
        obj4.start();

    }
}
