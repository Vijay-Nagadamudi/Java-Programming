package INPUT;
import java.util.Scanner;
public class ProfitorLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Cost price : ");
        int x = sc.nextInt();
        System.out.println("Enter the Selling price : ");
        int y = sc.nextInt();
        if(x>y) System.out.println("He made a loss of "+(x - y)+" Rs") ;
        else System.out.println("He made a profit of "+(x - y)+(" Rs"));


    }
}
