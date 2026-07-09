package RECURSION;

public class String_Pallindrome {
    static Boolean pallindrome(String S,int l,int r){
        if(l>=r) return true;
        return (S.charAt(l) == S.charAt(r) && (pallindrome(S,l+1,r-1)));
    }

    public static void main(String[] args) {
        String S = "level";
        int r = S.length();
        System.out.println(pallindrome(S,0,r-1));
    }
}
