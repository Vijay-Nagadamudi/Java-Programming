package PATTERN_PRINTING;
import java.util.Scanner;
public class N_Mstars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of Rows : ");
        int N = sc.nextInt();
        System.out.print("Enter no of columns : ");
        int M = sc.nextInt();
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
