package exceptions;

public class MultiCatch {
    public static void main(String[] args) {
        try {
            // int j=4/0;
            // int arr[] = {3,2,2};
            // int a = arr[8];
            // String s = null;
            // int l = s.length();
        } 
        catch(NumberFormatException e){
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch (Exception e) {
            
            System.out.println(e);
        }
    }
}
