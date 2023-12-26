package Algorithms.Sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 2, 1};
//        sort(arr);
        recursive(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j-1]){
                    arr[j] = arr[j] ^ arr[j - 1];
                    arr[j - 1] = arr[j] ^ arr[j - 1];
                    arr[j] = arr[j] ^ arr[j - 1];
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    static void recursive(int [] arr, int e, int s){
        if (e == 0) return;

        if (s < e){
            if (arr[s] > arr[s + 1]){
                int temp = arr[s];
                arr[s] = arr[s + 1];
                arr[s + 1] = temp;
            }
            recursive(arr, e, s + 1);
        }else{
            recursive(arr, e - 1, 0);

        }
    }
}
