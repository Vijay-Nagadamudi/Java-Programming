package LOOPS;
import java.util.Scanner;
public class Countdigitsinmunber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number of your choice : ");
        int num = sc.nextInt();
        int count = 0;
        if (num == 0) {
            count += 1;
        }

        while(num>0){
            num = num/10;
            count += 1;
        }
        System.out.println(count);



    }
}
