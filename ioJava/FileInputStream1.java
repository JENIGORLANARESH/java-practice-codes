package ioJava;

import java.io.FileInputStream;

public class FileInputStream1 {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("D://Practice//JAVA//ioJava//File.txt");
            int i = 0;
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }
            fin.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
