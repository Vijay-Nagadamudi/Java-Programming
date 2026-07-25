package STACK;
import java.util.Stack;
public class infixToPrefix {
    public static void main(String[] args) {
        String infix = "9-(5+3)*4/2";
        Stack <String> val = new Stack<>();
        Stack <Character> opr = new Stack<>();
        for(int i=0;i<infix.length();i++){
            char ch = infix.charAt(i);
            int ascii = (int) ch;
            if(ascii >= 48 && ascii <= 57){
                String s = "";
                s+=ch;
                val.push(s);
            }
            else if(opr.size() == 0 || opr.peek() == '(' || ch == '(') opr.push(ch);
            else if(ch == ')'){
                while(opr.peek() != '('){
                    String val2 = val.pop();
                    String val1 = val.pop();
                    char chr = opr.pop();
                    String t = chr + val1 + val2;
                    val.push(t);
                }
                opr.pop();
            }
            else{
                if(ch == '+' || ch == '-'){
                    String val2 = val.pop();
                    String val1 = val.pop();
                    char chr = opr.pop();
                    String t = chr + val1 + val2;
                    val.push(t);
                    opr.push(ch);
                }

                if(ch == '*' || ch == '/'){
                    if(opr.peek() == '*' || opr.peek() == '/'){
                        String val2 = val.pop();
                        String val1 = val.pop();
                        char chr = opr.pop();
                        String t = chr + val1 + val2;
                        val.push(t);
                        opr.push(ch);
                    }
                    else opr.push(ch);
                }
            }
        }

        while(val.size() > 1){
            String val2 = val.pop();
            String val1 = val.pop();
            char chr = opr.pop();
            String t = chr + val1 + val2;
            val.push(t);
        }

        String prefix = val.peek();
        System.out.println(prefix);
    }
}
