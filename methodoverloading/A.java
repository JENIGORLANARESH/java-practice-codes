package methodoverloading;

// ********* Example of Method Overloading with TypePromotion  ********//

public class A {
    void sum(int a, long b){
        System.out.println("a+b = " + (a+b));
    }
    void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }
    public static void main(String[] args) {
        A a = new A();
        a.sum(4, 5);
        a.sum(3, 4, 5);
    }
}

