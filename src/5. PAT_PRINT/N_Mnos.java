package PATTERN_PRINTING;
import java.util.Scanner;
public class N_Mnos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int N = sc.nextInt();
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N;j++){
                System.out.print(" "+ j);
            }
            System.out.println("");
        }
    }
}
