package INPUT;
import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the grade : ");
        int x = sc.nextInt();
        if(x>90) System.out.println("Excellent");
        else if(x>80) System.out.println("Very good");
        else if(x>70) System.out.println("Good");
        else if(x>60) System.out.println("Can do better");
        else if(x>50) System.out.println("Average");
        else if(x>40) System.out.println("Below Average");
        else System.out.println("Fail");
    }
}
