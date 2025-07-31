package collectionFrameworkLibrary.linkedList;

// import java.util.List;

public class SLL {
    ListNode head;

    private static class ListNode {
        private int val;
        private ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        SLL sll = new SLL();
        sll.head = new ListNode(1);
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(3);
        ListNode l5 = new ListNode(4);
        ListNode l6 = new ListNode(7);
        sll.head.next = l1;
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;

        // sll.display();

        // SLL sll2 = new SLL();
        // sll2.head = new ListNode(1);
        // ListNode s1 = new ListNode(6);
        // ListNode s2 = new ListNode(4);
        // sll2.head.next = s1;
        // s1.next = s2;

        // sll.display();
        // sll2.display();

        // SLL result = new SLL();
        // result.head = add(sll.head, sll2.head);
        // result.display();
        // SLL result = new SLL();
        // result.head = merge(sll.head, sll2.head);
        // result.display();
        // sll.removeLoop();
        // System.out.println(sll.startingLoop().val);
        // System.out.println(sll.containsLoop());
        // sll.display();
    }

    

    public static void display(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + "  ");
            current = current.next;
        }
    }

    public static ListNode add(ListNode a, ListNode b) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        int carry = 0;
        while (a != null || b != null) {
            int x = (a != null) ? a.val : 0;
            int y = (b != null) ? b.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            tail.next = new ListNode(sum % 10);
            tail = tail.next;
            if (a != null)
                a = a.next;
            if (b != null)
                b = b.next;
        }
        if (carry > 0) {
            tail.next = new ListNode(carry);
        }
        return dummy.next;
    }

    public static ListNode merge(ListNode a, ListNode b) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while (a != null && b != null) {
            if (a.val <= b.val) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }
        if (a == null) {
            tail.next = b;
        } else {
            tail.next = a;
        }

        return dummy.next;
    }

    public void removeLoop() {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                removeLisk(slow);
            }
        }
        return;
    }

    private void removeLisk(ListNode slow) {
        ListNode temp = head;
        while (temp.next != slow.next) {
            temp = temp.next;
            slow = slow.next;
        }
        slow.next = null;
    }

    public ListNode startingLoop() {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return getStartingNode(slow);
            }
        }
        return null;
    }

    private ListNode getStartingNode(ListNode slow) {
        ListNode temp = head;
        while (temp != slow) {
            temp = temp.next;
            slow = slow.next;
        }
        return temp;
    }

    public boolean containsLoop() {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(" -> " + current.val);
            current = current.next;
        }
        System.out.println();
    }
}
