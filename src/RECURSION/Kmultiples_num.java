package RECURSION;

public class Kmultiples_num {
    static void MULTIPLE(int num,int k){
        if(k==1) {
            System.out.println(num);
            return;
        }
        MULTIPLE(num,k-1);
        System.out.println(num*k);
    }

    public static void main(String[] args) {
        int num = 5;
        int k = 5;
        MULTIPLE(num,k);
    }
}
