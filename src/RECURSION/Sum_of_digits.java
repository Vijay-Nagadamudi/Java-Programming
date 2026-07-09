package RECURSION;

public class Sum_of_digits {
    static int SUM(int n){
        if(n>=0 && n<=9) return n;
        int sum = SUM(n/10) + n%10;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(SUM(10));
    }
}
