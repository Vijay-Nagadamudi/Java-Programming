package RECURSION;

public class HCF {
    static int HCF_GCD(int x,int y){
        if(y==0) return x;
        return HCF_GCD(y,x%y);
    }

    public static void main(String[] args) {
        int x = 234;
        int y = 567;
        System.out.println(HCF_GCD(x,y));
    }
}
