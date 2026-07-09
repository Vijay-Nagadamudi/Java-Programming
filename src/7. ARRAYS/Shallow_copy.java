package ARRAYS;

public class Shallow_copy {
    static void print_arr(int [] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    static void Change_arr(int[] arr){
        for(int i=0;i<arr.length;i++){
            arr[i] = 0;
        }
    }

    public static void main(String[] args) {

        int [] arr = {5,6,7,8,9,10};
        int [] arr_2 = arr;
        System.out.println("Before Changing array : ");
        print_arr(arr_2);
        System.out.println();
        System.out.println("After Changing array :  ");
        Change_arr(arr_2);
        print_arr(arr_2);
        System.out.println();
        System.out.println("The initial array : ");
        print_arr(arr);
    }

}
