package collectionFrameworkLibrary.comparableAndComporator;
import java.util.ArrayList;
import java.util.Collections;

public class SortBooks {
    public static void main(String[] args) {
        ArrayList<Books> arr = new ArrayList<>();
        arr.add(new Books(200, "DSA", "Naresh"));
        arr.add(new Books(400, "Java", "Guru"));
        arr.add(new Books(250, "Python", "Surekha"));
        arr.add(new Books(150, "C++", "Rajesh"));
        System.out.println("SNo\tName\tAuthor");
        System.out.println("----------------------------");
        
        Collections.sort(arr, new Books());
        for (Books ele : arr) {
            System.out.println(ele);
        }
    }    
}
