package SORTING;

public class Merge_Sort {

    static void MERGE(int[] arr,int l,int mid,int r){
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for(int i=0;i<n1;i++) L[i] = arr[l+i];
        for(int j=0;j<n2;j++) R[j] = arr[mid+1+j];
        int i = 0;
        int j = 0;
        int k = l;
        while(i<n1 && j<n2){
            if(L[i]<=R[j]) arr[k++] = L[i++];
            else arr[k++] = R[j++];
        }
        while(i<n1) arr[k++] = L[i++];
        while(j<n2) arr[k++] = R[j++];
    }
    static void MERGE_SORT(int[] arr,int l,int r){
        if(l>=r) return;
        int mid = l+(r-l)/2;
        MERGE_SORT(arr,l,mid);
        MERGE_SORT(arr,mid+1,r);
        MERGE(arr,l,mid,r);

    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,8,2,3,11,100,0};
        System.out.println("Before Sorting : ");
        for(int num : arr) System.out.print(num + " ");
        MERGE_SORT(arr,0,arr.length-1);
        System.out.println();
        System.out.println("After Soring : ");
        for(int num : arr) System.out.print(num + " ");
    }
}
