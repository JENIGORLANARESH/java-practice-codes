package ThreadsJava;

class Temp {
    private int num;

    public void setTemp(int num) {
        this.num = num;
    }

    public int getTemp() {
        return num;
    }
}

class WaitA implements Runnable {
    Temp t = new Temp();

    public void run() {
        for (int i = 0; i < 10; i++) {
            t.setTemp(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class WaitB implements Runnable {
    Temp t = new Temp();

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(t.getTemp());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class WaitAndNotify {
    public static void main(String[] args) {
        WaitA A = new WaitA();
        WaitB B = new WaitB();
        Thread a = new Thread(A);
        Thread b = new Thread(B);

        a.start();
        b.start();
    }
}
