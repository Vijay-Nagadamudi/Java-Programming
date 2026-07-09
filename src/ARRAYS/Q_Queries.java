package ARRAYS;
import java.util.Scanner;
public class Q_Queries {
    static void QUERY(int[] arr,int l,int r){
        int[] ans = new int[arr.length];
        ans[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            ans[i] = arr[i] + ans[i-1];
        }
        int sum = ans[r] - ans[l-1];
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int x = sc.nextInt();
        int[] arr  = new int[x+1];
        System.out.println("Enter the range max : ");
        int r = sc.nextInt();
        System.out.println("Enter the range min : ");
        int l = sc.nextInt();
        System.out.println("Enter the elements : ");
        for(int i=1;i<x+1;i++){
            arr[i] = sc.nextInt();
        }
        QUERY(arr,l,r);
    }
}
