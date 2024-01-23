package Algorithms.Subarray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class KadanesAlgorithm {
    public static void main(String[] args) {
        int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int ansStart = -1;
        int ansEnd = -1;


        for (int i = 0; i < arr.length; i++) {
            if (sum == 0){
                ansStart = i;
            }

            sum += arr[i];

            if (sum < 0){
                sum = 0;
            }

            if (sum > max){
                max = sum;
                ansEnd = i;
            }
        }
        System.out.println(max);
        System.out.println(Arrays.toString(new int[]{ansStart, ansEnd}));
    }
}
