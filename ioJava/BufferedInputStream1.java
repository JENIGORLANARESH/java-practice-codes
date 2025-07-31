package ioJava;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStream1 {
    public static void main(String[] args) throws Exception {
        FileInputStream fin = new FileInputStream("D://Practice//JAVA//ioJava//textFiles//File.txt");
        BufferedInputStream in = new BufferedInputStream(fin);
        int i = 0;
        while ((i = in.read()) != -1) {
            System.out.print((char) i);
        }
        in.close();
        fin.close();
    }
}
