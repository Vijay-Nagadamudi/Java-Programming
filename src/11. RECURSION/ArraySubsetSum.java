package RECURSION;

public class ArraySubsetSum {
    static void SubsetSum(int[] arr,int idx,int Curr_Sum){
        if(idx==arr.length){
            System.out.print(Curr_Sum+" ");
            return;
        }
        SubsetSum(arr,idx+1,Curr_Sum + arr[idx]); // Adding the Current value to the Curr_sum
        SubsetSum(arr,idx+1,Curr_Sum);
    }

    public static void main(String[] args) {
        int[] arr = {2,4,5};
        SubsetSum(arr,0,0);
    }

}
