package ARRAYS_2D;

public class Rotate_90 {
    static void PRINT(int[][] arr){
        for(int i=0;i< arr.length;i++){
            for(int j=0;j< arr.length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void TRANS(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    static void REVERSE(int[] arr){
            int i = 0;
            int j = arr.length-1;
            while(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
        }
    }

    static int[][] ROTATE(int[][] arr){
        // First call TRANSPOSE Method
        TRANS(arr);
        //
        for(int i=0;i<arr.length;i++){
            REVERSE(arr[i]);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int ans[][] = ROTATE(arr);
        PRINT(ans);

    }
}
