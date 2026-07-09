package ARRAYS;

public class Swap {
    static void SWAP(int a,int b){
        System.out.println("Before Swapping : ");
        System.out.println("a = "+a+ " b = "+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping : ");
        System.out.print("a = "+a+ " b = "+b);
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        SWAP(a,b);

    }
}
