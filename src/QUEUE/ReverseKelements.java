package QUEUE;
import java.util.*;

public class ReverseKelements {
    public static void main(String[] args) {
        Queue <Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        int n = q.size();
        int k = 5;
        if(q.size() < k) {
            System.out.println("Cant perform operations");
            return;
        }

        Stack <Integer> st = new Stack<>();
        for(int i=1;i<=k;i++) st.push(q.remove());
        while(st.size() >= 1) q.add(st.pop());
        for(int i=1;i<=n-k;i++){
            q.add(q.remove());
        }
        System.out.println(q);
    }
}
