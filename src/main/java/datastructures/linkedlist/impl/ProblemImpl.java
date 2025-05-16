package datastructures.linkedlist.impl;

import datastructures.linkedlist.domine.FindMiddleNode;
import datastructures.linkedlist.domine.LinkedListNoTail;
import datastructures.linkedlist.domine.LinkedListWithNoLength;
import datastructures.linkedlist.domine.LinkedList;

public class ProblemImpl {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("Finding a middle node");
        LinkedList linkedList1 = new LinkedList(10);
        linkedList1.append(12);
        linkedList1.append(15);
        linkedList1.append(17);
        linkedList1.append(20);
        FindMiddleNode findMiddleNode = new FindMiddleNode();
        LinkedList.Node middleNode = findMiddleNode.findMiddleNode(linkedList1);
        System.out.println(middleNode == null ? null: middleNode.value );

        /*_______________________________________________________________________________________________________*/
        //LinkedListWithNoLength

        //Finding a middle node when we don't have a length attribute and need to loop over the list only once
        System.out.println();
        System.out.println("Finding a middle node when we don't have a length attribute and need to loop over the list only once");
        LinkedListWithNoLength linkedListWithNoLength = new LinkedListWithNoLength(10);
        linkedListWithNoLength.append(10);
        linkedListWithNoLength.append(12);
        linkedListWithNoLength.append(15);
        linkedListWithNoLength.append(15);
        System.out.println(linkedListWithNoLength.findMiddleNode().value);

        //HAS LOOP
        /*
        Floyd's cycle-finding algorithm -> has loop ->
        Initialize two variable -> slow and Fast
        Move slow -> 1 and fast 2 for each iteration
        check if match.. if the loop exist it will match */
        System.out.println();
        System.out.println("Finding if the List HAS LOOP");
        LinkedListWithNoLength linkedListHasLoop = new LinkedListWithNoLength(10);
        linkedListHasLoop.append(20);
        linkedListHasLoop.append(30);
        linkedListHasLoop.append(40);
        linkedListHasLoop.append(50);
        linkedListHasLoop.getTail().next = linkedListHasLoop.getHead();
        System.out.println(linkedListHasLoop.hasLoop());

        //Finding Kth node from the end
        /*This is a common technique in computer science known as the
        'fast-pointer / slow-pointer' or 'runner' technique
        ->initialize two variable(slow, fast) move fast to k times using loop and
        ->then move both variable one at a time until fast reached null.
        ->finally slow will be at kth node from the end.(because the distance between two node is k)
        */
        System.out.println();
        System.out.println("Finding Kth node from the end");
        LinkedListWithNoLength linkedListKthNodeFromEnd = new LinkedListWithNoLength(10);
        linkedListKthNodeFromEnd.append(20);
        linkedListKthNodeFromEnd.append(30);
        linkedListKthNodeFromEnd.append(40);
        linkedListKthNodeFromEnd.append(50);
        linkedListKthNodeFromEnd.append(60);
        System.out.println(linkedListKthNodeFromEnd.findKthFromEnd(2).value);
        LinkedListWithNoLength.Node kthFromEnd = linkedListKthNodeFromEnd.findKthFromEnd(6);
        System.out.println(kthFromEnd == null ? null : kthFromEnd.value);


        //RemoveDuplicates
        /*
        //Initiate two varibles and one will stay will other loops through and compares each number
        */
        System.out.println();
        System.out.println("Remove Duplicates from the list when it has no tail");
        LinkedListNoTail linkedListRemoveDuplicates = new LinkedListNoTail(10);
        linkedListRemoveDuplicates.append(20);
        linkedListRemoveDuplicates.append(20);
        linkedListRemoveDuplicates.append(10);
        linkedListRemoveDuplicates.append(20);
        linkedListRemoveDuplicates.append(10);
        linkedListRemoveDuplicates.append(20);
        linkedListRemoveDuplicates.removeDuplicatesIdeal();
        linkedListRemoveDuplicates.printList();
    }
}
