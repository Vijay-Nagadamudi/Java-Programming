package METHODS;
import java.util.Scanner;
public class Swap_without_temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int x = sc.nextInt();
        System.out.println("Enter a number : ");
        int y = sc.nextInt();
        System.out.println(x +" " + y);
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println(x +" " + y);

    }
}
