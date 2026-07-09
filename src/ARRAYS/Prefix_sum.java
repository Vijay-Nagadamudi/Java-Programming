package ARRAYS;

public class Prefix_sum {
    static void PRINT(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void SUM(int[] arr){
        int[] ans = new int[arr.length];
        ans[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            ans[i] = arr[i] + ans[i-1];
        }
        PRINT(ans);
    }

    public static void main(String[] args) {
        int[] arr = {2,1,3,4,5,6,0};
        SUM(arr);
    }
}
