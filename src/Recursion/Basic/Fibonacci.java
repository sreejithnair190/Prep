package Recursion.Basic;

public class Fibonacci {
    public static void main(String[] args) {
        int ans = findFibonacci(10);
        System.out.println(ans);
    }

    static int findFibonacci(int n){
        if ( n == 0 || n == 1){
            return n;
        }
        return findFibonacci(n - 1) + findFibonacci(n - 2);
    }
}
