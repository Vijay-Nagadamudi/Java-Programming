package QUEUE;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class basics {
    public static void main(String[] args) {
        // Queue <Integer> q = new Queue<Integer>(); this gives an error coz queue is an abstract class
        // We have to implement the Queue using ArrayDequeue or LinkedList

        Queue <Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        q.remove();
        System.out.println(q);
        System.out.println(q.peek()); // Prints the front Element
        System.out.println(q.isEmpty());
        System.out.println(q.size());
     }
}
