package ThreadsJava;

class Abc implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("A");
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
}

class Bbc implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("B");
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
}

public class JoinThread {
    public static void main(String[] args) throws Exception {
        Thread t1 = new Thread(new Abc());
        Thread t2 = new Thread(new Bbc());

        t1.start();
        t2.start();

        System.out.println(t1.isAlive());
        System.out.println(t2.isAlive());

        t1.join();
        t2.join();    
        System.out.println("Main method...");    // Waits until t1 and t2 joins main Thread

        System.out.println(t1.isAlive());
        System.out.println(t2.isAlive());

    }

}
