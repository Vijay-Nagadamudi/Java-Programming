package ARRAYS;
import java.util.Scanner;
public class Maximum_inArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i=0;i<n;i++){
            System.out.print("Enter the number : ");
            int num = sc.nextInt();
            arr[i] = num;
        }
        int max = arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);


    }
}
