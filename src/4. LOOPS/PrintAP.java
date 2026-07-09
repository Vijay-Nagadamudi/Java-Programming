package LOOPS;
import java.util.Scanner;
public class PrintAP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cd = 3;
        System.out.print("Print the number of terms you want : ");
        int count  = sc.nextInt();
        for(int i=4;i<(count*cd);i+=cd){
            System.out.println(i);

        }
    }
}
