package ARRAYS_2D;
import java.util.Scanner;
public class Spiral_Matrix {
    static void SPIRAL_PRINT(int[][] arr,int r,int c){
        int top_row = 0;
        int bot_row = r-1;
        int lef_col = 0;
        int rig_col = c-1;
        int total_count = 0;
        while(total_count < r*c){
            for(int i=top_row;i<=rig_col && total_count < r*c ;i++){
                System.out.print(arr[top_row][i] + " ");
                total_count++;
            }
            top_row++;

            for(int i=top_row;i<=bot_row && total_count < r*c;i++){
                System.out.print(arr[i][rig_col] + " ");
                total_count++;
            }
            rig_col--;

            for(int i=rig_col;i>=lef_col && total_count < r*c;i--){
                System.out.print(arr[bot_row][i] + " ");
                total_count++;
            }
            bot_row--;

            for(int i=bot_row;i>=top_row && total_count < r*c;i--){
                System.out.print(arr[i][lef_col] + " ");
                total_count++;
            }
            lef_col++;


        }
        // CODE HERE
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Rows U want in the Matrix : ");
        int r = sc.nextInt();
        System.out.print("Enter the Columns U want in the Matrix : ");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Enter the Elements in the Matrix : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                int x = sc.nextInt();
                arr[i][j] = x;
            }
        }

        SPIRAL_PRINT(arr,r,c);
    }
}
