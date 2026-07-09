package METHODS;

public class Passing_Values {
    public static void main(String[] args) {
        System.out.println("Welcome to the Score board");
        First();
        Wish("Vijay",20);
    }

    public static void First() {
        System.out.println("This is the Score board of the SEM 4 results");
    }

    public static void Wish(String name,int age) {
        System.out.println("The First rank goes to "+name+" of age "+age);
    }
}
