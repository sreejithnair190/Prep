package DataStructures.Strings;

public class Main {
    public static void main(String[] args) {
        String a = "Nemo";
        String b = "Nemo";
        System.out.println(a == b);

        String c = new String("Nemo");
        String d = new String("Nemo");
        System.out.println(c==d);
        System.out.println(c.equals(d));

        System.out.println(a.charAt(0));
    }
}
