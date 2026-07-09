package RECURSION;

public class Linear_search {
    static boolean Linear_Search(int[] arr,int idx,int target){
        if(idx == arr.length) return false;
        if(arr[idx] == target) return true;
        return Linear_Search(arr,idx+1,target);
    }

    public static void main(String[] args) {
        int[] arr = {2,3,5,6,4,8,9};
        int target = 50;
        System.out.println(Linear_Search(arr,0,target));
    }
}
