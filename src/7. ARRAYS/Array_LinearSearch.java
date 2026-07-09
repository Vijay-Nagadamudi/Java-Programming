package ARRAYS;
import java.util.Scanner;
public class Array_LinearSearch {
    public static void main(String[] args) {
        int[] arr = {12,23,56,45,65,89,59,69,78,89,101,121,56,23,45,98,56,89,222,45,58,45,101,10,11,15,16,18,19,20};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number u wanna search : ");
        int x = sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if (arr[i] == x) {
                System.out.println("The index at which your number is : " + i);
                break;

            }

        }
        System.out.println(arr.length);
    }
}
