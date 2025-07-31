package collectionFrameworkLibrary.comparableAndComporator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DescString implements Comparator<String> {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Naresh");
        arr.add("Surekha");
        arr.add("Guru");
        arr.add("Deepika");
        arr.add("Rajesh");
        arr.add("Kumari");

        System.out.println("Befor : " + arr);
        Collections.sort(arr, new DescString());
        System.out.println("After Desc : " + arr);
        Collections.reverse(arr);
        System.out.println("After Asce : " + arr);
    }

    @Override
    public int compare(String s1, String s2) {
        return s2.compareTo(s1);
    }

}
