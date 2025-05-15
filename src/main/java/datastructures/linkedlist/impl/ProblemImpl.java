package datastructures.linkedlist.impl;

import datastructures.linkedlist.domine.FindMiddleNode;
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


    }
}
