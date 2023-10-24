package Recursion.Easy;

public class PrintNNumbers {
    public static void main(String[] args) {
//        printNto1(5);
        print1ToN(5);
    }

    static void printNto1(int n){
        if (n == 0) return;

        System.out.println(n);
        printNto1(n - 1);
    }

    static void print1ToN(int n){
        if (n==0) return;

        print1ToN(n - 1);
        System.out.println(n);
    }
}
