package collectionFrameworkLibrary.arrays.sorting;

import java.util.*;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 3, 4, 5, 6, 7, 8, 6, 21, -13, 9 };
        System.out.println("Before sorting : " + Arrays.toString(arr));
        QuickSort qs = new QuickSort();
        qs.quickSort(arr, 0, arr.length - 1);
        System.out.println("After sorting : " + Arrays.toString(arr));
    }

    public void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int p = partition(arr, low, high);
            quickSort(arr, low, p - 1);
            quickSort(arr, p + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int i = low;
        int j = low;
        int pivot = arr[high];
        while (i <= high) {
            if (arr[i] <= pivot) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
            i++;
        }

        return j - 1;
    }

}
