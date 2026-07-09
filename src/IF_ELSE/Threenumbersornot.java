package IF_ELSE;
import java.util.Scanner;
public class Threenumbersornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int x = sc.nextInt();
        if(x>99 && x<1000) System.out.println("Three Digit");
        else System.out.println("Not three Digit");
    }
}
