package SORTING;

public class Count_Sort {
    static void COUNT_SORT(int[] arr){
        // Find max in the Array
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) max = Math.max(max,arr[i]);


        // Finding the freq of each number in the count array.
        int[] count = new int[max+1];
        for(int i=0;i<arr.length;i++) count[arr[i]]++;

        // Now replacing the elements of arr with their frequency
        int k=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<count[i];j++){
                arr[k] = i;
                k++;
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,8,4,2,6,8,9};
        COUNT_SORT(arr);
        for(int num:arr) System.out.print(num+" ");

    }
}
