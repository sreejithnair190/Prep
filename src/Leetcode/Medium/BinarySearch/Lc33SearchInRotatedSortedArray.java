package Leetcode.Medium.BinarySearch;

//https://leetcode.com/problems/search-in-rotated-sorted-array/
//Search in Rotated Sorted Array

public class Lc33SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 5;
        int ans = search(arr, target);
        System.out.println(ans);
    }

    public static int search(int[] nums, int target) {
        int N = nums.length - 1;
        int pivot = findPivot(nums, 0, N);

        if (pivot == -1) return binarySearch(nums, 0, N, target);

        int ans = binarySearch(nums, 0, pivot, target);
        if (ans == -1) ans = binarySearch(nums, pivot + 1, N, target);
        return ans;
    }

    public static int findPivot(int[] arr, int start, int end){
        if (start >= end) return -1;

        int mid = start + (end - start)/2;

        if (mid < end && arr[mid] > arr[mid + 1]) return mid;

        if (mid > start && arr[mid] < arr[mid - 1]) return mid - 1;

        if (arr[start] >= arr[mid]){
            return findPivot(arr, start, mid - 1);
        }
        return findPivot(arr, mid, end);

    }

    public static int binarySearch(int[] arr, int start, int end, int target){
        if (start > end) return -1;

        int mid = start + (end - start)/2;

        if (arr[mid] == target) return mid;

        if (arr[mid] < target){
            return binarySearch(arr, mid + 1, end, target);
        }

        return binarySearch(arr, start, mid - 1, target);
    }

}
