package exceptions;

import java.io.IOException;

public class ThrowsException {
    void m() throws IOException{
        throw new IOException();
    }
    void n() throws IOException{
        m();
    }
    void p(){
        try{
            n();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        System.out.println("Main method**********");
        ThrowsException obj = new ThrowsException();
        obj.p();
        System.out.println("normal flow..");
    }
}
