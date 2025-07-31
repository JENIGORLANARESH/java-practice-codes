package exceptions;

public class Example1 {
    public static void main(String[] args) {
        // String str = null;
        int[] arr = new int[5];
        try{
            // int j = 3/0;                    // ArithmaticException
            // System.out.println(j);
            // int len = str.length();         // NullPointerException
            // System.out.println(len);
            // str = "hello";
            // int st = Integer.parseInt(str);     // NumberFormatException
            System.out.println(arr[5]);         // ArrayIndexOutOfBoundsException
        }
        catch(Exception e){
            System.out.println(e);
            // System.out.println(e.getMessage());
        }
    }
}
