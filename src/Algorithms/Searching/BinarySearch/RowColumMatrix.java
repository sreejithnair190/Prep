package Algorithms.Searching.BinarySearch;

// Matrix is sorted in row and column wise manner. Search for the target.

import java.util.Arrays;

public class RowColumMatrix {
    public static void main(String[] args) {
        int[][] arr = { {10, 20, 30 ,40},
                        {15, 25, 35, 45},
                        {28, 29, 37, 49},
                        {33, 34, 38, 50}};
        int target = 37;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] search(int[][] arr, int target){
        int row = 0;
        int col = arr.length - 1;

        while (row < arr.length && col >= 0){
            if (arr[row][col] == target){
                return new int[]{row,col};
            }

            if (arr[row][col] < target){
                row++;
            }else {
                col--;
            }
        }


        return new int[]{-1, -1};
    }
}
