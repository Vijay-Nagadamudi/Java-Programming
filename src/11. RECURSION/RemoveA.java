package RECURSION;

public class RemoveA {
    static String Remove(String S,int idx){
        if(idx == S.length()) return "";
        String small_ans = Remove(S,idx+1);
        char curr_char = S.charAt(idx);
        if(curr_char == 'a') return small_ans;
        else return curr_char+small_ans;
    }

    public static void main(String[] args) {
        String S = "aaaaaabaaaaaaaa";
        System.out.println(Remove(S,0));
    }
}
