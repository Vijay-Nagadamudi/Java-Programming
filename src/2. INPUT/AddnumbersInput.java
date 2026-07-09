package INPUT;
import java.util.Scanner;
public class AddnumbersInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First number : ");
        int x = sc.nextInt();
        System.out.print("Enter Second number : ");
        int y = sc.nextInt();
        int z = x + y;
        System.out.println("The sum of the numbers is : "+z);
    }
}
