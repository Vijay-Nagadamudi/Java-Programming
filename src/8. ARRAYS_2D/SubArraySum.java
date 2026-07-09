package ARRAYS_2D;
import java.util.Scanner;
public class SubArraySum {
    static void Method1(int[][] matrix,int r1,int r2,int c1,int c2){
        int sum = 0;
        for(int i=r1;i<=r2;i++){
            for(int j=c1;j<=c2;j++){
                sum+=matrix[i][j];
            }
        }
        System.out.print("Method 1 Result : " + sum);
        System.out.println();
    }



    static void PrefixSum_Meth2(int[][] matrix){
        for(int i=0;i< matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
                matrix[i][j] = matrix[i][j] + matrix[i][j-1];
            }
        }
    }
    static void Method2(int[][] matrix,int r1,int r2,int c1,int c2){
        PrefixSum_Meth2(matrix);
        int sum = 0;
        for(int i=r1;i<=r2;i++){
            if(c1>0) sum+=matrix[i][c2] - matrix[i][c1-1];
            else sum+=matrix[i][c2];
        }
        System.out.print("Method 2 Result : " + sum);
        System.out.println();
    }



    static void PrefixSum_Meth3(int[][] matrix){
        for(int i=0;i< matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
                matrix[i][j] += matrix[i][j-1];
            }
        }
        // We calculate the Column wise Sum only
        for(int j=0;j< matrix[0].length;j++){
            for(int i=1;i<matrix.length;i++){
                matrix[i][j] += matrix[i-1][j];
            }
        }
    }
    static void Method3(int[][] matrix,int r1,int r2,int c1,int c2){
        PrefixSum_Meth3(matrix);
        int left,up,leftup;
        left = up = leftup = 0;
        int sum = matrix[r2][c2];
        if(c1>=1) left = matrix[r2][c1-1];
        if(r1>=1) up = matrix[r1-1][c2];
        if(r1>=1 && c1>=1)leftup = matrix[r1-1][c1-1];
        int ans = sum-left-up+leftup;

        System.out.print("Method 3 Result is : " + ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No of Rows : ");
        int r = sc.nextInt();
        System.out.println("Enter the No of Columns : ");
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        System.out.println("Enter the Elements in the Matrix : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter the from Row : ");
        int r1 = sc.nextInt();
        System.out.print("Enter the to Row : ");
        int r2 = sc.nextInt();
        System.out.print("Enter the from Column : ");
        int c1 = sc.nextInt();
        System.out.print("Enter the to Column : ");
        int c2 = sc.nextInt();
        Method1(matrix,r1,r2,c1,c2);
        Method2(matrix,r1,r2,c1,c2);
        Method3(matrix,r1,r2,c1,c2);
    }
}
