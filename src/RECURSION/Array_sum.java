package RECURSION;

public class Array_sum {
    static int SUM(int[] arr,int idx){
        if(idx == arr.length-1) return arr[idx];
        return SUM(arr,idx+1) + arr[idx];
    }

    public static void main(String[] args) {
        int [] arr = {7};
        System.out.println(SUM(arr,0));
    }
}
