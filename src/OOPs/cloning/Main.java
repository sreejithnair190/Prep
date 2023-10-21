package OOPs.cloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human sreejith = new Human(23, "Sreejith");
        Human humanClone = (Human) sreejith.clone();
        System.out.println(humanClone.toString());
    }
}
