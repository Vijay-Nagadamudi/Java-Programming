package PATTERN_PRINTING;
import java.util.Scanner;
public class Alphabetsquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int N  = sc.nextInt();
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.print((char)(j+65)+" ");
            }
            System.out.println("");
        }

    }
}
