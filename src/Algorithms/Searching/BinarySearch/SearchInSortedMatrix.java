package Algorithms.Searching.BinarySearch;

import java.util.Arrays;

public class SearchInSortedMatrix {
    public static void main(String[] args) {
        int[][] arr = { {10, 20, 30 ,40},
                        {50, 60, 70, 80},
                        {90, 100, 110 ,120},
                        {130, 140, 150 ,160},};
        int target = 110;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] binarySearch(int[][] matrix, int row, int colStart, int colEnd, int target){

        if (colStart > colEnd){
            return new int[]{-1, -1};
        }

        int mid = colStart + (colEnd - colStart) / 2;

        if (matrix[row][mid] == target){
            return new int[]{ row, mid };
        }

        if (matrix[row][mid] > target){
            return binarySearch(matrix, row, colStart, mid - 1, target);
        }

        return binarySearch(matrix, row, mid + 1, colEnd, target);
    }

    static int[] search(int[][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows == 1){
            return binarySearch(matrix, 0, 0, cols - 1, target);
        }

        // run the loop till 2 rows are
        int rowStart = 0;
        int rowEnd = rows - 1;
        int colMid = cols / 2;

        while (rowStart < (rowEnd - 1)){ // The loop will continue till only 2 rows are left
            int rowMid = rowStart + (rowEnd - rowStart) / 2;
            if (matrix[rowMid][colMid] == target){
                return new int[]{rowMid, colMid};
            }

            if (matrix[rowMid][colMid] < target){
                rowStart = rowMid;
            }else {
                rowEnd = rowMid;
            }
        }

        // Check whether the target is in middle column
        if (matrix[rowStart][colMid] == target){
            return new int[]{rowStart, colMid};
        }

        if (matrix[rowStart + 1][colMid] == target){
            return new int[]{rowStart + 1, colMid};
        }

        // search in 1st half
        if (matrix[rowStart][colMid - 1] >= target){
            return binarySearch(matrix, rowStart, 0, colMid - 1, target);
        }

        // search in 2nd half
        if (matrix[rowStart][colMid + 1] <= target && target >= matrix[rowStart][cols - 1]){
            return binarySearch(matrix, rowStart, colMid + 1, cols - 1, target);
        }

        // search in 3rd half
        if (matrix[rowStart + 1][colMid - 1] >= target){
            return binarySearch(matrix, rowStart + 1, 0, colMid - 1, target);
        }

        // search in 4th half
        return binarySearch(matrix, rowStart + 1, colMid + 1,cols - 1, target);
    }
}
