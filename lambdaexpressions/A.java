package lambdaexpressions;

interface Sayable{
    void say();
}

class Bcd implements Sayable{
    public void say(){
        System.out.println("hi");
    }
}

public class A {
    public static void main(String[] args) {
        Sayable s1 = () -> {
            System.out.println("first expressions..");
        };
        s1.say();

        Bcd b = new Bcd();
        b.say();
    }
}
