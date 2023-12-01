package JavaCourse.OOPs.InterfacesExamples.Extends;

public interface A {
    void fun();
    default void defaultMethod(){
        System.out.println("Default method example");
    }

    static void staticMethod(){
        System.out.println("Hey I am a static method");
    }
}
