package INPUT;
import java.util.Scanner;
public class AreaCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value  of radius : ");
        int x = sc.nextInt();
        double pi = 3.1415;
        System.out.println("The area of circle is : "+(pi*x*x));

    }
}
