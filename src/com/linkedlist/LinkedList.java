package com.linkedlist;

public class LinkedList {
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
    }
}
