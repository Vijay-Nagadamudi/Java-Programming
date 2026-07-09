package ARRAYS;
import java.util.Scanner;

public class Last_Occurence {
    static int Last_count(int [] arr,int x){
        int ans = -1;
        for(int i=(arr.length-1);i>=0;i--){
            if (arr[i] == x) {
                ans = i;
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,3,1,4};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int x = sc.nextInt();
        int Final = Last_count(arr,x);
        if (Final == -1) System.out.print("Number not found");
        else System.out.print("Number found at index : " + Final);
    }
}
