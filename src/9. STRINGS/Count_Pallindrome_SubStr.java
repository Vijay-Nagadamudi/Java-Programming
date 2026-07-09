package STRINGS;
import java.util.*;
public class Count_Pallindrome_SubStr {
    static boolean is_pallindrome(String str){
        int i = 0;
        int j = str.length() - 1;
        while(i<j){
            if(str.charAt(i) != str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count = 0;
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                boolean ans = is_pallindrome(str.substring(i,j));
                if(ans) count+=1;
            }
        }

        System.out.println(count);

    }

}
