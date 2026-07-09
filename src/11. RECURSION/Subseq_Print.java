package RECURSION;

public class Subseq_Print {
    static void PRINTSSQ(String S,String Curr_ans){
        if(S.length() == 0){
            System.out.println(Curr_ans);
            return;
        }
        char Curr_char = S.charAt(0);
        String Rem_S = S.substring(1);
        PRINTSSQ(Rem_S,Curr_ans + Curr_char); // Curr_char choose to  be included
        PRINTSSQ(Rem_S,Curr_ans); // Curr_char Choose to be excluded
    }

    public static void main(String[] args) {
        String S = "abc";
        String Curr = "";
        PRINTSSQ(S,Curr);
        System.out.println("These are the total subsequences present ");
    }
}
