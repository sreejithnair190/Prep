package OOPs.AbstractClasses;

public class Son extends Parent {

    public Son(int age, String career) {
        super(age, career);
    }

    @Override
    public void career() {
        System.out.println(this.career);
    }
}
