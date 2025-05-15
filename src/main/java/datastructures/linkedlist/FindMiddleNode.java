package datastructures.linkedlist;


public class FindMiddleNode {

    public LinkedList.Node findMiddleNode(LinkedList linkedList){
        int length = linkedList.length();
        double n;
        if(length%2 == 0){
            n = ((double) length/2);
            System.out.println(n);
        }
        else {
            n = Math.ceil((double) length /2) ;
        }
        LinkedList.Node temp = linkedList.getHead();
        for(int i =0; i<n-1;i++){
            temp = temp.next;
        }
        return temp;
    }
}
