package collectionFrameworkLibrary.arrays.sorting;

import java.util.Arrays;

// Also called sinking sort

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 6, 2, 3, 9, 1, 4 };
        System.out.println("Before sorting : " + Arrays.toString(arr));
        BubbleSort bs = new BubbleSort();
        bs.bubbleSort(arr);
        System.out.println("After sorting : " + Arrays.toString(arr));
    }

    public void bubbleSort(int arr[]) {
        boolean isSwapped;
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            isSwapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
                isSwapped = true;
            }
            if (isSwapped == false)
                break;
        }
    }
}
