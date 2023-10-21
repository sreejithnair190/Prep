package OOPs.Generics.Comparison;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(1, 84.5f);
        Student s2 = new Student(2, 88.5f);
        Student s3 = new Student(3, 78.5f);
        Student s4 = new Student(4, 86.5f);
        Student s5 = new Student(5, 98.5f);
        Student s6 = new Student(6, 77.5f);

        Student[] students = {s5, s2, s4, s1, s6, s3 };
        System.out.println(Arrays.toString(students));
        Arrays.sort(students, (o1, o2) -> (int)(o1.marks - o2.marks));
        System.out.println(Arrays.toString(students));

        if (s1.compareTo(s2) < 0){
            System.out.println("Student2 scored more marks ");
        }
    }
}
