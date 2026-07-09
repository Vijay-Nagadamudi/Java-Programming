package STACK;
import java.util.*;

public class InsertAtIndex {
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(25);
        System.out.println(st);
        // we wanna push 15 at index 1 assuming 0 based indexing
        Stack <Integer> gt = new Stack<>();
        while(st.size() > 1){
            gt.push(st.pop());
        }
        st.push(15);

        while(gt.size() > 0){
            st.push(gt.pop());
        }
        System.out.println(st);



    }
}
