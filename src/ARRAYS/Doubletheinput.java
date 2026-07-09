package ARRAYS;
import java.util.Scanner;
public class Doubletheinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int x = sc.nextInt();
        int[] arr = new int[x];
        for (int i = 0;i < x;i++) {
            int inp = sc.nextInt();
            arr[i] = inp * 2;
        }

        for (int i = 0;i < x;i++) {
            System.out.println(arr[i]);
        }
    }
}
