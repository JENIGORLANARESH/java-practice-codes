package ThreadsJava;

class Ab implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("....A....");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class Bb implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("....B....");
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class RunnableEx1 {
    public static void main(String[] args) throws InterruptedException {
        Ab obj = new Ab();
        Bb obj2 = new Bb();
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();

        // System.out.println(t1.getName());
        // System.out.println(t2.getName());
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.join();
        t2.join();
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
    }
}
