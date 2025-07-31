package exceptions;

public class ThrowException {

    public static void method(int age){
        if(age<18){
            throw new ArithmeticException("Person is not eligible to vote.");
        }
        else{
            System.out.println("Eligible to vote.");
        }
    }

    // Throwing checked Exception *********

    // public static void method(int age) throws ArithmeticException{
    //     System.out.println(age/0);
    //     // throw new ArithmeticException("value is smaller....");
    // }

    //***Throwing user defined exception***********

    

    
    public static void main(String[] args) {
        System.out.println("Main method**********");
        // method(5);
        try{
            method(49);
            // int j=9/0;
            throw new UserDefinedException("This is inside try main....");
        }catch(UserDefinedException e){
            System.out.println("Caught exception");
            System.out.println(e.getMessage());
        }

    }
}

class UserDefinedException extends Exception{
        public UserDefinedException(String str){
            super(str);
        }
    }
