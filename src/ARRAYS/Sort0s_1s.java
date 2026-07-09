package ARRAYS;

public class Sort0s_1s {
    static void Sort(int[] arr){
        int i = 0;
        int j = arr.length-1;
        while(i<j){

            while(i<j && arr[i]==0) i++;
            while(i<j && arr[j]==1) j--;
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,0,0,0,0,0,0,0,0,0,0};
        Sort(arr);
        for(int i:arr) System.out.print(i);
    }
}
