package RECURSION;

public class Power {
    static int power(int p,int q){
        // p^q;
        if (q==1) return 1;
        int ans = power(p,q-1) * p;
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(power(5,4));
    }
}
