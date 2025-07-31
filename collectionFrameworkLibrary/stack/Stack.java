package collectionFrameworkLibrary.stack;

import java.util.EmptyStackException;

public class Stack {
    private ListNode top;
    private int length;

    private class ListNode {
        private int val;
        private ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public Stack() {
        this.top = null;
        this.length = 0;
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        System.out.println(st.pop());
        System.out.println(st.peek());

    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.val;
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int result = top.val;
        top = top.next;
        length--;
        return result;
    }

    public void push(int val) {
        ListNode temp = new ListNode(val);
        temp.next = top;
        top = temp;
        length++;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public int length() {
        return length;
    }

}
