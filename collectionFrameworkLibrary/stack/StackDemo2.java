package collectionFrameworkLibrary.stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class StackDemo2 {
    public static void main(String[] args) {
        String str = "(())))(())()())";
        ArrayList<String> arr = new ArrayList<>(Arrays.asList(str.split("")));
        System.out.println(arr);

        Stack<String> st = new Stack<>();
        for (int i = 0; i < arr.size(); i++) {
            
            st.push(arr.get(i));

            if ( st.size() > 0 && st.get(0).equals(")")) {
                System.out.println("Not balanced..");
                break;
            } 

            else if (st.size()>1 && st.peek().equals(")") && st.get(i-1).equals("(")) {
                st.pop();
                st.pop();
            }
        }
        if (st.size() == 0) {
            System.out.println("Balanced.. ");
        }
    }
}
