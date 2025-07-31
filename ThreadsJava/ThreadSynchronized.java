package ThreadsJava;

class Increment {
    int count;

    public synchronized void increment() {        // after using synchronized only one threa can use this method at a time
        count++;
    }
}

public class ThreadSynchronized {
    public static void main(String[] args) throws Exception {
        Increment c = new Increment();

        Thread t1 = new Thread( () -> {
                for (int i = 1; i <= 1000; i++) {
                    c.increment();
                }        
        });

        Runnable r = new Runnable() {
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    c.increment();
                }
            }
        };
        
        Thread t2 = new Thread(r);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(c.count);
    }
}
