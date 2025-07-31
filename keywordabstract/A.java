package keywordabstract;

// import methodoverloading.B;
// import methodoverloading.C;

abstract class B {
    abstract public void display(); 
    public void run(){
        System.out.println("B is running...");
    }
}

class C extends B{
    public void display(){
        System.out.println("in C display...");
    }
}

public class A {
    public static void main(String[] args) {
        C obj = new C();
        obj.display();
        obj.run();
    }
}



// ***************** //  Abstract class containing the abstract method   and Concrete method   ******************