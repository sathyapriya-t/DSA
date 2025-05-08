package datastructures.linkedlist;

public class LinkedListImpl {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(10);
        linkedList.getHead();
        linkedList.getTail();
        linkedList.printValues();
        System.out.println("Appended");
        linkedList.append(20);
        linkedList.getHead();
        linkedList.getTail();
        linkedList.printValues();
        linkedList.length();
    }
}
