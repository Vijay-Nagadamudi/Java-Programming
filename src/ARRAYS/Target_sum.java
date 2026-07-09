package ARRAYS;

public class Target_sum {
    static void T_S(int [] arr,int tar){
        for(int i=0;i<arr.length;i++){
            int check = tar-arr[i];
            for (int j=i;j<arr.length;j++){
                if (check == arr[j]) System.out.println(arr[i]+" "+arr[j]+" , ");
                else continue;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {4,6,3,5,8,2};
        int target = 7;
        T_S(arr,target);
    }
}
