package OOPs.cloning;

import java.util.Arrays;

public class Human implements Cloneable{
    int age;
    String name;
    int[] arr;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", arr='" + Arrays.toString(arr) + '\'' +
                '}';
    }

    Human(Human human){
        this.age = human.age;
        this.name = human.name;
    }

    //Shallow Copy
//    @Override
//    public Object clone() throws CloneNotSupportedException{
//        return super.clone();
//    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        Human twin = (Human) super.clone();
        twin.arr = new int[twin.arr.length];
        for (int i = 0; i < twin.arr.length; i++) {
            twin.arr[i] = this.arr[i];
        }
        return twin;
    }

}
