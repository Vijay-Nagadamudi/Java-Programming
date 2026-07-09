package ARRAYS;

public class Sort_0s_1s {
    static void PRINT(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static int[] SWAP(int[] arr,int L,int R){
        arr[L] = arr[L] + arr[R];
        arr[R] = arr[L] - arr[R];
        arr[L] = arr[L] - arr[R];
        return arr;
    }
    static void SORT(int arr[]){
        int L = 0;
        int R = arr.length - 1;
        while(L<R){
            if (arr[L] == 1 && arr[R] == 0){
                SWAP(arr,L,R);
                L++;
                R--;
            }
            if(arr[L] == 0) L++;
            if (arr[R] == 1) R--;
        }
        PRINT(arr);
    }

    public static void main(String[] args) {
        int arr[] = {0,1,1,1,1,0,0,1,1,1};
        SORT(arr);
    }
}
