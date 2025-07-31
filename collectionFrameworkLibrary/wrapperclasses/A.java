package collectionFrameworkLibrary.wrapperclasses;

public class A {
    public static void main(String[] args) {
            int a = 9;
        // Integer b = new Integer(5);
        Integer b = a;    // Autoboxing
        
        System.out.println(a+ " " + b);
         
        double c = 3.3;
        Double d = c;
        System.out.println(c + " " + d);

        int e = b.intValue();
        System.out.println(e);     //Unboxing
        // Float f = new Float(3.4f);
        // float g = f.floatValue();
        // System.out.println(g);
    }
}
