package RECURSION;

public class StringReversal {
    static String Reverse(String S,int idx){
        if(idx == S.length()) return "";
        char ch = S.charAt(idx);
        return Reverse(S,idx+1) + ch;
    }

    public static void main(String[] args) {
        String S = "Vijay";
        System.out.println(Reverse(S,0));
    }
}
