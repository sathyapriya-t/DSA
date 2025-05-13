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

        System.out.println();
        System.out.println("Prepend");
        LinkedList linkedListPrepend = new LinkedList(10);
        linkedListPrepend.append(12);
        linkedListPrepend.prepend(5);
        linkedListPrepend.printValues();
        linkedListPrepend.length();

        System.out.println();
        System.out.println("Remove First");
        LinkedList linkedListRemoveFirst = new LinkedList(10);
        linkedListRemoveFirst.append(5);
        linkedListRemoveFirst.removeFirst();
        linkedListRemoveFirst.printValues();

        System.out.println();
        System.out.println("Set value at a specific index");
        LinkedList linkedListSet = new LinkedList(10);
        linkedListSet.append(12);
        linkedListSet.printValues();
        System.out.println(linkedListSet.set(1,15));
        linkedListSet.printValues();

        System.out.println();
        System.out.println("Insert value at a specific index");
        LinkedList linkedListInsert = new LinkedList(10);
        linkedListInsert.append(15);
        linkedListInsert.append(20);
        linkedListInsert.printValues();
        linkedListInsert.length();
        linkedListInsert.insert(1,17);
        linkedListInsert.insert(0,7);
        System.out.println(linkedListInsert.insert(5,27));
        System.out.println(linkedListInsert.insert(7,27));
        linkedListInsert.printValues();


    }
}
