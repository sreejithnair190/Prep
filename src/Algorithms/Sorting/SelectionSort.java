package Algorithms.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 2, 1};
//        sort(arr);
        recursive(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, last);
            swap(arr, maxIndex, last);
        }
    }

    static int getMaxIndex(int[] arr,  int last){
        int max = 0;
        for (int i = 0; i <= last; i++) {
            if (arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void recursive(int[] arr, int e, int s, int max){
        if (e == 0) return;

        if (s < e){
            if (arr[s] > arr[max]){
                recursive(arr,  e, s + 1, s);
            }else {
                recursive(arr,  e, s + 1, max);
            }
        }else{
            swap(arr, e - 1, max);
            recursive(arr, e - 1, 0, 0);
        }
    }
}
