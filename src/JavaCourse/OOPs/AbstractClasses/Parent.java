package JavaCourse.OOPs.AbstractClasses;

public abstract class Parent {
    protected int age;
    protected String career;

    final int VALUE;

    public Parent(int age, String career) {
        this.age = age;
        this.career = career;
        this.VALUE = 234;
    }

    public abstract void career();
}
