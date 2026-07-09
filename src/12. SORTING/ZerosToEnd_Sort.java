package SORTING;

public class ZerosToEnd_Sort {
    static void SORT(int [] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]==0 && arr[j+1]!=0){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,0,5,6,0,7,9};
        SORT(arr);
        for(int i:arr) System.out.print(i + " ");
    }
}
