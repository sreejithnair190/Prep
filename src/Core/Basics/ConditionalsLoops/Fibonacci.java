package Core.Basics.ConditionalsLoops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = 0;
        int i = 1;
        int count = 2;

        if (n == 0){
            System.out.println(p);
        }else if (n > 0 && n <= 2){
            System.out.println(i);
        }else {
            while (count <= n){
                int temp = i;
                i+=p;
                p = temp;
                count++;
            }
        }

        System.out.println(i);
    }
}
