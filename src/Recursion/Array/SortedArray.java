package Recursion.Array;

public class SortedArray {
    public static void main(String[] args) {
        int[] arr1 = {0, 1, 4, 6, 8, 9};
        int[] arr2 = { 1, 4, 6, 82, 9};
        System.out.println(isSortedArray(arr1, 0));
        System.out.println(isSortedArray(arr2, 0));
    }

    static boolean isSortedArray(int[] arr, int index){
        if ((arr.length - 1) == index) return true;

        return arr[index] < arr[index + 1] && isSortedArray(arr, index + 1);
    }
}
