package STACK;
import java.util.*;
public class BalancedBrackets {
    static boolean isBalanced(String str){
        Stack <Character> st = new Stack<>();
        int x = str.length();
        for(int i=0;i<x;i++){
            char ch = str.charAt(i);
            if(ch == '(') st.push(ch);
            else{
                if(st.isEmpty()) return false;
                if(st.peek() == '(') st.pop();
            }
        }
        if(st.isEmpty()) return true;
        System.out.println(st.size()+" amount of brackets are to be removed to make this balanced");
        return false;

    }
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isBalanced(str));
        System.out.println("Demonstration");

    }
}
