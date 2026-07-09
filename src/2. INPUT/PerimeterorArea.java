package INPUT;
import java.util.Scanner;
public class PerimeterorArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of rectangle : ");
        int x = sc.nextInt();
        System.out.println("Enter breadth of rectangle : ");
        int y = sc.nextInt();
        int area = x * y;
        int Perimeter = 2*(x + y);
        if (area > Perimeter) System.out.println("The Area is greater than Perimeter.");
        else System.out.println("The Perimeter is greater than area.");
    }
}
