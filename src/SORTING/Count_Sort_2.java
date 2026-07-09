package SORTING;

public class Count_Sort_2 {
    static void COUNT_SORT(int[] arr){
        // Create an array to store final ans
        int[] ans = new int[arr.length];

        // Find the max element in the array
        int max = arr[0];
        for(int i=0;i<arr.length;i++) max = Math.max(max,arr[i]);

        // Make an array of max+1 size
        int[] count = new int[max+1];

        // Count freq of each element in the count array
        for(int i=0;i<arr.length;i++) count[arr[i]]++;

        // Calculate the Prefix sum of the Count array elements
        for(int i=1;i< count.length;i++) count[i] = count[i] + count[i-1];

        // In prefix sum each element stores the highest position of the element in the arr
        for(int i=arr.length-1; i>=0;i--){
            int index = count[arr[i]] - 1;
            ans[index] = arr[i];
            count[arr[i]] --;
        }

        // Now copy the elements from the ans to arr to return void function because void make changes in original array
        for(int i=0;i< ans.length;i++) arr[i] = ans[i];
    }

    public static void main(String[] args) {
        int[] arr = {1,4,5,8,9,0,4,5,3,4,8,4,6,4};
        COUNT_SORT(arr);
        for(int num:arr) System.out.print(num + " ");
    }
}
