package STACK;

import java.util.Stack;

public class postfixToPrefix {
    public static void main(String[] args) {
        String postfix = "953+4*6/-";
        Stack <String> st = new Stack<>();
        for (int i=0;i<postfix.length();i++){
            char ch = postfix.charAt(i);
            int ascii = (int) ch;
            if(ascii <= 57 && ascii >= 48){
                st.push(""+ch);
            }
            else {
                String val2 = st.pop();
                String val1 = st.pop();
                char opr = ch;
                String t = "" + opr + val1 + val2;
                st.push(t);
            }

        }
        System.out.println(st.peek());

    }
}
