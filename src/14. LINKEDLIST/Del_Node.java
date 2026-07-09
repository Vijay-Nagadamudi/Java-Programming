package LINKEDLIST;

public class Del_Node {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }

    static void del_Node_Last(Node t){
        t.data = t.next.data;
        t.next = t.next.next;
        return;
    }

    static void display(Node t){
        while(t!=null) {
            System.out.print(t.data + " ");
            t = t.next;
        }
        return;
    }

    public static void main(String[] args) {
        Node n1 = new Node(2);
        Node n2 = new Node(4);
        Node n3 = new Node(5);
        Node n4 = new Node(7);
        Node n5 = new Node(9);
        Node n6 = new Node(10);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;

        del_Node_Last(n4);
        display(n1);

    }
}
