package collectionFrameworkLibrary.arrays;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = { 2, 4, 6, 8 };
        int[] arr2 = { 1, 3, 5, 9 };
        MergeTwoSortedArrays mg = new MergeTwoSortedArrays();
        int result[] = mg.merge(arr1, arr2);
        System.out.println(Arrays.toString(result));
    }

    public int[] merge(int arr1[], int arr2[]) {
        int n = arr1.length;
        int m = arr2.length;
        int[] result = new int[n + m];
        int i = 0, j = 0, k = 0;
        while (i < n && j<m) {
            if(arr1[i] < arr2[j]){
                result[k] = arr1[i];
                i++;
            }
            else{
                result[k] = arr2[j];
                j++;
            }
            k++;
        }
        if(i < n){
            result[k] = arr1[i];
            i++;k++;
        }
        if(j < m){
            result[k] = arr2[j];
            j++;k++;
        }
        return result;
    }
}
