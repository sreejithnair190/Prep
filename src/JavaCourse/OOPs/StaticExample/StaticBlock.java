package JavaCourse.OOPs.StaticExample;

public class StaticBlock {
    static int a = 5;
    static int b;

    static {
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(obj.a + " " + obj.b);

        StaticBlock.b += 5;

        StaticBlock obj1 = new StaticBlock();
        System.out.println(obj1.a + " " + obj1.b);
    }
}
