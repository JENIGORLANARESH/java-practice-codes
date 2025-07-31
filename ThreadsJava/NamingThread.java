package ThreadsJava;

class Name extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        for (int i = 0; i < 3; i++) {
            System.out.println(" i = " + i);
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class NamingThread {
    public static void main(String[] args) {
        System.out.println("********main*************");
        Thread t1 = new Thread(new Name());
        Thread t2 = new Thread(new Name());
        t1.setName("First");
        t2.setName("Second");
        t1.setPriority(10);
        t2.setPriority(3);

        t1.start();
        t2.start();
    }
}
