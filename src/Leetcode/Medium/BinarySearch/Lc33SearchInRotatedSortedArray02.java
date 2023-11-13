package Leetcode.Medium.BinarySearch;

//https://leetcode.com/problems/search-in-rotated-sorted-array/
//Search in Rotated Sorted Array

public class Lc33SearchInRotatedSortedArray02 {
    public static void main(String[] args) {
        int[] arr = {5, 1, 3};
        int target = 3;
        int ans = search(arr, target);
        System.out.println(ans);
    }

    public static int search(int[] arr, int target){
        return binarySearch(arr, target, 0, arr.length - 1);
    }

    public static int binarySearch(int[] arr, int target, int start, int end){
        if (start > end) return -1;

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) return mid;

        if (arr[start] <= arr[mid]){
            if (arr[start] <= target && target <= arr[mid]){
                return binarySearch(arr, target, start, mid - 1);
            }

            return binarySearch(arr, target, mid + 1, end);
        }

        if (arr[mid] <= target && target <= arr[end]){
            return binarySearch(arr, target, mid + 1, end);
        }

        return binarySearch(arr, target, start, mid - 1);
    }
}
