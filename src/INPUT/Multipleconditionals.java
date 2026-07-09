// TO CHECK WEATHER A NUMBER IS THREE DIGIT OR NOT.
package INPUT;
import java.util.Scanner;
public class Multipleconditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int x = sc.nextInt();
        if(x>99 && x<1000) System.out.println("The number is a three digit number.");
        else System.out.println("It is not a three digit number.");
    }
}
