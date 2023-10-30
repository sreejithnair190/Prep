package DataStructures.Strings;

public class SBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Nemo");

        StringBuffer sb2 = new StringBuffer("Sreejith Nair");
        StringBuffer sb3 = new StringBuffer(30);

        String str = sb.toString();

        String randomString = RandomString.randomString(5);

        System.out.println(randomString);
    }
}
