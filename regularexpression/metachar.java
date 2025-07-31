package regularexpression;
// import java.util.regex.*;

public class metachar {
    public static int temp =0;
    public static void main(String[] args) {
        
        int num = 1234;
        System.out.println(methodName(num));
    }

    static int methodName(int n){
        return (temp*10 + methodName(n%10));
        
    }
}


// Online Java Compiler
// Use this editor to write, compile and run your Java code online

