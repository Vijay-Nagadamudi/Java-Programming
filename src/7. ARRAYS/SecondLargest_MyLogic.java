package ARRAYS;

public class SecondLargest_MyLogic {
    public static void main(String[] args) {
        int[] arr = {1,23,56,45,89,65,79,69,2,0,24};
        int max = 0;
        int index = 0;
        int smax = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) {
                max = arr[i];
                index = i;
            }
        }
        arr[index] = -1;
        for(int i=0;i<arr.length;i++){
           if(arr[i]>smax){
               smax = arr[i];
           }
        }
        System.out.println(smax);
        arr[index] = max;
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

}
