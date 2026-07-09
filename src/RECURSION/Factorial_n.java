package RECURSION;

public class Factorial_n {
    static int Fact(int n){
        // n * n-1 * n-2 * ...... * 1
        if(n==0) return 1;
        return n * Fact(n-1);
    }

    public static void main(String[] args) {
        int x = 0;
        System.out.println(Fact(x));
    }
}
