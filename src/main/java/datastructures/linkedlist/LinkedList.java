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

    public void append(int newValue) {
        Node node = new Node(newValue);
        if (length == 0) {
            head = node;
        } else {
            tail.next = node;
        }
        tail = node;
        length++;
    }

    public Integer removeLast() {
        if (length == 0) {
            return null;
        } else {
            Node temp = head;
            Node pre = head;
            while (temp.next != null) {
                pre = temp;
                temp = temp.next;
            }
            tail = pre;
            tail.next = null;
            length--;
            if (length == 0) {
                head = null;
                tail = null;
            }
            return temp.value;
        }
    }

    public Integer prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
            length++;
        } else {
            newNode.next = head;
            head = newNode;
            length++;
        }
        return value;
    }

    public void removeFirst() {
        if (length == 0) {
            System.out.println("List is empty");
        } else {
            Node temp = head;
            head = head.next;
            temp.next = null;
        }
        length--;
        if (length == 0) {
            tail = null;
        }
    }

    public Boolean set(int index, int value){
        if(index < 0 || index> length){
           return false;
        }
        else {
            Node temp = head;
            for(int i = 0; i<index;i++){
                temp = temp.next;
            }
            temp.value = value;
            return true;
        }
    }

    public Boolean insert(int index, int value){
        if(index<0 || index > length){
            return false;
        } else if (index == 0) {
            prepend(value);
            return true;
        } else if (index == length-1) {
            append(value);
            return true;
        }
        else {
            Node temp = head;
            Node pre = head;
            for (int i = 0; i < index; i++) {
                pre = temp;
                temp = temp.next;
            }
            Node newNode = new Node(value);
            pre.next = newNode;
            newNode.next = temp;
            length++;
            return true;

        }
    }
}