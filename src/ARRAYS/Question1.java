package ARRAYS;
import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int[] arr = {12,23,45,56,78,98,31,65,21,24,28,29,56,35};
        System.out.println("Enter the Pass mark : ");
        int pass = sc.nextInt();
        for (int i=0;i<=13;i++){
            if (arr[i] < pass) System.out.println(i);
        }
    }
}
