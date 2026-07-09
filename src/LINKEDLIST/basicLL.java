package LINKEDLIST;

public class basicLL {

    public static void Display(Node head){
        if(head == null) return;
        System.out.print(head.data + " ");
        Display(head.next);
    }

    public static class Node{
        int data;
        Node next; // Default value will be NULL

        public Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node n1 = new Node(4);
        Node n2 = new Node(5);
        Node n3 = new Node(8); // We made three nodes but no connection between them is made till now

        n1.next = n2;
        n2.next = n3;
        // n3 will be pointing to the NULL by default

        Display(n1);

    }

}

// Here we manually mapped each value of the linked list and not happening by default.
