package JavaCourse.OOPs.Singleton;

public class Main {
    public static void main(String[] args) {
        SingletonClass obj = SingletonClass.getInstance();
        SingletonClass obj1 = SingletonClass.getInstance();
        System.out.println(obj);
        System.out.println(obj1);
    }
}
