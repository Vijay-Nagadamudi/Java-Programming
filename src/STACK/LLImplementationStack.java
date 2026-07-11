package STACK;

public class LLImplementationStack {
    public static class Node{
        int data;
        Node next;
        public  Node(int data){
            this.data = data;
        }
    }

    public static class Stack{
        Node head = null;
        int size = 0;

        void push(int x){
            Node temp = new Node(x);
            if(head == null){
                head = temp;
                size++;
                return;
            }
            temp.next = head;
            head = temp;
            size++;
            return;
        }

        Node pop(){
            if(head == null){
                System.out.println("Stack Underflow");
                return null;
            }
            Node temp = head;
            head = head.next;
            size--;
            return temp;
        }

        int peek(){
             return head.data;
        }

        boolean isEmpty(){
            if(head == null){
             return true;
            }
            return false;
        }

        void display(Node head){
            Node temp = head;
            while(temp != null){
                System.out.println(temp.data);
            }
        }
    }

    public static void main(String[] args) {
        ArrayImplemetationStack.Stack st = new ArrayImplemetationStack.Stack();
        st.push(5);
        st.push(10);
        st.push(15);
        st.push(20);
        System.out.println(st.size());
        st.display();
        System.out.println(st.peek());
        st.pop();
        System.out.println(st.size());
        st.display();
        System.out.println(st.peek());
        st.pop();
        st.pop();
        st.pop();
        st.pop();
    }
}
