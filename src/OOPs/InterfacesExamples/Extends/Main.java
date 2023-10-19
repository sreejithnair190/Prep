package OOPs.InterfacesExamples.Extends;

public class Main implements B{
    @Override
    public void greet() {

    }

    @Override
    public void fun() {

    }

    public static void main(String[] args) {
        A.staticMethod();
        Main main = new Main();
        main.defaultMethod();
    }
}
