package JavaCourse.OOPs.AbstractClasses;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(23, "Engineer");
        son.career();

        Daughter daughter = new Daughter(19, "Chef");
        daughter.career();
    }
}
