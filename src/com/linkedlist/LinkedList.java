package com.linkedlist;

public class LinkedList<T> {
    Node head;
    public void addFirst(Object data){   // To add a node before head and make that node as head.
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void append(Object data) {  // To add a node at last of the linked list.
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        Node tempNode = head;
        while(tempNode.next != null){
            tempNode = tempNode.next;
        }
        tempNode.next=newNode;
    }
    public void insertAfter(String previusNode, Object data) { // Passing the value which i want to search(previusNode) and the new data which i want to insert.
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        Node tempNode = head;
        Node nextNode = tempNode.next;
        while(tempNode.data != previusNode){
            tempNode = tempNode.next;
            nextNode = nextNode.next;  //Traversing simultaneously to reach at the location where need to insert a value.
        }
        tempNode.next=newNode; //Inserting the newNode after the searched value.
        newNode.next = nextNode; // Assigning the nextNode to the newNode.next.
    }
    public void pop() {  //Deleting the first node from the linked list.
        if(head==null){
            System.out.println("Linked list is empty...");
            return;
        }
        head=head.next; //Pointing head to the head.next so the first node will be deleted.
    }
    public void popLast(){  //Deleting the last node of the linked list.
        if(head==null){
            System.out.println("Linked list is empty...");
            return;
        }
        if (head.next == null) {
            head=null;
            return;
        }
        Node prevNode = head;
        Node tempNode = head.next;
        while(tempNode.next != null){
            prevNode = prevNode.next;
            tempNode = tempNode.next;
        }
        prevNode.next = null;
    }

    public void printNode() {
        if (head == null) {
            System.out.println("Linked list is empty...");
            return;
        }
        Node tempNode = head;
        while (tempNode != null) {
            System.out.print(tempNode.data + "=>");
            tempNode = tempNode.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {

        System.out.println("Welcome to the linked list problem. ");
        LinkedList list = new LinkedList();
        list.addFirst("70");  // This will be the first node as we are assigning our first value to head.
        list.addFirst("30");
        list.addFirst("56");
        list.printNode();
        LinkedList<Integer> listappend = new LinkedList();
        listappend.append("56");
        listappend.append("30");
        listappend.append("70");
        listappend.printNode();
        listappend.insertAfter("30","40");
        System.out.println("After inserting a value to the node : ");
        listappend.printNode();
        listappend.pop();
        System.out.println("After deleting the first node : ");
        listappend.printNode();
        listappend.popLast();
        System.out.println("After deleting the last  node : ");
        listappend.printNode();
    }
}
