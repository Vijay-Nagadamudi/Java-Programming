package ARRAYS;

public class Rotate_array1{
    static void R_A(int[] arr, int k){
        int[] NEW = new int[arr.length * 2];
        // DOUBLED THE INPUT ARRAY
        for(int i=0;i<arr.length;i++){
            NEW[i] = arr[i];
            NEW[i+arr.length] = arr[i];
        }
        k = k%arr.length;
        k = arr.length - k;
        for(int i=k;i<arr.length+k;i++){
            System.out.print(" "+NEW[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 102;
        R_A(arr,k);
    }
}
