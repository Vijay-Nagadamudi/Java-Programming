package SORTING;

public class SortAlphabets {
    static void SORT(String [] arr){ // Mentioned that we have to sort using the selection sort
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int min_index = i;
            for(int j=i+1;j<n;j++){
                if(arr[j].compareTo(arr[min_index]) < 0 );
                String temp = arr[j];
                arr[j] = arr[min_index];
                arr[min_index] = temp;
            }
        }
    }

    public static void main(String[] args) {
        String [] fruits = {"kiwi","apple","papaya","mango"};
        SORT(fruits);
        for(String i:fruits) System.out.print(i + " ");
    }
}
