package STRINGS;

public class RevWord {
    static void REV_WORD(String str){
        StringBuilder STR = new StringBuilder();
        String ans = "";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch != ' '){
                STR.append(ch);
            }
            else if(ch == ' '){
                STR.reverse();
                ans += STR;
                ans+=" ";
                STR = new StringBuilder();
            }
        }
        STR.reverse();
        ans += STR;
        System.out.println(ans);
    }

    public static void main(String[] args) {
        REV_WORD("Hi I am Vijay");
    }
}
