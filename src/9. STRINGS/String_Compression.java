package STRINGS;
import java.util.*;
public class String_Compression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String ans = new String();
        ans += str.charAt(0);
        int count = 1;
        for(int i=1;i<str.length();i++){
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);
            if(curr == prev) count+=1;
            else {
                ans += count;
                count = 1;
                ans+=curr;
            }
        }
        ans+=count;
        System.out.println(ans);
    }



}


