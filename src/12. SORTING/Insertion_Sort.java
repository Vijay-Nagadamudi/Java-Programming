package SORTING;

public class Insertion_Sort {
    static void Insertion(int[] arr){
        int n = arr.length;
        for(int i=1;i<n;i++){ // We use i = 1 here because we compare 1 and its previous index ie the 0 index
            int j = i;
            while(j>0 && arr[j] < arr[j-1]){
                // we swap the numbers arr[j] and arr[j-1] and we decrement the j by 1
                // we write j>0 part first because let's say at the time when j=0 arr[j] and arr[j-1] will be out if index
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,6,8,2,1};
        Insertion(arr);
        for(int i:arr) System.out.print(i + " ");
    }
}
