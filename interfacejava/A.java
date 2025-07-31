package interfacejava;

/**
 * InnerA
 */
 interface InnerA {
    int a = 5;          // by default final and static
    String name = "naresh";   
    void display();     // abstract
    void run();
}
interface InnerB{
    int b = 22;
    String name = "in InnerB";
    void display();
}

class B implements InnerA,InnerB{
    public void display(){
        System.out.println("in B display..");
    }
    public void run(){
        System.out.println("in B run...");
        System.out.println(InnerB.name);
    }
    
}

// class C implements InnerA{
//     public void display(){
//         System.out.println("in C display..");
//         System.out.println("in C : "+ name);
//     }
//     public void run(){
//         System.out.println("in C run...");
//     }
// }

public class A {
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
        obj.run();
        System.out.println(InnerA.a);
        System.out.println(InnerA.name);
        // C obj1 = new C();
        // obj1.display();
        // obj1.run();

    }
}
