package ioJava;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputStream1 {
    public static void main(String[] args) throws IOException {
        byte[] b = { 35, 36, 37, 38, 65, 97 };
        ByteArrayInputStream bais = new ByteArrayInputStream(b);
        int i = 0;
        while ((i = bais.read()) != -1) {
            char ch = (char) i;
            System.out.println("ASCII : " + i + " Char : " + ch);
        }
        bais.close();
    }
}
