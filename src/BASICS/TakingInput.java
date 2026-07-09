package BASICS;
import java.util.Scanner;
public class TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int x;
        x = sc.nextInt();
        System.out.println("The number you entered is : "+x);
    }
}