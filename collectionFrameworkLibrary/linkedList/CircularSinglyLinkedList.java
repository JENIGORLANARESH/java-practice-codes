package collectionFrameworkLibrary.linkedList;

import java.util.NoSuchElementException;

public class CircularSinglyLinkedList {

    private ListNode last;
    private int length;

    private class ListNode {
        private ListNode next;
        private int val;

        private ListNode(int val) {
            this.val = val;
        }
    }

    public CircularSinglyLinkedList() {
        last = null;
        length = 0;
    }

    public void createCircularLinkedList() {
        ListNode l1 = new ListNode(10);
        ListNode l2 = new ListNode(60);
        ListNode l3 = new ListNode(30);
        ListNode l4 = new ListNode(40);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l1;

        last = l4;
        length = 4;
    }

    public static void main(String[] args) {
        CircularSinglyLinkedList cl1 = new CircularSinglyLinkedList();
        cl1.createCircularLinkedList();

        // cl1.removeFirst();
        // cl1.insertLast(99);
        // cl1.insertFirst(99);
        cl1.display();
    }

    public ListNode removeFirst() {
        System.out.println(isEmpty());
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        ListNode temp = last.next;
        if (last.next == last) {
            last = null;
        } else {
            last.next = temp.next;
        }
        temp.next = null;
        length--;
        return temp;
    }

    public void insertLast(int val) {
        ListNode temp = new ListNode(val);
        if (last == null) {
            last = temp;
            last.next = last;
        } else {
            temp.next = last.next;
            last.next = temp;
            last = temp;
        }
        length++;
    }

    public void insertFirst(int val) {
        ListNode temp = new ListNode(val);
        if (last == null) {
            last = temp;
        } else {
            temp.next = last.next;
        }
        last.next = temp;
        length++;
    }

    public void display() {
        if (last == null) {
            return;
        }
        ListNode first = last.next;
        while (first != last) {
            System.out.print(first.val + " -> ");
            first = first.next;
        }
        System.out.println(first.val);

    }

    public int length() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }
}
