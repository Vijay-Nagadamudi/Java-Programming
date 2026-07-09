package ARRAYS_2D;
import java.util.Scanner;
public class Add_2D {
    static void PRINT(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j< arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void SUM(int[][] arr1,int[][] arr2){
        int[][] sum = new int[arr1.length][arr1[0].length];
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        PRINT(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No of Rows : ");
        int R = sc.nextInt();
        System.out.print("Enter the No of Columns : ");
        int C = sc.nextInt();
        int[][] arr1 = new int[R][C];
        int[][] arr2 = new int[R][C];
        System.out.println("Enter elements of Array 1");
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements of Array 2");
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        System.out.println("The Sum of the Arrays is : ");
        SUM(arr1,arr2);
    }
}
