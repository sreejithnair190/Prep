package Recursion.Easy;

public class ReverseANumber {
    public static void main(String[] args) {
        System.out.println(reverse(1345, 0));
        System.out.println(reverse2(1345));
    }

    static int reverse(int n, int ans){
        if (n == 0) return ans;
        int newAns = ans * 10 + (n % 10);
        return reverse(n / 10, newAns);
    }

    static int reverse2(int n){
        int digits = (int) Math.log10(n) + 1;
        return helper(n, digits);
    }

    static int helper(int n, int digits){
        if (n % 10 == n) return n;

        return (n % 10) * (int) Math.pow(10, digits - 1) + helper(n / 10, digits - 1);
    }

}
