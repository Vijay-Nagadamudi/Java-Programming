package STACK;

public class ArrayImplemetationStack {
    public static class Stack{
        int[] arr = new int[5];
        int idx = 0;

        int size(){
            return idx;
        }

        void push(int x){
            if(idx == arr.length){
                System.out.println("Stack Overflow");
                return;
            }
            arr[idx] = x;
            idx++;
        }

        int peek(){
            return arr[idx-1];
        }

        int pop(){
            if(size() == 0){
                System.out.println("Stack Underflow");
                return -1;
            }
            int x = arr[idx-1];
            arr[idx-1] = 0; // Java Default Value
            idx--;
            return x;
        }

        boolean isEmpty(){
            if(size() == 0) return true;
            return false;
        }

        boolean isFull(){
            if(size() == arr.length) return true;
            return false;
        }

        void display(){
            for(int i=0;i<=idx-1;i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
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
