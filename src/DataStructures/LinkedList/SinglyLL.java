package DataStructures.LinkedList;

public class SinglyLL {

    private Node head;
    private Node tail;
    private int size;

    public SinglyLL(){
        this.size = 0;
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = this.head;
        this.head = node;
        if (tail == null){
            this.tail = head;
        }
        this.size++;
    }

    public void insert(int val){
        if (this.tail == null){
            this.insertFirst(val);
            return;
        }
        Node node = new Node(val);
        this.tail.next = node;
        this.tail = node;
        this.size++;
    }

    public void insert(int val, int index){
        if (index == 0){
            this.insertFirst(val);
            return;
        }
        if (index == this.size){
            this.insert(val);
            return;
        }

        Node temp = this.head;
        int count = 0;
        while (count < index - 1){
            temp = temp.next;
            count++;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        this.size++;
    }

    public void deleteFirst(){
        this.head = this.head.next;
        if (this.head == null){
            this.tail = null;
        }
        this.size--;
    }

    public void deleteLast(){
        Node node = getNode(this.size - 2);
        node.next = null;
        this.tail = node;
        this.size--;
    }

    public void delete(int index){
        if (index == 0){
            this.deleteFirst();
        }
        if (index == this.size - 1){
            this.deleteLast();
        }

        Node node = getNode(index - 1);
        node.next = node.next.next;
        this.size--;
    }

    public Node getNode(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void display(){
        Node temp = this.head;
        while (temp != null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.print("END");
    }
}
