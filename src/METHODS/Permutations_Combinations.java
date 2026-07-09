package METHODS;
import java.util.Scanner;
public class Permutations_Combinations {
    public static double Fact(int x) {
        double Pro = 1;
        for (int i = 1; i <= x; i++) {
            Pro *= i;
        }
        return Pro;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n Value : ");
        int n = sc.nextInt();
        System.out.println("Enter r Value : ");
        int r = sc.nextInt();
        System.out.println("What do you wanna do 1. Combinations  2.Permutations");
        int ans = sc.nextInt();
        if (ans==1){
            System.out.println("The Combinations are : ");
            double comb = Fact(n)/(Fact(r)*Fact(n-r));
            System.out.println(comb);
        }
        else if (ans==2){
            System.out.println("The Permutations are : ");
            double Perm = Fact(n)/Fact(n-r);
            System.out.println(Perm);
        }
        else{
            
        }


    }
}
