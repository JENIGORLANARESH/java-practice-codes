package collectionFrameworkLibrary.arrays;

import java.util.Arrays;

public class DutchNationalFlag {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 0, 0, 0, 2, 2, 1, 1, 0, 2, 1 };
        DutchNationalFlag dnf = new DutchNationalFlag();
        dnf.dutch(arr);
        System.out.println(Arrays.toString(arr));
    }

    public void dutch(int[] arr) {
        int i = 0;
        int j = 0;
        int k = arr.length - 1;
        while (i <= k) {
            if (arr[i] == 0) {
                swap(arr, i, j);
                i++;
                j++;
            } else if (arr[i] == 1) {
                i++;
            }
            else if (arr[i] == 2) {
                swap(arr, i, k);
                k--;
            }
        }
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
