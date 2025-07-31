package collectionFrameworkLibrary.arrays;

import java.util.*;

public class Matrix {

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        spriralPrint(matrix, 4, 4);
        // searchElementMatrix(matrix, 4, 1);
    }

    public static void spriralPrint(int[][] matrix, int r, int c) {
        int i, k = 0, l = 0;
        while (k < r && l < c) {
            for (i = l; i < c; i++) {
                System.out.print(matrix[k][i] + " ");
            }
            k++;
            for (i = k; i < r; i++) {
                System.out.print(matrix[i][c - 1] + " ");
            }
            c--;
            if (k < r) {
                for (i = c - 1; i >= l; i--) {
                    System.out.print(matrix[r - 1][i] + " ");
                }
            }
            r--;
            if (l < c) {
                for (i = r - 1; i >= k; i--) {
                    System.out.print(matrix[i][l] + " ");
                }
            }
            l++;
        }
    }

    public static void searchElementMatrix(int matrix[][], int n, int x) {
        int i = 0;
        int j = n - 1;
        while (i < n && j >= 0) {
            if (matrix[i][j] == x) {
                System.out.println("Element found at " + i + " " + j);
                return;
            }
            if (matrix[i][j] > x) {
                j--;
            } else {
                i++;
            }
        }
        System.out.println("Not found..");
    }

    public static String[] generateBinaryNumber(int n) {
        String[] result = new String[n];
        Queue<String> q = new LinkedList<String>();
        q.offer("1");
        for (int i = 0; i < n; i++) {
            result[i] = q.poll();
            String n1 = result[i] + "0";
            String n2 = result[i] + "1";
            q.offer(n1);
            q.offer(n2);
        }
        return result;
    }
}