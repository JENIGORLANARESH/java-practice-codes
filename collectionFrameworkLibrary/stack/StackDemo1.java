package collectionFrameworkLibrary.stack;

import java.util.Stack;

public class StackDemo1 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(100);
        st.add(200);
        st.add(1, 300);
        System.out.println(st.capacity());
        System.out.println(st.get(1));
        System.out.println(st);
    }
}
