package Recursion.Easy;

public class CountZero {
    public static void main(String[] args) {
        System.out.println(countZero(230300023));
    }

    static int countZero(int n){
        return helper(n, 0);
    }

    static int helper(int n, int count){
        if (n == 0) return count;

        if (n % 10 == 0) return helper(n / 10, count + 1);

        return helper(n / 10, count);
    }
}
