package STRINGS;

public class Interning {
    public static void main(String[] args) {
        String str = "Hello";
        String gtr = "Hello";
        System.out.println(str);
        System.out.println(gtr);
        gtr = "Bello";
        System.out.println(str);
        System.out.println(gtr);

        // To overcome interning new is used
        String mtr = new String("Bello");
        System.out.println(mtr);
        System.out.println(gtr);
    }
}
