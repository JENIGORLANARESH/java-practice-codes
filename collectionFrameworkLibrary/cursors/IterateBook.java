package collectionFrameworkLibrary.cursors;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import collectionFrameworkLibrary.generics.Book;

public class IterateBook    {
    public static void main(String[] args) {
        Set<Book> s = new HashSet<>();
        s.add(new Book(101, "Java", "Naresh"));
        s.add(new Book(102, "Pyth", "Dinesh"));
        s.add(new Book(103, "C++", "Guru"));
        s.add(new Book(103, "C++", "Guru"));
        s.add(new Book(130, "Data", "Rajesh"));

        Iterator<Book> itr = s.iterator();
        while (itr.hasNext()) {
            // System.out.println(itr.next());
            Book b = itr.next();
            if(b.getSNo() < 110){
                System.out.println(b);
            }
        }
    }
}

