package JavaCourse.OOPs.LambdaFunction;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i+1);
        }

//        list.forEach((item) -> System.out.println(item * 2));

        Consumer<Integer> fun = (item) -> System.out.println(item * 2);
        list.forEach(fun);

        Operation sum = (a, b) -> a + b;
        Operation multiply = (a, b) -> a * b;
        Operation divide = (a, b) -> a / b;
        Operation sub = (a, b) -> a - b;

        Main main = new Main();
        int ans = main.operate(4, 5, sum);
        System.out.println(ans);
    }

    private int operate(int a, int b, Operation op) {
        return op.operation(a, b);
    }
}

interface Operation{
    int operation(int a, int b);
}
