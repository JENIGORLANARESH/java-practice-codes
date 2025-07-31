package regularexpression;
import java.util.regex.*;

public class CharacterClasses {
    public static void main(String[] args) {
        System.out.println("**********main**********");
        // [a-zA-Z] -> characters from range a to z or A to Z.
        System.out.println(" [a-zA-Z] -> " + Pattern.matches("[a-zA-Z]","a"));  //true
        System.out.println(" [a-zA-Z] -> " + Pattern.matches("[a-zA-Z]","AB"));  //false
        
        // [xyz] -> x,y or z
        System.out.println(" [xyz] ->"+Pattern.matches("[abc]", "a"));
        System.out.println(" [xyz] ->"+Pattern.matches("[abc]", "f"));

        // other than x,y or z
        System.out.println(" [^xyz] ->"+Pattern.matches("[^abc]", "f"));
        System.out.println(" [^xyz] ->"+Pattern.matches("[^abc]", "a"));

        // [a-f[m-p]]   Union of a to f and m to p.

        System.out.println(" [a-f[m-p]] -> "+ Pattern.matches("[a-f[m-p]]", "b"));
        System.out.println(" [a-f[m-p]] -> "+ Pattern.matches("[a-f[m-p]]", "x"));

        // [a-z && p-y] All the range of elements intersection between two ranges -> COMMON ELEMENTS
        System.out.println(" [a-z && p-y ] -> "+ Pattern.matches("[a-z && p-y]", "x"));
        System.out.println(" [a-z && p-y ] -> "+ Pattern.matches("[a-z && p-y]", "g"));

        // [a-z&&[^bc]]   a to z union except b and c
        System.out.println(" [a-z&&[^bc]] -> " + Pattern.matches("[a-z&&[^bc]]", "c"));
        System.out.println(" [a-z&&[^bc]] -> " + Pattern.matches("[a-z&&[^bc]]", "w"));

    }
}
