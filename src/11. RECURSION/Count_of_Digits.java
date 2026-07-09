package RECURSION;

public class Count_of_Digits {
    static int COUNT(int n){
        if(n>=0 && n<=9) return 1;
        int count = 1 + COUNT(n/10) ;
        return count;
    }

    public static void main(String[] args) {
        System.out.println(COUNT(02));
    }
}
