package ARRAYS;
import java.util.Scanner;
public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i=0;i<size;i++){
            System.out.print("Enter the element : ");
            int y = sc.nextInt();
            arr[i] = y;
        }
        int max = Integer.MIN_VALUE;
        for (int i=0;i<size;i++){
            if (arr[i] > max) max = arr[i];
        }
        int smax = Integer.MIN_VALUE;
        for(int i=0;i<size;i++){
            if (arr[i]>smax && arr[i] != max) smax = arr[i];
        }
        System.out.println(max);
        System.out.println(smax);
    }
}
