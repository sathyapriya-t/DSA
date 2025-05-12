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

        System.out.println();
        System.out.println("Remove Last: ");
        LinkedList linkedListRemoveLast = new LinkedList(10);
        linkedListRemoveLast.append(20);
        linkedListRemoveLast.removeLast();
        linkedListRemoveLast.printValues();
        Integer removed = linkedListRemoveLast.removeLast();
        System.out.println("removed value: "+ removed);
        linkedListRemoveLast.printValues();
        linkedListRemoveLast.length();
        linkedListRemoveLast.append(20);
        linkedListRemoveLast.length();


    }
}
