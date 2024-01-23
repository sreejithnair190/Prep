package DataStructures.LinkedList;

public class DoublyLL {
    private Node head;
    private int size;
    private class Node {
        private int value;
        private Node next;
        private Node previous;

        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node next, Node previous){
            this.value = value;
            this.next = next;
            this.previous = previous;
        }
    }

    public DoublyLL(){
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.previous = null;
        if (this.head != null){
            head.previous = node;
        }
        this.head = node;
        this.size++;
    }

    public void display(){
        Node node = head;
        Node last = null;
        while (node !=null){
            System.out.print(node.value + "->");
            last = node;
            node = node.next;
        }
        System.out.print("END");
        System.out.println();
        System.out.println("Print in reverse");
        while (last !=null){
            System.out.print(last.value + "->");
            last = last.previous;
        }
        System.out.print("START");
    }

    public void insertLast(int val){
        Node node = new Node(val);
        if (head == null){
            head = node;
            return;
        }
        Node lastNode = head;
        while (lastNode.next != null){
            lastNode = lastNode.next;
        }
        lastNode.next = node;
        node.previous = lastNode;
        this.size++;
    }

    public Node getNode(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void insert(int val, int index){
        Node prevNode = getNode(index - 1);
        Node node = new Node(val, prevNode.next, prevNode);
        prevNode.next = node;
        node.next.previous = node;
    }
}
