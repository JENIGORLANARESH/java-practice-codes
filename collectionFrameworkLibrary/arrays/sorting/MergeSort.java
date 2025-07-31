package collectionFrameworkLibrary.arrays.sorting;

import java.util.Arrays;

public class MergeSort {

    public void mergeSort(int[] arr, int[] temp, int low, int high) {
        if (low < high) { // base case
            int mid = low + (high - low) / 2; // overflow condition
            mergeSort(arr, temp, low, mid);
            mergeSort(arr, temp, mid + 1, high);
            merge(arr, temp, low, mid, high);
        }
    }

    private void merge(int[] arr, int[] temp, int low, int mid, int high) {
        for (int i = low; i <= high; i++) {
            temp[i] = arr[i];
        }
        int i = low; // traverse left sorted array
        int j = mid + 1; // traverse right sorted array
        int k = low; // will merge both arrays into original array (arr)
        while (i <= mid && j <= high) {
            if (temp[i] <= temp[j]) {
                arr[k] = temp[i];
                i++;
            } else {
                arr[k] = temp[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            arr[k] = temp[i];
            i++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 3, 4, 5, 6, 7, 8, 6, 21, 13, 9 };
        System.out.println("Before sorting : " + Arrays.toString(arr));
        MergeSort ms = new MergeSort();
        ms.mergeSort(arr, new int[arr.length], 0, arr.length - 1);
        System.out.println("After sorting : " + Arrays.toString(arr));
    }
}
