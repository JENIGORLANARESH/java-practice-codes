package binarytree;

public class MaxPriorityQueue {
    private Integer[] heap;
    private int n;

    public MaxPriorityQueue(int capacity) {
        heap = new Integer[capacity + 1];
        n = 0;
    }

    public static void main(String[] args) {
        MaxPriorityQueue pq = new MaxPriorityQueue(3);
        pq.insert(2);
        pq.insert(3);
        pq.insert(5);
        pq.insert(1);
        pq.insert(9);
        pq.insert(8);
        pq.insert(6);
        System.out.println("size : " + pq.size());
        pq.printMaxHeap();

        // System.out.println(pq.deleteMax());
        // pq.printMaxHeap();
    }

    public int deleteMax() {
        int max = heap[1];
        swap(1, n);
        n--;
        sink(1);
        heap[n + 1] = null;
        if (n > 0 && (n == (heap.length - 1) / 4)) {
            resize(heap.length / 2);
        }
        return max;
    }

    public void sink(int k) {
        while (2 * k <= n) {
            int j = 2 * k;
            if (j < n && heap[j] < heap[j + 1]) {
                j++;
            }
            if (heap[k] >= heap[j]) {
                break;
            }
            swap(k, j);
            k = j;
        }
    }

    public void swap(int i, int n) {
        int temp = heap[n];
        heap[n] = heap[i];
        heap[i] = temp;
    }

    public void insert(int x) {
        if (n == heap.length - 1) {
            resize(heap.length * 2);
        }
        n++;
        heap[n] = x;
        swim(n);
    }

    // *****Buttom-Up-Re-Heapify***** - for inserting
    public void swim(int k) {
        while (k > 1 && heap[k / 2] < heap[k]) {
            int temp = heap[k];
            heap[k] = heap[k / 2];
            heap[k / 2] = temp;
            k = k / 2;
        }
    }

    public void resize(int capacity) {
        Integer[] temp = new Integer[capacity];
        for (int i = 0; i < heap.length; i++) {
            temp[i] = heap[i];
        }
        heap = temp;
    }

    public void printMaxHeap() {
        for (int i = 1; i <= n; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public int size() {
        return n;
    }
}
