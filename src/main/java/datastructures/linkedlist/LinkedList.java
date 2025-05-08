package datastructures.linkedlist;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;
        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        length = 1;
    }
    public void printValues() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void length() {
        System.out.println("Length: " + length);
    }

    public void append(int newValue){
        Node node = new Node(newValue);
        head.next = node;
        tail = node;
        length++;
    }
}