package Leetcode.Medium.BinarySearch;//Facebook
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
// Find First and Last Position of Element in Sorted Array

import java.util.Arrays;

public class Lc34FindFirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        int[] nums = { 5, 7, 7, 7, 7, 8, 8, 10 };
        int[] ans = searchRange(nums, 7);
        System.out.println(Arrays.toString(ans));
    }

    public static int binarySearch(int[] nums, int target, boolean isStartIndex){
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while (start <= end ){
            int mid = start + (end - start) /2;

            if (nums[mid] > target){
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            }
            else{
                ans = mid;

                if (isStartIndex){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }

        return ans;
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = { -1, -1 };
        ans[0] = binarySearch(nums, target, true);
        ans[1] = binarySearch(nums, target, false);
        return ans;
    }
}
