package com.job2026;

public class DetectLoop {
    static boolean hasLoop(Node head) {
        if (head.next == null) {
            return false;
        }
        Node slow = head;
        Node fast = head;
        while (slow != null || fast != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
    static Node  findBeginofLoop(Node head){
        Node fast=head;
        Node slow=head;
        boolean hasLoop=false;
        while(fast!=null && slow!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                hasLoop=true;
                break;
            }
        }
        if(hasLoop){
            slow=head;
            while (slow!=fast){
                slow=slow.next;
                fast=fast.next;
            }
            return fast;
        }else return null;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        // Create a loop
        head.next.next.next.next.next = head.next.next.next; // 50 -> 20
        System.out.println(findBeginofLoop(head));
       // System.out.println(hasLoop(head));

    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
