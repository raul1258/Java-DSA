package com.company.LinkedList;

public class Node {
    int val;
    Node next;

    public Node() {
        val=0;
        next=null;
    }

    public Node(int val) {
        this.val = val;
        this.next=null;
    }

    public Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
}
