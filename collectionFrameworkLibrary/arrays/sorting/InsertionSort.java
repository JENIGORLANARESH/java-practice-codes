package collectionFrameworkLibrary.arrays.sorting;

import java.util.Arrays;

public class InsertionSort {

    public void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int temp = arr[i];
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 6, 2, 3, 9, 1, 4 };
        System.out.println("Before sorting : " + Arrays.toString(arr));
        InsertionSort is = new InsertionSort();
        is.insertionSort(arr);
        System.out.println("After sorting : " + Arrays.toString(arr));
    }
}
