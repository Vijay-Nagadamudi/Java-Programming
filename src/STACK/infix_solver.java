package STACK;
import javax.xml.stream.events.Characters;
import java.util.*;
public class infix_solver {
    public static void main(String[] args) {
        String str = "9-5+3*4/6";
        Stack <Integer> val = new Stack<>();
        Stack <Character> opr = new Stack<>();
        for(int i=0; i<str.length();i++){
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii >= 48 && ascii <= 57) val.push(ascii - 48);
            else if(opr.size() == 0) opr.push(ch);
            else{
                if(ch == '+' || ch == '-'){
                    int val2 = val.pop();
                    int val1 = val.pop();
                    if(opr.peek() == '+') val.push(val1 + val2);
                    if(opr.peek() == '-') val.push(val1 - val2);
                    if(opr.peek() == '*') val.push(val1 * val2);
                    if(opr.peek() == '/') val.push(val1 / val2);
                    opr.pop();
                    opr.push(ch);
                }

                else if(ch == '*' || ch == '/'){
                    if(opr.peek() == '*' || opr.peek() == '/') {
                        int val2 = val.pop();
                        int val1 = val.pop();
                        if (opr.peek() == '*') val.push(val1 * val2);
                        if (opr.peek() == '/') val.push(val1 / val2);
                        opr.pop();
                        opr.push(ch);
                    }
                    else opr.push(ch);
                }
                else opr.push(ch);
            }
        }

        while(val.size() > 1){
            int val2 = val.pop();
            int val1  = val.pop();
            if(opr.peek() == '+') val.push(val1 + val2);
            if(opr.peek() == '-') val.push(val1 - val2);
            if(opr.peek() == '*') val.push(val1 * val2);
            if(opr.peek() == '/') val.push(val1 / val2);
            opr.pop();
        }

        System.out.println(val.peek());


    }
}
