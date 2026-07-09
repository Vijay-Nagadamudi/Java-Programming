package ARRAYS_2D;
import java.util.Scanner;
public class Basics {
    static void PRINT(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j< arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Rows u want : ");
        int R = sc.nextInt();
        System.out.print("Enter the Columns u want : ");
        int C = sc.nextInt();
        int[][] arr = new int[R][C];
        System.out.println("Enter the Elements : ");
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The Inputted Array is : ");
        PRINT(arr);

    }
}
