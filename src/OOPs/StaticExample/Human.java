package OOPs.StaticExample;

public class Human {
    int age;
    String name;
    int salary;
    static long population;


    public Human(int age, String name, int salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        Human.population +=1;
    }
}
