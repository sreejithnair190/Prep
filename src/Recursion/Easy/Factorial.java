package Recursion.Easy;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(findFactorial(6));
    }

    static int findFactorial(int n){

        if (n < 2 ) return 1;

        return n * findFactorial(n - 1);

    }
}
