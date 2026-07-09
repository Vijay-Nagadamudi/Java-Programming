package ARRAYS;

public class Without_Temp_Swap {
    static void SWAP(int a,int b){
        System.out.println("Before Swapping : ");
        System.out.println("a = "+a+ " b = "+b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swapping : ");
        System.out.println("a = "+a+ " b = "+b);
    }
    public static void main(String[] args) {

            int a = 5;
            int b = 6;
            SWAP(a,b);
    }
}