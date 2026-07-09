package ARRAYS;
import java.util.Scanner;
public class ArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sixe of array : ");
        int x = sc.nextInt();
        int[] arr = new int[x];
        for(int i = 0;i < x; i++){
            System.out.print("Enter the element : ");
            int inp = sc.nextInt();
            arr[i] = inp;
        }
        for (int i = 0;i < x;i++){
            System.out.print(" " + arr[i]);
        }

    }
}
