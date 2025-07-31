package collectionFrameworkLibrary.linkedList;

import java.util.NoSuchElementException;

public class DoublyLinkedList {

    private ListNode head;
    private ListNode tail;
    private int length;

    private class ListNode {
        private int val;
        private ListNode previous;
        private ListNode next;

        private ListNode(int val) {
            this.val = val;
        }
    }

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public static void main(String[] args) {
        DoublyLinkedList dll1 = new DoublyLinkedList();
        dll1.insertLast(10);
        dll1.insertLast(20);
        dll1.insertLast(30);
        dll1.insertLast(40);
        dll1.insertLast(50);
        dll1.insertFirst(5);

        // dll1.deleteLast();
        // DoublyLinkedList dll2 = new DoublyLinkedList();
        // dll2.insertFirst(500);
        // System.out.println(dll2.deleteFirst().val);
        // System.out.println(dll1.deleteFirst().val);
        dll1.displayForward();
        dll1.displayBackward();
    }

    public ListNode deleteLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        ListNode temp = tail;
        if (head == tail) {
            head = null;
        } else {
            tail.previous.next = null;
        }
        tail = tail.previous;
        temp.previous = null;
        length--;
        return temp;
    }

    public ListNode deleteFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        ListNode temp = head;
        if (head == tail) {
            tail = null;
        } else {
            head.next.previous = null;
        }
        head = head.next;
        temp.next = null;
        length--;
        return temp;
    }

    public void insertFirst(int val) {
        ListNode newNode = new ListNode(val);
        if (isEmpty()) {
            tail = newNode;
        } else {
            head.previous = newNode;
        }
        newNode.next = head;
        head = newNode;
        length++;
    }

    public void insertLast(int val) {
        ListNode newNode = new ListNode(val);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
        }
        tail = newNode;
        length++;
    }

    public void displayForward() {
        if (head == null) {
            return;
        }
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");

    }

    public void displayBackward() {
        if (tail == null) {
            return;
        }
        ListNode temp = tail;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.previous;
        }
        System.out.println("null");

    }

    public boolean isEmpty() {
        return length == 0;
    }

    public int length() {
        return length;
    }
}
