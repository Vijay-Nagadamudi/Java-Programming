package STACK;
import java.util.Stack;
import java.util.Scanner;
public class InsertAtBottom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack <Integer> st = new Stack<>();
        st.push(10);
        st.push(5);
        st.push(15);
        System.out.println(st);
        // Now add to bottom of st
        Stack <Integer> gt = new Stack<>();
        while(st.size()>0) gt.push(st.pop());
        System.out.println("Enter the element u wanna enter");
        int x = sc.nextInt();
        st.push(x);
        while(gt.size()>0) st.push(gt.pop());
        System.out.println(st);
    }
}
