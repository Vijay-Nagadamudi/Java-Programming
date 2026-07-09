package SORTING;

public class Bubble_Sort {
    static void Bubble(int [] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            boolean flag = false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j] > arr[j+1]){ // Change the Symbol and We get Decreasing Order sor ting
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }

            if(!flag) return;     // !flag is  a fancy way of saying flag == false😅
        }
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,3,5,4,6,7,8};
        Bubble(arr);
        for(int i:arr){
            System.out.print(i + " ");
        }
    }
}
