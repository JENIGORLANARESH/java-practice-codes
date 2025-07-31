package collectionFrameworkLibrary.treeSet;

import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Iterator;
import collectionFrameworkLibrary.generics.Book;;

public class BookTreeSet {
    public static void main(String[] args) {
        SortedSet<Book> s = new TreeSet<Book>();
        s.add(new Book(103, "C++", "Rehamn"));
        s.add(new Book(104, "DSA", "Pavan"));
        s.add(new Book(101, "Java", "Naresh"));
        s.add(new Book(102, "Pyth", "Shiva"));

        System.out.println(s.first());
        System.out.println(s.last());
        System.out.println(s.headSet(new Book(102, "Pyth", "Shiva")));
        
        System.out.println("**********");
        Iterator<Book> itr = s.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
