package Recursion.Basic;

public class Fibonacci {
    public static void main(String[] args) {
//        int ans = findFibonacci(10);
        for (int i = 0; i < 50; i++) {
            System.out.println(FiboFormula(i));;
        }
    }

    static int FiboFormula(int n){
        return (int) (Math.pow((1 + Math.sqrt(5))/ 2, n) / Math.sqrt(5));
    }

    static int findFibonacci(int n){
        if ( n == 0 || n == 1){
            return n;
        }
        return findFibonacci(n - 1) + findFibonacci(n - 2);
    }
}
