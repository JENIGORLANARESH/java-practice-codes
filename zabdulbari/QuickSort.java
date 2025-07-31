package zabdulbari;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 8, 1, 6, 3, 9, 0, 101, 99};
        System.out.println("Before Sorting : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        quickSort(0, arr.length - 1, arr);

        System.out.println("After Sorting : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void quickSort(int l, int h, int[] arr) {
        if (l < h) {
            int j = partition(l, h, arr);
            quickSort(l, j - 1, arr);
            quickSort(j + 1, h, arr);
        }
    }

    public static int partition(int l, int h, int[] arr) {
        int pivot = arr[l];
        int i = l;
        int j = h;
        while (i < j) {
            while (arr[i] <= pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[l];
        arr[l] = arr[j];
        arr[j] = temp;
        return j;
    }
}
