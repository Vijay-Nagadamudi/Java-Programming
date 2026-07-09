package LOOPS;
import java.util.Scanner;
public class Reversenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number  : ");
        int num = sc.nextInt();
        int x = 0;
        while(num>0){
           x = ((num%10) + x) * 10 ;
           num = num/10;
        }
        x = x/10;
        System.out.println(x);
    }
}
