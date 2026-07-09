package METHODS;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Swap_two_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int x = sc.nextInt();
        System.out.println("Enter a number : ");
        int y = sc.nextInt();

        System.out.println(x + "" + y);

        int temp = 0;
        temp = x;
        x = y;
        y = temp;

        System.out.println(x + "" + y);


    }





}
