public class FloorOfANumber {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 17, 18, 29, 35, 45, 76, 78, 89, 97};
        int target = 52;

        int ans  = binarySearch(arr, target);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr,  int target){
        int start = 0;
        int end = arr.length - 1;

        if (target < arr[start]){
            return -1;
        }

        while (start <= end){
            int mid = start + (end - start) / 2;
            if (arr[mid] > target){
                end = mid - 1;
            }else if (arr[mid] < target){
                start = mid + 1;
            }else{
                return arr[mid];
            }
        }

        return arr[end];
    }
}
