package DataStructures.Strings;

import java.util.Random;

public class RandomString {
    static String randomString(int size){
        StringBuffer sb = new StringBuffer(size);
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            char ch = (char) (97 + 26 * random.nextFloat());
            sb.append(ch);
        }
        return sb.toString();
    }
}
