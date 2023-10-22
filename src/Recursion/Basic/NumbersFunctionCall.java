package Recursion.Basic;

public class NumbersFunctionCall {
    public static void main(String[] args) {
        priint1(1);
    }

    static void priint1(int n){
        System.out.println(n);
        priint2(2);
    }

    static void priint2(int n){
        System.out.println(n);
        priint3(3);
    }

    static void priint3(int n){
        System.out.println(n);
        priint4(4);
    }

    static void priint4(int n){
        System.out.println(n);
        priint5(5);
    }

    static void priint5(int n){
        System.out.println(n);
    }
}
