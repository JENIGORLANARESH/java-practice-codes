package collectionFrameworkLibrary.arrays.sorting;

import java.util.Arrays;

public class SelectionSort {

    public void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 6, 2, 3, 9, 1, 4 ,-8};
        System.out.println("Before sorting : " + Arrays.toString(arr));
        SelectionSort ss = new SelectionSort();
        ss.selectionSort(arr);
        System.out.println("After sorting : " + Arrays.toString(arr));
    }
}
