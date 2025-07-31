package ThreadsJava;

class Sleeps extends Thread {
    public void run(){
        for(int i = 0; i < 5; i++){
        // try{
        //     Thread.sleep(1000);
        // }catch(InterruptedException e){
        //     System.out.println(e);
        // }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
        System.out.println(i);
    }
    }
}

public class Sleeping {
    public static void main(String[] args) throws InterruptedException {
        Sleeps obj  = new Sleeps();
        Sleeps obj2 = new Sleeps();
        obj.start();
        // try {
        //     Thread.sleep(500);
        // } catch (InterruptedException e) {
          
        //     e.printStackTrace();
        // }
        Thread.sleep(1000);
        obj2.start();
    }
}
