package STACK;

import java.util.Stack;

public class DisplayStack {
    static void Display_Stack(Stack<Integer> st){
        if(st.size() == 0) return;
        int x = st.pop();
        Display_Stack(st);
        System.out.print(x + " ");
        st.push(x);
    }

    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        Display_Stack(st);

    }
}
