package QUEUE;

public class ArrayImplement {
    public static class QueueArray{
        int[] arr = new int[100];
        int front = -1;
        int rear = -1;
        int size = 0;
        public void add(int val){
            if(front == -1){
                size += 1;
                front = rear = 0;
                arr[rear] = val;
                return;
            }
            if(rear == arr.length-1){
                System.out.println("Cant Add and Queue is FUll");
                return;
            }
            arr[rear+1] = val;
            rear+=1;
            size+=1;
            return;
        }

        public int remove(){
            if(size == 0){
                System.out.println("Cant remove from an Empty Queue");
                return -1;
            }
            int x = arr[front];
            front+=1;
            size-=1;
            return x;
        }

        public int element(){
             if(front == -1){
                 System.out.println("Queue is Empty");
                 return -1;
             }
             return arr[front];
        }
        public void display(){
            for(int i=front;i<=rear;i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        QueueArray Q = new QueueArray();
        Q.add(1);
        Q.add(2);
        Q.add(3);
        Q.add(4);
        Q.add(5);
        Q.display();
        Q.remove();
        Q.display();
        System.out.println(Q.element());
        System.out.println(Q.size);


    }
}
