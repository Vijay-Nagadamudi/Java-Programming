package STACK;

import java.util.Stack;

public class Next_greater {
    static int[] next_grt(int[] arr){
        int x = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] res = new int[x];
        res[x-1] = -1;
        st.push(arr[x-1]);
        for(int i=x-2;i>=0;i--){
            if(st.peek() > arr[i]){
                res[i] = st.peek();
                st.push(arr[i]);
            }
            else{
                while(!st.isEmpty() && st.peek()<arr[i]) st.pop();
                if(st.size() == 0) res[i] = -1;
                else res[i] = st.peek();
                st.push(arr[i]);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1};
        int[] res = next_grt(arr);
        for(int i:res) System.out.print(i + " ");
    }
}
