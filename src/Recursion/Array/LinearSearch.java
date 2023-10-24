package Recursion.Array;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr1 = {0, 1, 8, 4, 6, 8, 21, 8, 9};
        System.out.println(search(arr1, 0, 8));
        System.out.println(findAllIndex(arr1, 8, new ArrayList<>(), 0));
        System.out.println(findAllIndex(arr1, 8, 0));
    }

    static int search(int[] arr, int index, int target){
        if (arr.length - 1 == index) return -1;

        if (arr[index] == target) return index;

        return search(arr, index + 1, target);
    }

    static ArrayList<Integer> findAllIndex(int[] arr, int target, ArrayList<Integer> list, int index){
        if (arr.length - 1 == index) return list;

        if (arr[index] == target){
            list.add(index);
        }

        return findAllIndex(arr, target, list, index + 1);
    }

    // Returning ArrayList from below functions
    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();

        if (arr.length - 1 == index) return list;

        if (arr[index] == target){
            list.add(index);
        }

        ArrayList<Integer> belowList = findAllIndex(arr, target, index + 1);

        list.addAll(belowList);

        return list;
    }
}
