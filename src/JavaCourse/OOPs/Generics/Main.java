package JavaCourse.OOPs.Generics;

public class Main {
    public static void main(String[] args) {
        CustomArrayList<Integer> list = new CustomArrayList<>();
        for (int i = 0; i < 15; i++) {
            list.add(i + 1);
        }
        System.out.println(list);
    }
}
