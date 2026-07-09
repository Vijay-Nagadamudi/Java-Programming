package BINARYSEARCH;
import java.util.Arrays;
public class Binary_Search {
    static int search(int[] arr,int target){

        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        while(low<=high){
            mid = low + (high - low)/2;
            if(arr[mid] == target) return mid;
            else if(arr[mid] > target) high = mid - 1;
            else low = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,5,6,7,8,9,78,56,21,2,45,6,78,98,100,45,89,787,25,123,4,11,22,56,45,78,32,0};
        Arrays.sort(arr);
        System.out.println(search(arr,123));


    }
}
