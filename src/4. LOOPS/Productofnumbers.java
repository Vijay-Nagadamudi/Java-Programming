package LOOPS;
import java.util.Scanner;
public class Productofnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number you want the product : ");
        int num = sc.nextInt();
        int product = 1;
        while(num>0){
            product = product * (num%10);
            num = num/10;
        }
        System.out.println(product);
    }
}
