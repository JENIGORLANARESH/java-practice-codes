package collectionFrameworkLibrary.arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1,3,5,7,8,9,11};  // Array should be sorted for binary search
        BinarySearch bs = new BinarySearch();
        System.out.println(bs.search(arr, 3));
    }

    public int search(int arr[], int x) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int middle = (low + high) / 2;
            if (arr[middle] == x) {
                return middle;
            }
            if (x > arr[middle]) {
                low = middle + 1;
            }
            if (x < arr[middle]) {
                high = middle - 1;
            }
        }
        return -1;
    }
}
