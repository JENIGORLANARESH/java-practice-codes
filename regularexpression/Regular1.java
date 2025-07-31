package regularexpression;
import java.util.regex.*;

public class Regular1 {
    public static void main(String[] args) {
        System.out.println("*********main***********");
        Pattern p1 = Pattern.compile("hello");
        Matcher m1 = p1.matcher("helloevery one");
        boolean found = m1.find();
        if(found){
            System.out.println("m1.find() : found");
        }
        else System.out.println("m1.find() : Not found");

        boolean b2 = Pattern.matches("naresh", "jenigorla naresh");
        System.out.println("Pattern.matches() : "+b2);

        Pattern p2 = Pattern.compile("naresh");
        Matcher m2 = p2.matcher("kanigirijenigorlanaresh");
        while (m2.find()) {
            //  System.out.println("starting index found at : "+m2.start());
            //  System.out.println("ending index found at : "+ (m2.end()-1));
            System.out.println("Pattern found from index " + m2.start() + " to " + (m2.end()-1));
        }

        System.out.println( " [a-zA-Z] -> "+Pattern.matches("[a-zA-Z]", "A"));
       
    }    
}
