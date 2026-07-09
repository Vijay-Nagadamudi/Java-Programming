package LOOPS;
import java.util.Scanner;
public class PrintNthTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your desired table : ");
        int num = sc.nextInt();
        for(int i = num;i<=(num*10);i+=num){
            System.out.println(i);
        }
    }

}
