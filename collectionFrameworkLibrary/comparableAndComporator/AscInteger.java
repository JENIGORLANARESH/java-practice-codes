package collectionFrameworkLibrary.comparableAndComporator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AscInteger {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(80);
        l.add(70);
        l.add(50);
        l.add(60);
        System.out.println("Before : " + l);
        Collections.sort(l);
        System.out.println("After : "+ l);
    }
}
