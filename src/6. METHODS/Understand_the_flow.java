package METHODS;

public class Understand_the_flow {
    public static void main(String[] args) {
        System.out.println("Hello See the flow of the functions : ");
        System.out.println(sum(8,78));
    }

    public static int sum(int a,int b) {
        System.out.print("Hi the sum is "); // first this line gets executed after a function call
        return a+b;

    }
}
