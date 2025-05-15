package datastructures.linkedlist.impl;

import datastructures.linkedlist.FindMiddleNodeLinkedList;

public class ProblemImpl {

    public static void main(String[] args) {

        // FindMiddleNodeLinkedList
        System.out.println("Finding a middle node when we don't have a length attribute and need to loop over the list only once");
        FindMiddleNodeLinkedList findMiddleNodeLinkedList = new FindMiddleNodeLinkedList(10);
        findMiddleNodeLinkedList.append(10);
        findMiddleNodeLinkedList.append(12);
        findMiddleNodeLinkedList.append(15);
        findMiddleNodeLinkedList.append(15);
        System.out.println(findMiddleNodeLinkedList.findMiddleNode().value);

    }
}
