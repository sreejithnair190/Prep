package JavaCourse.OOPs.StaticExample;

public class Main {
    public static void main(String[] args) {
        new Human(23, "Sreejith", 15000);
        System.out.println(Human.population);

        new Human(22, "James", 43000);
        System.out.println(Human.population);
    }

}
