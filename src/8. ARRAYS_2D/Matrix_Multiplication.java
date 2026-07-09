package ARRAYS_2D;

import java.util.Scanner;

public class Matrix_Multiplication {
    static void PRINT(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j< arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }


    static void MULTIPLY(int[][] arr1,int[][] arr2){
        int[][] res = new int[arr1.length][arr2[0].length];
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2[0].length;j++){
                for(int k=0;k<arr1[0].length;k++){
                    res[i][j] += (arr1[i][k] * arr2[k][j]);
                }
            }
        }
        PRINT(res);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No of Rows of Array1 : ");
        int R1 = sc.nextInt();
        System.out.print("Enter the No of Columns of Array1: ");
        int C1 = sc.nextInt();
        int[][] arr1 = new int[R1][C1];
        System.out.println("Enter elements of Array 1");
        for(int i=0;i<R1;i++){
            for(int j=0;j<C1;j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter the No of Rows of Array2 : ");
        int R2 = sc.nextInt();
        System.out.print("Enter the No of Columns of Array2: ");
        int C2 = sc.nextInt();
        int[][] arr2 = new int[R2][C2];
        if(C1==R2) {
            System.out.println("Enter elements of Array 2");
            for (int i = 0; i < R2; i++) {
                for (int j = 0; j < C2; j++) {
                    arr2[i][j] = sc.nextInt();
                }
            }
            MULTIPLY(arr1,arr2);
        }
        else System.out.println("Not Possible to Multiply Matrix");
    }
}
