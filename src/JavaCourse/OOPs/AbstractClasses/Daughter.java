package JavaCourse.OOPs.AbstractClasses;

public class Daughter extends Parent {

    public Daughter(int age, String career) {
        super(age, career);
    }

    @Override
    public void career() {
        System.out.println(this.career);
    }
}
