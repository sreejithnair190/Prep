package DataStructures.LinkedList;

import java.security.PublicKey;

public class CircularLL {

    private Node head;
    private Node tail;


    public CircularLL(){
        head = null;
        tail = null;
    }

    public void insert(int value){
        Node node = new Node(value);
        if (head == null){
            head = node;
            tail = head;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void display(){
        if (head!=null){
            Node node = head;
            do {
                System.out.print(node.value + "->");
                node = node.next;
            } while (node != head);
        }else {
            System.out.println("null");
        }
    }


    private class Node{
        private int value;
        private Node next;

        public Node(int value) { this.value = value; }
        public Node (int value, Node node){
            this.next = node;
        }

    }
}
