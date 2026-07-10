package STACK;
import java.util.Stack;

public class RevDisplayRecursion {
    static void Rev_Stack(Stack<Integer> st){
        if(st.size() == 0) return;
        int x = st.pop();
        System.out.print(x + " ");
        Rev_Stack(st);
        st.push(x);
    }

    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        Rev_Stack(st);

    }
}
