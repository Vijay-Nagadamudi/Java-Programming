package ARRAYS;

import java.util.Arrays;

public class Deep_copy {
    static void print_array(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void change_array(int[] arr,int[] arr_){
        for(int i=0;i<arr.length;i++){
            arr[i] = 0;
            arr_[i] = 0;
        }
    }


    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9};
        int[] arr_2 = arr.clone(); //Method 1 :  Forms a separate copy in java heap
        int[] arr_3 = Arrays.copyOf(arr,arr.length); //Method 2 : Imports java arrays class and methods in it to form Deep copy
        System.out.println("Before Changing the Array 2 : ");
        print_array(arr_2);
        System.out.println("Before Changing the Array 3 : ");
        print_array(arr_3);
        change_array(arr_2,arr_3);
        System.out.println("After Changing the Array 2");
        print_array(arr_2);
        System.out.println("After Changing the Array 3");
        print_array(arr_3);
        System.out.println("The main Array Before changing : ");
        print_array(arr);
        System.out.println("THa main  Array After changing other arrays that are equal to arr : ");
        print_array(arr);
    }
}
