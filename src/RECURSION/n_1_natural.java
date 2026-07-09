package RECURSION;

public class n_1_natural {
    static void Nto1(int n){
        if (n==1){
            System.out.print(n);
            return;
        }

        System.out.print(n+" ");
        Nto1(n-1);
    }

    public static void main(String[] args) {
        int n = 5;
        Nto1(n);
    }
}
