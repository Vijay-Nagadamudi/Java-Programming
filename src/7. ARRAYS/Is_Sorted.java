package ARRAYS;
import java.util.Scanner;

public class Is_Sorted {
    static boolean Sort(int arr[]){
        boolean ans = true;
        for (int i=0;i<=arr.length-2;i++){
            if (arr[i] <= arr[i+1]){
                continue;
            }
            else {
                ans = false;
                break;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,5,5,5,5,6,8,9};
        if(Sort(arr)) System.out.println("It is Sorted");
        else System.out.println("It is not Sorted");
    }
}
