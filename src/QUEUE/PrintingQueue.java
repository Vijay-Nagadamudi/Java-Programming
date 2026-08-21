package QUEUE;

import java.sql.Array;
import java.util.ArrayDeque;
import java.util.Queue;
public class PrintingQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(19);
        q.add(23);
        q.add(56);
        int[] helper = new int[q.size()];
        int i = 0;
        while(q.size() > 0){
            System.out.print(q.peek() + " ");
            helper[i] = q.remove();
            i++;
        }
        System.out.println();

        for(i=0;i<helper.length;i++){
            q.add(helper[i]);
        }

        System.out.println(q);


    }
}
