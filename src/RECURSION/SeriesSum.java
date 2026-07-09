package RECURSION;

public class SeriesSum {
    static int ALT_SUM(int num){
        if(num == 0) return 0;

        if (num%2==0) return ALT_SUM(num-1) - num;
        else return ALT_SUM(num-1) + num;
    }

    public static void main(String[] args) {
        int k = 5;
        System.out.println(ALT_SUM(k));
    }
}
