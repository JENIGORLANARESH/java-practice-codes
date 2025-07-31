package collectionFrameworkLibrary.cursors;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class listIteratorDemo {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<Integer>();
        l.add(54);
        l.add(23);
        l.add(26);
        l.add(98);
        l.add(67);
        // l.add(56);

        ListIterator<Integer> ltr = l.listIterator();
        while (ltr.hasNext()) {
            System.out.println(ltr.next());
            System.out.println(ltr.next());
        }

        System.out.println("************");

        while (ltr.hasPrevious()) {
            System.out.println(ltr.previous());
        }
    }
}


