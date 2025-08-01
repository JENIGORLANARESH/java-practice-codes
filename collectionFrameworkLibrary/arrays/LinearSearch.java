package collectionFrameworkLibrary.arrays;

public class LinearSearch {
    public int search(int arr[], int n, int x) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 1, 2, 7, 3, 8, 3 };
        LinearSearch ls = new LinearSearch();
        System.out.println(ls.search(arr, arr.length, 5));
    }
}
