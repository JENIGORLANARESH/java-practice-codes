package ioJava;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputStream1 {
    public static void main(String[] args) throws IOException {

        FileOutputStream f1 = new FileOutputStream("D://Practice//JAVA//ioJava//textFiles//File1.txt");

        FileOutputStream f2 = new FileOutputStream("D://Practice//JAVA//ioJava//textFiles//File2.txt");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(65);
        baos.writeTo(f1);
        baos.writeTo(f2);
        System.out.println("Success");
        baos.flush();
        baos.close();
        f1.close();
        f2.close();
    }
}
