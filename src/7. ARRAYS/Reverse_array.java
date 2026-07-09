package ARRAYS;

public class Reverse_array {
    static int [] REV(int[] arr){
        int j = arr.length-1;
        for(int i = 0;i<j;i++){
            arr[i] = arr[i] + arr[j];
            arr[j] = arr[i] - arr[j];
            arr[i] = arr[i] - arr[j];
            j--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] ans = REV(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

}
