package datastructures.linkedlist.impl;

import datastructures.linkedlist.domine.LinkedList;

//For remove last and first consider the edge case(Length 1)
public class LinkedListImpl {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(10);
        System.out.println(linkedList.getHead().value);
        linkedList.getTail();
        linkedList.printValues();
        System.out.println("Appended");
        linkedList.append(20);
        System.out.println(linkedList.getHead().value);
        linkedList.getTail();
        linkedList.printValues();
        linkedList.length();

        System.out.println();
        System.out.println("Remove Last: ");
        LinkedList linkedListRemoveLast = new LinkedList(10);
        linkedListRemoveLast.append(20);
        linkedListRemoveLast.removeLast();
        linkedListRemoveLast.printValues();
        LinkedList.Node removed = linkedListRemoveLast.removeLast();
        System.out.println("removed value: "+ removed.value);
        linkedListRemoveLast.printValues();
        linkedListRemoveLast.length();
        linkedListRemoveLast.append(20);
        linkedListRemoveLast.length();

        System.out.println();
        System.out.println("Prepend");
        LinkedList linkedListPrepend = new LinkedList(10);
        linkedListPrepend.append(12);
        System.out.println(linkedListPrepend.prepend(5));
        linkedListPrepend.printValues();
        linkedListPrepend.length();

        System.out.println();
        System.out.println("Remove First");
        LinkedList linkedListRemoveFirst = new LinkedList(10);
        linkedListRemoveFirst.append(5);
        linkedListRemoveFirst.removeFirst();
        linkedListRemoveFirst.printValues();

        System.out.println();
        System.out.println("Get the value based on index");
        LinkedList linkedListGet = new LinkedList(10);
        linkedListGet.append(5);
        linkedListGet.append(12);
        System.out.println(linkedListGet.get(2));

        System.out.println();
        System.out.println("Get the value based on index using for loop");
        LinkedList linkedListGet1 = new LinkedList(10);
        linkedListGet1.append(5);
        linkedListGet1.append(12);
        linkedListGet1.length();
        System.out.println(linkedListGet1.getUsingForLoop(2).value);


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

        System.out.println();
        System.out.println("Removing value from specific place");
        LinkedList linkedListRemove = new LinkedList(10);
        linkedListRemove.append(12);
        linkedListRemove.append(20);
        linkedListRemove.printValues();
        linkedListRemove.length();
        System.out.println(linkedListRemove.remove(1).value);
        linkedListRemove.printValues();

        System.out.println();
        System.out.println("Reversing the list");
        LinkedList linkedListReverse = new LinkedList(10);
        linkedListReverse.append(20);
        linkedListReverse.append(30);
        linkedListReverse.printValues();
        linkedListReverse.reverse();
        linkedListReverse.printValues();

    }
}
