package STACK;
import java.util.Stack;

public class ReverseStackRec {
    static void Insert_to_Bottom(Stack<Integer> st,int bot){
        if(st.size() == 0){
            st.push(bot);
            return;
        }
        int x = st.pop();
        Insert_to_Bottom(st,bot);
        st.push(x);
    }

    static void Reverse_Stack(Stack<Integer> st){
        if(st.size() == 0) return;
        int x = st.pop();
        Reverse_Stack(st);
        // Now we should insert x to bottom
        Insert_to_Bottom(st,x);

    }
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        Reverse_Stack(st);
        System.out.println(st);

    }
}
