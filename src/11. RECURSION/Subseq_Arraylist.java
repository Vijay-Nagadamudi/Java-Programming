package RECURSION;

import java.util.ArrayList;

public class Subseq_Arraylist {
    static ArrayList<String> getSSQ(String S){
        ArrayList<String> ans = new ArrayList<>();
        if(S.length() == 0){
            ans.add("");
            return ans;
        }
        char cur = S.charAt(0);
        ArrayList<String> small = getSSQ(S.substring(1));
        for(String i:small){
            ans.add(i);
            ans.add(cur+i);
        }

        return ans;
    }

    public static void main(String[] args) {
        String S = "abc";
        ArrayList<String> ann = getSSQ(S);
        System.out.println("The Sub Sequences are : ");
        for(String i:ann){
            System.out.println(i);
        }
    }
}
