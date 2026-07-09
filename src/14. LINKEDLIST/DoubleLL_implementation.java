package LINKEDLIST;

public class DoubleLL_implementation {
    public static class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data = data;
        }
    }
    public static class DoublyLinkedList{
        Node head = null;
        int size = 0;

        Node insertAtHead(int x){
            Node t = new Node(x);
            if(head == null){
                head = t;
                size++;
                return head;
            }
            t.next = head;
            head.prev = t;
            head = t;
            size++;
            return t;
        }

        void insertAtTail(int x){
            if(head == null){
                insertAtHead(x);
                return;
            }
            Node t = new Node(x);
            Node temp = head;
            while(temp.next != null) temp = temp.next;
            temp.next = t;
            t.prev = temp;
            size++;
            return;
        }

        void insertAtIndex(int idx,int x){
            if(idx<0 || idx>size){
                System.out.println("Invalid Index");
                return;
            }
            if(idx == 0){
                insertAtHead(x);
                return;
            }
            if(idx == size){
                insertAtTail(x);
                return;
            }
            Node t = new Node(x);
            Node temp = head;
            for(int i=0;i<idx-1;i++) temp = temp.next;
            Node Hold = temp.next;
            temp.next = t;
            t.prev = temp;
            t.next = Hold;
            Hold.prev = t;
            size++;
            return;
        }

        void deleteAtHead(){
            if(head == null){
                System.out.println("List is empty");
                return;
            }
            if(head.next == null){
                head = null;
                size--;
                return;
            }
            head = head.next;
            head.prev = null;
            size--;
            return;
        }

        void deleteAtTail(){
            if(head == null){
                System.out.println("List is empty");
                return;
            }
            if(head.next == null){
                head = null;
                size--;
                return;
            }
            Node temp = head;
            while(temp.next != null) temp = temp.next;
            temp.prev.next = null;
            size--;
            return;
        }

        void deleteAtIndex(int idx){
            if(idx < 0 || idx > size-1){
                System.out.println("Invalid Index");
                return;
            }
            if(head == null){
                System.out.println("The List is Empty");
                return;
            }
            if(idx == 0){
                deleteAtHead();
                return;
            }
            if(idx == size-1){
                deleteAtTail();
                return;
            }
            Node temp = head;
            for(int i=0;i<idx-1;i++) temp = temp.next;
            temp.next = temp.next.next;
            temp.next.prev = temp;
            return;
        }

        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            return;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList LL = new DoublyLinkedList();
        LL.insertAtHead(5);
        LL.insertAtHead(3);
        LL.insertAtTail(6);
        LL.insertAtIndex(1,4);
        LL.display();
    }

}
