package STACK;

import java.util.ArrayList;
import java.util.Stack;

public class StockSpan {
    static ArrayList<Integer> S_S(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        int x = arr.length;
        st.push(arr[0]);
        ans.add(arr[0]);

        for(int i=1;i<x;i++){
            while(st.size() > 0 && st.peek() < arr[i]) st.pop();
            if(st.isEmpty()) ans.add(arr[i]);
            else ans.add(st.peek());
            st.push(arr[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {100, 80, 90, 120};
        ArrayList<Integer> ans = S_S(arr);
        System.out.println(ans);
        System.out.println("Answer");

    }
}
