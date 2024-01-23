package DataStructures.LinkedList;

public class Main {
    public static void main(String[] args) {
//        singlyLLDemo();
//        doublyLLDemo();
        circularLLDemo();
    }

    public static void circularLLDemo() {
        CircularLL list = new CircularLL();
        for (int i = 0; i < 10; i++) {
//            list.insertFirst(i);
            list.insert(i);
        }
        list.display();
    }

    public static void doublyLLDemo(){
        DoublyLL list = new DoublyLL();
        for (int i = 0; i < 10; i++) {
//            list.insertFirst(i);
            list.insertLast(i);
        }
        list.insert(45, 4);
        list.display();
    }

    public static void singlyLLDemo(){
        SinglyLL list = new SinglyLL();
        for (int i = 0; i < 10; i++) {
//            list.insertFirst(i);
            list.insert(i);
        }
        list.insert(34, 5);
        list.deleteFirst();
        list.deleteLast();
        list.delete(5);
        list.display();
    }
}
