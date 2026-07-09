package ARRAYS;

public class Unique_elements {
    static void U_E(int[] arr){
        for(int i=0;i< arr.length;i++){
            int check;
            if (arr[i]>=0)  check = arr[i];
            else continue;
            for(int j=i+1;j< arr.length;j++){
                if (arr[j] == check) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
                else continue;
            }
            if (arr[i] >= 0) System.out.print( arr[i]+ " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3,2,5,5,0,0,1,6,4};
        U_E(arr);
    }
}
