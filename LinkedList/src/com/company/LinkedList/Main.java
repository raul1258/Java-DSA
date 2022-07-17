package com.company.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList l1= new LinkedList(); //we created a new linkedlist
        l1.insert(1);
        l1.insert(4);
        l1.insert(2);
        l1.insert(9);
        l1.insert(5);
        l1.printLinkedList();
        l1.delete(2);
        l1.printLinkedList();
        l1.delete(9);
        l1.printLinkedList();
    }
}
