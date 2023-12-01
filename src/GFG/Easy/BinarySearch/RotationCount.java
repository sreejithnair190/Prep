//https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/

// Find how many times the array was rotated

package GFG.Easy.BinarySearch;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 8, 0, 1, 2, 3};
        int pivot = findPivot(arr, 0, arr.length - 1);
        System.out.println(pivot + 1);
    }

    static int findPivot(int[] arr, int start, int end){
        if (start == end) return -1;
        int mid = end - (start + end)/ 2;

        if (mid < end && arr[mid] > arr[mid + 1]) return mid;

        if (mid > start && arr[mid] < arr[mid - 1]) return mid - 1;

        if (arr[start] >= arr[mid]) return findPivot(arr, start, mid - 1);

        return findPivot(arr, mid, end);
    }
}
