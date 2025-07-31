package lambdaexpressions;

interface Sayable1 {
    String sayName(String name);
    // void sayName(String name);
}

public class Single {
    public static void main(String[] args) {
        Sayable1 s1 = name -> {
            // System.out.println("Hello "+ name);
            return "Hello "+name;
        };
        System.out.println(s1.sayName("Naresh"));
        // s1.sayName("naresh");
    }
}
