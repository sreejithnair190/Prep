package Leetcode.Medium.BinarySearch;

//https://leetcode.com/problems/peak-index-in-a-mountain-array/
// Find Peak Index in a Mountain Array

public class Lc852PeakIndexInAMountainArray {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 7, 6, 3, 2};
        int[] arr2 = {0,2,1,0};
        int ans = peakIndexInMountainArray(arr2);
        System.out.println(ans);
    }

    public static int peakIndexInMountainArray(int[] arr) {
        return search(arr, 0, arr.length-1);
    }

    public static int search(int[] arr, int start, int end){
        if (start == end){
            return start;
        }
        int mid = start + (end - start)/2;
        if (arr[mid] < arr[mid + 1]){
            return search(arr, mid + 1, end);
        }
        return search(arr, start, mid);
    }

}
