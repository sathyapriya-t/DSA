package datastructures.linkedlist.domine;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    public LinkedList(int value) {
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        length = 1;
    }

    public void printValues() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public Node getHead() {
        //System.out.println("Head: " + head.value);
        return head;
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public int length() {
        //System.out.println("Length: " + length);
        return length;
    }

    public void append(int newValue) {
        Node node = new Node(newValue);
        if (length == 0) {
            head = node;
        } else {
            tail.next = node;
        }
        tail = node;
        length++;
    }

    public Node removeLast() {
        if (length == 0) {
            return null;
        } else {
            Node temp = head;
            Node pre = head;
            while (temp.next != null) {
                pre = temp;
                temp = temp.next;
            }
            tail = pre;
            tail.next = null;
            length--;
            if (length == 0) {
                head = null;
                tail = null;
            }
            return temp;
        }
    }

    public Integer prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
        return value;
    }

    public Node removeFirst() {
        if (length == 0) {
            return null;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if (length == 0) {
            tail = null;
        }
        return temp;
    }

    public Boolean set(int index, int value) {
        if (index < 0 || index > length) {
            return false;
        } else {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            temp.value = value;
            return true;
        }
    }

    public Boolean insert(int index, int value) {
        if (index < 0 || index > length) {
            return false;
        } else if (index == 0) {
            prepend(value);
            return true;
        } else if (index == length - 1) {
            append(value);
            return true;
        } else {
            Node temp = head;
            Node pre = head;
            for (int i = 0; i < index; i++) {
                pre = temp;
                temp = temp.next;
            }
            Node newNode = new Node(value);
            pre.next = newNode;
            newNode.next = temp;
            length++;
            return true;

        }
    }

    public Node remove(int index) {
        if (index < 0 || index > length) {
            return null;
        } else if (index == 0) {
            return removeFirst();
        } else if (index == length - 1) {
            return removeLast();
        } else {
            Node pre = head;
            Node temp = head;
            for (int i = 0; i < index; i++) {
                pre = temp;
                temp = temp.next;
            }
            pre.next = temp.next;
            temp.next = null;
            length--;
            return temp;
        }
    }

    public void reverse(){
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;
        for(int i =0;i< length;i++){
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }

     public class Node {
        public int value;
        public Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public Integer get(int index){
        if(index<=length) {
            if (index == 0) {
                return head.value;
            } else {
                Node temp = head;
                int count = 0;
                while (count != index) {
                    head = head.next;
                    count++;
                    temp = head;

                }
                return temp.value;
            }
        }
        return null;
    }

    public Node getUsingForLoop(int index){
        if(index<0 || index>length){
            return null;
        }
        else {
            Node temp = head;
            for(int i = 0;i<index;i++){
                temp = temp.next;
            }
            return temp;
        }
    }
}