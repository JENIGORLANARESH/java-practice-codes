package collectionFrameworkLibrary.treeSet;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSet1 implements Comparator<Integer>{
    public static void main(String[] args) {
        SortedSet<Integer> s = new TreeSet<Integer>(new TreeSet1());
        s.add(300);
        s.add(340);
        s.add(122);
        s.add(134);
        s.add(890);
        s.add(789);
        System.out.println(s);
    }

    // For Descending order.. Comparator is implemented
    @Override
    public int compare(Integer i1, Integer i2){
        return i2.compareTo(i1);
    }

    // For Ascending order Comparable(I) is implemented
}
