package JavaCourse.Basics.ConditionalsLoops;

public class CountOccurunce {
    public static void main(String[] args) {
        int n = 3928212;
        int c = 2;
        int o = 0;

        while (n > 0){
            if (n % 10 == c) o++;
            n /= 10;
        }

        System.out.println(o);
    }
}
