package ThreadsJava;



public class LambdaThread {
    public static void main(String[] args) {
        
        Thread t1 = new Thread( ()->
                {
                    for (int i = 0; i < 10; i++) {
                        System.out.println("....A....");
                        try {Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            System.out.println(e);
                        }
                    }
                }
        );


        Thread t2 = new Thread( () -> 
            {
                for (int i = 0; i < 10; i++) {
                    System.out.println("....B....");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }
                }
            }
        );

        t1.start();
        t2.start();
    }
}
