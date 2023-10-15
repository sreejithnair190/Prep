package OOPs.StaticExample;

public class InnerClass {
    static class Test{
        String name;
        Test(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test sreejith = new Test("Sreejith");
        Test vivik = new Test("Vivik");

        System.out.println(sreejith.name);
        System.out.println(vivik.name);
    }

}
