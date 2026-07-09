package RECURSION;

public class Print_all_indices {
    static void PRINT(int[] arr,int target,int idx){
        if(idx==arr.length) return;
        if(arr[idx] == target){
            System.out.println(idx);
        }
        PRINT(arr,target,idx+1);
    }

    public static void main(String[] args) {
        int[] arr = {2,3,5,6,4,8,9,9,8,5,2,9};
        int target = 2;
        PRINT(arr,target,0);
    }
}
