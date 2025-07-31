package ioJava;

import java.io.FileInputStream;
import java.io.SequenceInputStream;

public class SequenceInputStream1 {
    public static void main(String[] args) throws Exception {
        FileInputStream f1 = new FileInputStream("D://Practice//JAVA//ioJava//textFiles//File.txt");
        FileInputStream f2 = new FileInputStream("D://Practice//JAVA//ioJava//textFiles//File2.txt");
        SequenceInputStream sq = new SequenceInputStream(f1, f2);
        int i = 0;
        while ((i = sq.read()) != -1) {
            System.out.print((char) i);
        }
        sq.close();
        f1.close();
        f2.close();
    }
}
