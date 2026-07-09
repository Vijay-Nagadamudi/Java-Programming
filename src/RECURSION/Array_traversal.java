package RECURSION;

public class Array_traversal {
    static void Traversal(int[] arr,int idx){
        if(idx == arr.length){
            return;
        }
        System.out.print(arr[idx] + " ");
        Traversal(arr,idx+1);
    }

    public static void main(String[] args) {
        int[] arr = {5,4,6,2,3,1};
        int idx = 0;
        Traversal(arr,idx);
    }
}
