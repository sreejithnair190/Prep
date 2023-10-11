public class Basic {

    public static void main(String[] args) {
        Student sreejith = new Student();
        Student test = new Student(2, "Def", 78.0f);
    }
}

class Student{
    public int rollno;
    public String name;
    public float marks;

    Student(){
        this (1, "Abc", 90.0f);
    }

    Student(int rollno, String name, float marks){
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }
}
