package STACK;
import java.util.Stack;
public class PairPushinStack {
    public static class Pair{
        int num;
        int idx;
        Pair(int num,int idx){
            this.num = num;
            this.idx = idx;
        }

        @Override
        public String toString(){
            return "(" + num + "," + idx + ")";
        }

    }

    public static void main(String[] args) {
        Stack<Pair> st = new Stack<>();
        int[] arr = {100,80,60,70,75,85};
        for(int i=0;i<arr.length;i++){
            Pair p = new Pair(arr[i],i);
            st.push(p);
        }
        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println("Ans : ");
    }



}
