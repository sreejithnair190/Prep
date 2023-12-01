package JavaCourse.OOPs.Generics;

import java.util.Arrays;

public class CustomArrayList<T> {
//    public class CustomArrayList<T extends Number> { WildCard
    private Object[] data;
    private final int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList(){
        this.data = new Object[DEFAULT_SIZE];
    }

    private boolean isFull(){
        return size == data.length;
    }

    private void resize(){
        Object[] temp = new Object[data.length * 2];
        for (int i = 0; i < data.length; i++) {
          temp[i] = data[i];
        }
//        System.arraycopy(data, 0, temp, 0, data.length);
        data = temp;
    }

    public void add(int num){
        if (isFull()){
            resize();
        }

        data[size++] = num;
    }

    public T get(int index){
        return (T)data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, int value){
        data[index] = value;
    }

    public T remove(){
        return (T)data[--size];
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }
}
