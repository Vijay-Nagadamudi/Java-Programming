package SORTING;

public class Quick_Sort {


    static void QUICK_SORT(int[] arr,int low,int high){
        if(low>=high) return;
        int pivot = PARTITION(arr,low,high);
        QUICK_SORT(arr,low,pivot-1);
        QUICK_SORT(arr,pivot+1,high);
    }

    static int PARTITION(int[] arr,int low,int high){
        int pivot = arr[low];
        int count = 0;
        for(int i=low+1;i<=high;i++){
            if(arr[i]<=pivot) count+=1;
        }
        int pivot_idx = low + count;
        int temp = arr[low];
        arr[low] = arr[pivot_idx];
        arr[pivot_idx] = temp;

        int i = low;
        int j = high;
        while(i<pivot_idx && j>pivot_idx){
            while(arr[i]<=pivot) i+=1;
            while(arr[j]>pivot) j-=1;
            if(i<pivot_idx && j>pivot_idx){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i+=1;
                j-=1;
            }
        }
        return pivot_idx;
    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,98,7,89,0,11,1,1,0,56,78};
        QUICK_SORT(arr,0,arr.length-1);
        for(int num:arr) System.out.print(num + " ");
    }
}
