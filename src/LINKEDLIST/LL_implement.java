package LINKEDLIST;

public class LL_implement {

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

        void display(){
            Node t = head;
            while(t != null){
                System.out.print(t.data + " ");
                t = t.next;
            }
        }

        void insert_At_Begin(int val){
            Node temp = new Node(val);
            if(head == null) head = tail = temp;
            else{
                temp.next = head;
                head = temp;
            }
            size+=1;
        }

        void insert_At_End(int val){
            Node temp = new Node(val);
            if(head == null) head = temp;
            else tail.next = temp;
            tail = temp;
            size+=1;
        }

        void insert_At_Index(int idx,int val){
            Node temp = new Node(val);
            if(idx == 0){
                insert_At_Begin(val);
                return;
            }
            else if(idx == size){
                insert_At_End(val);
                return;
            }
            else if(idx<0 || idx>size){
                System.out.println("Enter a valid index");
                return;
            }
            else{
                Node t = head;
                for(int i=0;i<idx-1;i++){
                    t = t.next;
                }
                temp.next = t.next;
                t.next = temp;
            }
            size+=1;
        }

        void delete_At_Begin(){
            if(head == null) System.out.println("LinkedList is empty");
            else head = head.next;
            size-=1;
        }

        void delete_At_End(){
            if(head == null) {
                System.out.println("LinkedList is empty");
                return;
            }
            else{
                Node t = head;
                for(int i=0;i<size-2;i++){
                    t = t.next;
                }
                t.next = t.next.next; // so this points to Null
                tail = t;
                size-=1;
            }
        }

        void delete_At_Index(int idx){
            if(idx == 0){
                delete_At_Begin();
                return;
            }
            else if(idx == size-1){
                delete_At_End();
                return;
            }
            else if(idx<0 || idx>size) System.out.println("Incorrect Index");
            else{
                Node t = head;
                for(int i=0;i<idx;i++){
                    t = t.next;
                }
                t.next = t.next.next;
                size-=1;
                return;
            }
        }

    }

    public static void main(String[] args) {
        LinkedList L1 = new LinkedList();
        L1.insert_At_Begin(5);
        L1.insert_At_Begin(8);
        L1.insert_At_Begin(7);
        L1.insert_At_End(10);
        L1.insert_At_Begin(40);
        L1.display();
    }

}
