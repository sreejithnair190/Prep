package Leetcode.Easy;
// Number of steps to reduce a number to zero
//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
//Given an integer num, return the number of steps to reduce it to zero.
// In one step, if the current number is even, you have to divide it by 2,
// otherwise, you have to subtract 1 from it
public class Lc1342numberOfStepsToReduceANumberToZero {
    public static void main(String[] args) {
        System.out.println(countSteps(14));
    }

    static int countSteps(int n){
        return helper(n, 0);
    }

    static int helper(int n, int steps){
        if (n == 0) return steps;

        if (n % 2 == 0) return helper(n / 2, steps + 1);

        return helper(n - 1, steps + 1);
    }
}
