package datastructures.linkedlist.domine;

public class LinkedListNoTail {

    private Node head;
    private int length;

    public LinkedListNoTail(int value) {
        Node newNode = new Node(value);
        head = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nLinked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void makeEmpty() {
        head = null;
        length = 0;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        length++;
    }

    //IdealLogic
    //Initialize two variable one variable stays in plays amd other variable loops and compares each value, if found duplicates remove.
    //Then Move one step forward and loop through again. Until removes all duplicates
    public void removeDuplicatesIdeal(){
        Node current = head;
        while(current!=null){
            Node move = current;
            while(move.next !=null){
                if(current.value == move.next.value){
                    move.next = move.next.next;
                    length --;
                }
                else{
                    move = move.next;
                }
            }
            current = current.next;

        }
    }
    //My logic
    public void removeDuplicates() {
        Node current = head;
        Node move = head;
        while (current != null) {
            Node pre = move;
            move = move.next;
            while (move != null) {
                System.out.println(current.value + " " + move.value);
                if (current.value == move.value) {
                    pre.next= move.next;
                    length--;
                }
                pre = move;
                move = move.next;
            }
            current = current.next;
            move = current;


        }
    }

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

}
