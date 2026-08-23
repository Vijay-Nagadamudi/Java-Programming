package QUEUE;

public class CircularQueue {
    public static class CircleQueue{
        int[] arr = new int[5];
        int front  = -1;
        int rear = -1;
        int size = 0;
        int n = arr.length;

        public void add(int val){
            if(size == n){
                System.out.println("Queue is full ");
                return;
            }
            else if(rear == n-1){
                rear = 0;
                arr[0] = val;
                size+=1;
            }
            else if(rear == -1){
                rear = front = 0;
                arr[0] = val;
                size+=1;
            }
            else{
                arr[rear+1] = val;
                rear+=1;
                size+=1;
            }
            return;
        }

        public int remove(){
            if(size == 0){
                System.out.println("Queue is Empty");
                return -1;
            }

            else if(front == n-1){
                int x = arr[front];
                size-=1;
                front = 0;
                return x;
            }

            else{
                int x = arr[front];
                front += 1;
                size -= 1;
                return x;
            }
        }

        public int element(){
            int x = arr[front];
            return x;
        }

        public void display(){
            if(front < rear){
                for(int i=front;i<=rear;i++){
                    System.out.print(arr[i] + " ");
                }
            }
            else if(rear < front){
                for(int i=front;i<n;i++) System.out.print(arr[i] + " ");
                for(int i=0;i<=rear;i++) System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        CircleQueue q = new CircleQueue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();


    }
}
