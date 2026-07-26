package STACK;

import java.util.Stack;

public class prefixToInfix {
    public static void main(String[] args) {
        String prefix = "-9/*+5346";
        Stack <String> st = new Stack<>();
        for(int i=prefix.length()-1; i>=0;i--){
            char ch = prefix.charAt(i);
            int ascii = (int) ch;
            if(ascii >= 48 && ascii <= 57){
                String str = "" + ch;
                st.push(str);
            }
            else{
                String val1 = st.pop();
                String val2 = st.pop();
                char opr =  ch;
                String t = "(" + val1 + ch + val2 + ")";
                st.push(t);
            }
        }
        System.out.println(st.peek());
    }
}
