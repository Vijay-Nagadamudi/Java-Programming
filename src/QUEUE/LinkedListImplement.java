package QUEUE;

import java.util.Queue;

public class LinkedListImplement {
    public static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

        public static class QueueLL{
            Node head = null;
            Node tail = null;
            int size = 0;

            public void add(int val){
                Node t = new Node(val);
                if(head == null){
                    head = t;
                    tail = head;
                    size+=1;
                    return;
                }
                tail.next = t;
                tail = t;
                size += 1;
                return;
            }

            public int remove(){
                if(head == null){
                    System.out.println("Queue is empty");
                    return -1;
                }
                int x = head.val;
                head = head.next;
                size -= 1;
                return x;
            }

            public int element(){
                if(head == null){
                    System.out.println("Queue is Empty");
                    return -1;
                }
                int x = head.val;
                return x;
            }

            public void display(){
                Node temp = head;;
                while(temp != null){
                    System.out.print(temp.val + " ");
                    temp = temp.next;
                }
                System.out.println();
            }
        }

    public static void main(String[] args) {
        QueueLL q = new QueueLL();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display();
        q.add(5);
        q.add(6);
        q.display();
        q.remove();
        q.display();
        System.out.println(q.size);
        System.out.println(q.element());

    }


}
