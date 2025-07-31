package collectionFrameworkLibrary.cursors;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;


public class iteratorDemo {
    public static void main(String[] args) {
        Set<Integer> hash = new HashSet<Integer>();
        hash.add(50);
        hash.add(30);
        hash.add(49);
        hash.add(34);
        hash.add(22);
        hash.add(21);

        Iterator<Integer> itr = hash.iterator();

        while (itr.hasNext()) {
            Integer ele = itr.next();
            if(ele % 2 == 0){
                System.out.println(ele);
            }
        }
    }
}
