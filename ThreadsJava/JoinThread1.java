package ThreadsJava;

class Join1 extends Thread{
    public void run(){
        for(int i=0; i<3; i++){
            System.out.println(i+" ..in Join1");
        }
        try{Thread.sleep(1000);}catch(Exception e){System.out.println(e);}
        // System.out.println("method finished..");
    }
}

public class JoinThread1 {
    public static void main(String[] args) {
        System.out.println("*********main***********");
        Join1 t1 = new Join1();
        Join1 t2 = new Join1();
        Join1 t3 = new Join1();

        t1.start();
        try{
            t1.join(5000);
        }catch(InterruptedException e){
            System.out.println(e);
        }

        t2.start();
        try {
            t2.join(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t3.start();
    }
}
