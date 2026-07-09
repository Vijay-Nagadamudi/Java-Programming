package SORTING;

public class Selection_Sort {
    static void Selection(int [] arr){
        int n = arr.length;
        for(int i=0;i<n-2;i++){
            int min_idx = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_idx]) min_idx = j; // SWAP both
            }
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {7,6,8,4,2,0,1};
        Selection(arr);
        for(int num:arr) System.out.print(num + " ");
    }
}
