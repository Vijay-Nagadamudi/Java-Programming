package LINKEDLIST;

public class Reverse_Recusrion {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }
    }

    static void display(Node head){
        if(head == null) return;
        System.out.print(head.data + " ");
        display(head.next);
    }

    static Node reverse(Node head){
        if(head.next == null) return head ;
        Node Newhead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return Newhead;
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(10);
        Node c = new Node(15);
        Node d = new Node(20);
        Node e = new Node(25);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        System.out.println("Before Reversing : ");
        display(a);
        Node head = reverse(a);
        System.out.println();
        System.out.println("After Reversing : ");
        display(head);
    }
}
