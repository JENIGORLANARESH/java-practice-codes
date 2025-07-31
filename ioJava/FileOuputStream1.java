package ioJava;

import java.io.FileOutputStream;
import java.util.*;

public class FileOuputStream1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text : ");
        String str = sc.nextLine();
        byte[] b = str.getBytes();
        try {
            FileOutputStream fos = new FileOutputStream("D://Practice//JAVA//ioJava//File.txt");
            fos.write(b);
            fos.close();
            System.out.println("Successfull");
        } catch (Exception e) {
            e.printStackTrace();
        }
        sc.close();
    }
}
