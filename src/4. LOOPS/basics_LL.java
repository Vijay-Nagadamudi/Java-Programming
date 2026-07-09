package LOOPS;

public class basics_LL {

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(10);
        Node c = new Node(15);
        Node d = new Node(20);

        a.next = b;
        b.next = c;
        c.next = d;

        // Basic beginner implementations this is

    }
}
