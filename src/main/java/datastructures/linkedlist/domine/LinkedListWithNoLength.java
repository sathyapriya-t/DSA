package datastructures.linkedlist.domine;

public class LinkedListWithNoLength {

    private Node head;
    private Node tail;

    public LinkedListWithNoLength(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (head == null) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("\nLinked List:");
        if (head == null) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void makeEmpty() {
        head = null;
        tail = null;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }

    //Fast is moving 2 , slow is moving 1 -> because n%2 -> basically 2 node -> one node.
    public Node findMiddleNode() {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean hasLoop() {

        /*Write a method called hasLoop that is part of the linked list class.
        The method should be able to detect if there is a cycle or loop present in the linked list.
        You are required to use Floyd's cycle-finding algorithm (also known as the "tortoise and the hare" algorithm) to detect the loop.
        This algorithm uses two pointers:
           a slow pointer and a fast pointer.
           The slow pointer moves one step at a time, while the fast pointer moves two steps at a time.
           If there is a loop in the linked list, the two pointers will eventually meet at some point. If there is no loop, the fast pointer will reach the end of the list.
         */
        if (head == null) {
            return false;
        }
        if (head.next == null) {
            return false;

        }
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public class Node {
        public int value;
        public Node next;

        Node(int value) {
            this.value = value;
        }
    }

}

