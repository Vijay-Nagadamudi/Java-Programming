package ARRAYS_2D;
import java.util.Scanner;

public class Spiral_Matrix_Power_2 {
    static void PRINT(int[][] arr){
        System.out.println("The Matrix is : ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void MATRIX_i2(int x){
        int[][] arr = new int[x][x];
        int top_row = 0;
        int bot_row = x-1;
        int lef_col = 0;
        int rig_col = x-1;
        int num = 1;

        while(num<=x*x){
            for(int i=top_row;i<=rig_col;i++){
                arr[top_row][i] = num;
                num++;
            }
            top_row++;

            for(int i=top_row;i<=bot_row;i++){
                arr[i][rig_col] = num;
                num++;
            }
            rig_col--;

            for(int i=rig_col;i>=lef_col;i--){
                arr[bot_row][i] = num;
                num++;
            }
            bot_row--;

            for(int i=bot_row;i>=top_row;i--){
                arr[i][lef_col] = num;
                num++;
            }
            lef_col++;
        }
        PRINT(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  sqr matrix size : ");
        int x = sc.nextInt();
        MATRIX_i2(x);
    }

}
