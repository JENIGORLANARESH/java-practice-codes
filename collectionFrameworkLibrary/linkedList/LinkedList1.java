package collectionFrameworkLibrary.linkedList;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.RandomAccess;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(250);
        list.add(230);
        list.add(340);
        list.add(120);
        list.add(490);

        System.out.println(list instanceof Serializable);
        System.out.println(list instanceof Cloneable);
        System.out.println(list instanceof RandomAccess);

        System.out.println(list);;
        list.remove(2);
        System.out.println(list);
        list.add(2, 100);
        System.out.println(list);
    }
}
