package collectionFrameworkLibrary.hashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class HashDemo1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        HashSet<Integer> h = new HashSet<>(arr);
        System.out.println(h);
        HashSet<Integer> hash = new HashSet<>(10 , 0.75f);         // Default capacity 16  &&  loadFactor: 75
        hash.add(100);
        hash.add(200);
        hash.add(300);
        System.out.println(hash);

        HashSet<String> hash2 = new HashSet<>();
        hash2.add("Zebronics ");
        hash2.add("Lenovo");
        System.out.println(hash2);
    }
}
