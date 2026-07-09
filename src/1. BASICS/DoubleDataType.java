package BASICS;

public class DoubleDataType {
    public static void main(String[] args) {
        double x = 5;
        double y = 2;
        double z = x/y;
        System.out.println(z);
    }
}
//The output for above code is 2.5 because the input is taken in Double datatype as it stores 5.0 but not 5 //rly with 2 and output is a decimal number
// If we used 5/2 instead of x/y we get answer as 2.0 .
// This is because of an integer output stored in a double data type.