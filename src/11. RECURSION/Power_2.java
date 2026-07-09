package RECURSION;

public class Power_2 {
    static int POWER(int p, int q) {
        if (q == 0) return 1;
        int x = POWER(p, q / 2);
        if (q % 2 == 0) return x * x;
        return x * x * p;
    }

    public static void main(String[] args) {
        int x = POWER(2, 5);
        System.out.print(x);
    }
}
