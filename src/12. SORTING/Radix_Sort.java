package SORTING;

public class Radix_Sort {
    static int Find_Max(int[] arr){
        int max = arr[0];
        for(int num:arr) max = Math.max(max,num);
        return max;
    }

    static void Count_Sort(int[] arr,int place){
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];
        for(int i=0;i<n;i++){
            count[(arr[i]/place)%10]++;
        }
        for(int i=1;i<count.length;i++){
            count[i] = count[i] + count[i-1];
        }
        for(int i=n-1;i>=0;i--){
            int idx = count[(arr[i]/place)%10] - 1;
            output[idx] = arr[i];
            count[(arr[i]/place)%10]--;
        }
        for(int i=0;i<n;i++){
            arr[i] = output[i];
        }
    }

    static void RADIX_SORT(int[] arr){
        int max = Find_Max(arr);
        for(int place=1;max/place> 0;place*=10){
            Count_Sort(arr,place);
        }
    }

    public static void main(String[] args) {
        int[] arr = {10,45,659,457,22,3,9,8,0};
        RADIX_SORT(arr);
        for(int num:arr) System.out.print(num + " ");
    }
}