package STRINGS;
import java.util.*;
import java.util.Scanner;

public class basics {
    public static void main(String[] args) {
        // Taking a String input
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str);
        //Accesing elements in string
        System.out.println(str.charAt(0));
        // Index of an element
        System.out.println(str.indexOf("i")); // Gives the element first encounter
        // compareTo Function
        String gtr = sc.nextLine();
        System.out.println(str.compareTo(gtr));



    }
}
