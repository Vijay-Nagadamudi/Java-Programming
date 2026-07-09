package RECURSION;

public class K_MUl_Met2 {
    static void MUL(int num,int k){
        if(k==1){
            System.out.println(num);
            return;
        }
        MUL(num,k-1);
        System.out.print(num * k + " ");
    }

    public static void main(String[] args) {
        int num = 2;
        int k = 5;
        MUL(num,k);
    }
}
