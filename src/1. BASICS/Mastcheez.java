package BASICS;

public class Mastcheez {
    public static void main(String args[]){
        int x = 10;
        int y = 5;
        int z = 4;
        System.out.println(" Mast Cheez "+x+y+z); // First word is text so computer assumes it as entire text.
        System.out.println(x+" Mast cheez"+y+z); // First a single number and then a text so entire thing after x will be text.
        System.out.println(x+y+" Mast Cheez "+ z); //First sum of x and y is printed and then remaining is considered as a text
        System.out.println(x+y+z+" Mast Cheez"); // First the operations are performed then the text is printed.
    }
}
