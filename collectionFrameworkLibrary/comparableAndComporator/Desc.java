package collectionFrameworkLibrary.comparableAndComporator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Desc implements Comparator<Integer>{
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(278);
        arr.add(576);
        arr.add(496);
        arr.add(727);
        arr.add(410);
        arr.add(124);
        arr.add(338);
        arr.add(149);
        arr.add(209);
        arr.add(702);
        arr.add(282);
        arr.add(718);
        arr.add(771);
        arr.add(575);
        arr.add(436);

        System.out.println("Befor : "  + arr);
        Collections.sort(arr, new Desc());
        System.out.println("After : " + arr);
    }

    @Override
    public int compare(Integer i1, Integer i2) {
        // return i2 - i1;
        return i2.compareTo(i1);      
    }

}
