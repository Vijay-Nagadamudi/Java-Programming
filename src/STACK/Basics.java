package STACK;
import java.util.Stack;

public class Basics {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(5);
        st.push(10);
        st.push(15);
        // Pushing elements in a stack

        System.out.println(st); // Printing the Stack (Only in Java)
        System.out.println(st.size()); // Stack size info
        System.out.println(st.isEmpty()); // Tells us is stack empty or not
        System.out.println(st.peek()); // To view the top element on the stack

        st.pop(); // Removes the top element, the next becomes the top

        System.out.println(st.size());
        System.out.println(st);
        System.out.println(st.peek());
    }

}

