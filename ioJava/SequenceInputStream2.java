package ioJava;

import java.io.FileInputStream;
// import java.io.FileOutputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class SequenceInputStream2 {
    public static void main(String[] args) throws Exception {

        FileInputStream f1 = new FileInputStream("D://Practice//JAVA//ioJava//textFiles//File1.txt");
        FileInputStream f2 = new FileInputStream("D://Practice//JAVA//ioJava//textFiles//File2.txt");
        // FileOutputStream f3 = new FileOutputStream("D://Practice//JAVA//ioJava//textFiles//File3.txt");
        
        FileInputStream f3 = new FileInputStream("D://Practice//JAVA//ioJava//textFiles//File3.txt");
        FileInputStream f4 = new FileInputStream("D://Practice//JAVA//ioJava//textFiles//File4.txt");
        // SequenceInputStream sq = new SequenceInputStream(f1,f2);
        Vector<FileInputStream> v = new Vector<>();
        v.add(f1);
        v.add(f2);
        v.add(f3);
        v.add(f4);
        Enumeration<FileInputStream> e = v.elements();
        SequenceInputStream sq = new SequenceInputStream(e);

        int i = 0;
        while ((i = sq.read()) != -1) {
            System.out.print((char)i);
        }
        sq.close();
        f1.close();
        f2.close();
        f3.close();
        f4.close();

        System.out.println("Success");
    }
}
