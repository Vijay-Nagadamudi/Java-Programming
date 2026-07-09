package LINKEDLIST;

public class LL_Implement_2 {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }

    public static class LinkedList{
        Node head = null;
        Node tail = null;
        int size = 0;

        void insertAtEnd(int a){
            Node x = new Node(a);
            if(head == null) head = x;
            else tail.next = x;
            tail = x;
            size++;
        }

        void insertAtBegin(int data){
            Node x = new Node(data);
            if(head == null) {
                head = x;
                tail = x;
            }
            else{
                x.next = head;
                head = x;
            }
            size++;
        }

        void insertAtIndex(int idx,int data){
            if(idx>size || idx<0){
                System.out.println("incorrect index");
                return;
            }
            if(idx == 0){
                insertAtBegin(data);
                return;
            }
            if(idx == size){
                insertAtEnd(data);
                return;
            }
            Node x = new Node(data);
            Node temp = head;
            for(int i=0;i<idx-1;i++){
                temp = temp.next;
            }
            x.next = temp.next;
            temp.next = x;
            size++;
        }

        void deleteAtBegin(){
            if(head == null){
                System.out.println("List is already empty");
                return;
            }
            head = head.next;
            size--;
        }

        void deleteAtEnd(){
            if(head == null) return;
            if(head.next == null){
                head = null;
                size--;
                return;
            }
            Node temp = head;
            while(temp.next.next != null){
                temp = temp.next;
            }
            temp.next = null;
            size--;
        }

        void deleteAtIndex(int idx){
            if(head == null) return;
            if(idx >= size || idx<0){
                System.out.println("Error");
                return;
            }
            Node temp = head;
            for(int i=0;i<idx-1;i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
        }




    }
}
