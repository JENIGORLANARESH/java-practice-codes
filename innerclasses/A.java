package innerclasses;

class B{
    private String name;
    B(String name){
        this.name = name;
    }

    class C{
        void display(){
            System.out.println(name);
        }
    }
}

public class A {
   public static void main(String[] args) {
     B obj = new B("heloo       ");
    
    B.C obj1 = obj.new C();
    obj1.display();
   }
}
