package LINKEDLIST;

public class FInd_nth_from_last {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }

    static Node Nth_Last_2(Node t,int n){
        Node slow = t;
        Node fast = t;
        for(int i=0;i<n;i++){
            fast = fast.next;
        }
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;

    }

    static Node Nth_Last_1(Node t,int n){
        int size = 0;
        Node temp = t;
        while(temp!=null){
            temp = temp.next;
            size+=1;
        }
        int x = size - n + 1;
        temp = t;
        for(int i=1;i<x;i++){
            temp = temp.next;
        }
        return temp;
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

        Node temp1 = Nth_Last_1(n1,2);
        System.out.println(temp1.data);

        Node temp2 = Nth_Last_2(n1,2);
        System.out.println(temp2.data);

    }

}
