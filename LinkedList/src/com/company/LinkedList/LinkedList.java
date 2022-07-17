package com.company.LinkedList;

public class LinkedList {
    Node head;
    void insert(int x){
        /*
        1.Create a new node(Node n=new Node(x);)
        2.if head==null, head =n,return
        3. go to the last node
        4.last.next=n;
         */
        Node n=new Node(x);
        if(this.head==null){
            this.head=n;
            return;
        }
        Node temp = head;
        while(temp.next !=null){
            temp=temp.next;
        }
        // above while loop will and when ,temp.next=null or temp refers the last node
        temp.next=n;
        return;
    }
    void printLinkedList(){
     if(head==null){
         System.out.println("Your LinkedList is empty");
         return;
     }
     Node temp=head;
     while(temp!=null){
         System.out.print(temp.val+" ");
         temp=temp.next;
     }
        System.out.println();
    }
    void delete(int x){
        Node prev = null, curr = head;
        while(curr != null && curr.val != x){
            prev = curr; // prev is taking the present value of curr (which  will be previous for the new value of curr)
            curr = curr.next;
        }
        // curr will point to the node to be deleted
        // 1. Element to be deleted not found
        if(curr == null){
            System.out.println(x + " is not present in the linked list");
            return;
        }
        // 2. Node to be deleted is the head node
        else if(prev == null){
            head = curr.next; // head = head.next;
            curr.next = null;
            return;
        }
        // 3. Node to be deleted is a middle/ last node
        else{
            prev.next = curr.next;
            curr.next = null;
            return;
        }
    }
}
