package JavaCourse.OOPs.Generics.Comparison;

public class Student implements Comparable<Student> {
    int rollNo;
    float marks;

    public Student(int rollNo, float marks) {
        this.rollNo = rollNo;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return marks + "";
    }

    @Override
    public int compareTo(Student o) {
        int diff = (int) (this.marks - o.marks);
        // if diff is 0 then both are equal
        // if diff < 1 then o is greater else this is greater
        return diff;
    }
}
