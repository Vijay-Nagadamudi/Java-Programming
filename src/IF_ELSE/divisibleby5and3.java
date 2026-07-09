package IF_ELSE;
import java.util.Scanner;
public class divisibleby5and3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int x = sc.nextInt();
        if (x % 5 == 0) {
            if (x % 3 == 0) System.out.println("The number is divisible by 5 and 3");
            else System.out.println("The number is divided by 5 only.");
        } else {
            if (x % 3 == 0) System.out.println("The number is divisible by only 3 ");
            else System.out.println("The number is neither divisible by 5 nor 3");
        }
    }

}
