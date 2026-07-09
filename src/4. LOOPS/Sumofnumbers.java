package LOOPS;
import java.util.Scanner;
public class Sumofnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int num = sc.nextInt();
        int count = 0;
        int rem = 0;
        while(num>0){
            count = count + (num%10);
            num = num/10;
        }
        System.out.println(count);

    }
}
