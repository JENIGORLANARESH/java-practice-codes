package ThreadsJava;

class Priority extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}

public class PriorityThread {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("***************main************");
        Priority t1 = new Priority();
        Priority t2 = new Priority();
        Priority t3 = new Priority();

        t1.setName("t1thread..");
        t2.setName("t2thread..");
        t3.setName("t3thread..");

        // t1.setPriority(1);
        t2.setPriority(5);
        t1.setPriority(8);
        t3.setPriority(10);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t3.getPriority());

       
        t1.start();
        // t1.join();
        t2.start();
        // t2.join();
         t3.start();
        
    }
}
