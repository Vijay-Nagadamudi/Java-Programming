package ARRAYS;

public class Sort_even_Odd {
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
    static void SORT(int [] arr){
        int L = 0;
        int R = arr.length - 1;
        while(L<R){
            if(arr[L]%2!=0 && arr[R]%2==0){
                SWAP(arr,R,L);
                R--;
                L++;
            }
            if(arr[L]%2==0) L++;
            if(arr[R]%2!=0) R--;
        }
        PRINT(arr);
    }

    public static void main(String[] args) {
        int arr[] = {0,4,3,2,6,1,9,7,8};
        SORT(arr);
    }
}
