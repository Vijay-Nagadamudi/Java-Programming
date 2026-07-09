package STRINGS;
import java.util.*;
import java.util.Scanner;

public class Toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println(str);

        for(int i=0;i<str.length();i++){
            boolean flag = true;
            char ch = str.charAt(i);
            int asci = (int) ch;
            if(asci >= 65 && asci <=90){
                asci += 32;
                char dh = (char)asci;
                str.setCharAt(i,dh);
            }
            else if(asci >=97 && asci <= 122){
                asci -= 32;
                char dh = (char)asci;
                str.setCharAt(i,dh);
            }
        }

        System.out.println(str);




    }
}
