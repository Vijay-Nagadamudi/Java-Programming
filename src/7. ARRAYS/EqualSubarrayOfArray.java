package ARRAYS;

public class EqualSubarrayOfArray {

    static int PossibleSplit(int[] arr){
        int[] Pre = new int[arr.length];
        Pre[0] = arr[0];
        int[] Suf = new int[arr.length];
        Suf[arr.length-1] = arr[arr.length-1];
        for(int i=1,j=arr.length-2;i<arr.length && j>=0;i++,j--){
            Pre[i] = Pre[i-1] + arr[i];
            Suf[j] = Suf[j+1] + arr[j];
            if(Pre[i] == Suf[j]) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5,3,2,6,3,1};
        System.out.println(PossibleSplit(arr));
    }
}
