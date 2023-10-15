package Algorithms.Searching.BinarySearch;

public class BinarySearchAlgo {

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 17, 18, 29, 35, 45, 76, 78, 89, 97};
        int[] arr2 = {78, 52, 45, 32, 12, 10, 4, 2, 1 };

        int target = 52;
        int ans  = binarySearch(arr2, target);
        System.out.println(ans);
    }
    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];

        while (start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] > target){
                if (isAsc){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else if (arr[mid] < target){
                if (isAsc){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }else{
                return arr[mid];
            }
        }

        return -1;
    }
}
