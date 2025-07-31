package ioJava;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class BufferedOutputStream1 {
    public static void main(String[] args) throws Exception {
        FileOutputStream fout = new FileOutputStream("D://Practice//JAVA//ioJava//File.txt");
        OutputStream out = new BufferedOutputStream(fout);
        String str = "Hello everyOne...";
        byte[] b = str.getBytes();
        out.write(b);
        out.flush();
        out.close();
        fout.close();
        System.out.println("Success");

    }
}
