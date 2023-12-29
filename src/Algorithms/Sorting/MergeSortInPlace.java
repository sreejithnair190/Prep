package Algorithms.Sorting;

import java.util.Arrays;

public class MergeSortInPlace {
    public static void main(String[] args) {
        int[] arr = { 8, 3, 4, 12, 5, 6};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSort(int[] arr, int s, int e){
        if (e - s <= 1){
            return;
        }

        int mid = s + (e - s) / 2;

        mergeSort(arr, s, mid);
        mergeSort(arr, mid , e);

        mergeArr(arr, s, mid, e);
    }

    private static void mergeArr(int[] arr, int start, int mid, int end){
        int[] mix = new int[end - start];
        int i = start ,j = mid, k = 0;

        while (i < mid && j < end){
            if (arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i < mid){
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j < end){
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int index = 0; index < mix.length; index++) {
            arr[start + index] = mix[index];
        }
    }
}
