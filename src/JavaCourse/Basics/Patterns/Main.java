// Pattern Qns: https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/09-patterns.md

package JavaCourse.Basics.Patterns;

public class Main {
    public static void main(String[] args) {
//        pattern1(4);
//        pattern2(4);
//        pattern3(4);
//        pattern4(5);
//        pattern5(5);
//        pattern28(5);
//        pattern30(5);
//        pattern17(5);
        pattern31(4);
    }

    static void pattern1(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for (int i = 1; i < 2 * n; i++) {
            int totalCols = i > n ? 2 * n - i : i;
            for (int j = 1; j <= totalCols; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern17(int n){
        for (int i = 1; i < 2 * n; i++) {
            int spaces = i < n ? n - i : i - n;

            while (spaces > 0){
                System.out.print("  ");
                spaces--;
            }

            int totalCols = i > n ? 2 * n - i : i;

            for (int j = totalCols; j >= 1; j--) {
                System.out.print(j + " ");
            }

            for (int j = 2; j <= totalCols; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }

    static void pattern28(int n){
        for (int i = 1; i < 2 * n; i++) {
            int totalCols = i > n ? 2 * n - i : i;
            int spaces = n - totalCols;
            while (spaces > 0){
                System.out.print(" ");
                spaces--;
            }
            for (int j = 1; j <= totalCols; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern30(int n){
        for (int i = 1; i <= n; i++) {
            int spaces = n - i;
            while (spaces > 0){
                System.out.print("  ");
                spaces--;
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }

    static void pattern31(int n){
        int N = 2 * n;
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= N; j++) {
                int toPrint = n - (Math.min(Math.min(N - j,  N - i), Math.min(i, j)));
                toPrint = toPrint == 0 ? 1 : toPrint;
                System.out.print(toPrint + " ");
            }
            System.out.println();
        }
    }
}
