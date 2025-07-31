package lambdaexpressions;
import java.util.*;
public class ForEach {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(10);
        list.add(9);

        list.forEach(
            (n)->System.out.println(n)
        );

        list.forEach(null);
    }
}

