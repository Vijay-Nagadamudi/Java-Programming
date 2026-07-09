package ARRAYS;

public class Small_Larg_Array {
    static int[] Small_Larger(int[] arr){
        int [] NEW = new int[2];
        NEW[0] = 100000;
        NEW[1] = -100000;

        for(int i=0;i< arr.length;i++){
            if (arr[i] < NEW[0]){
                NEW[0]= arr[i];
            }
            if (arr[i] > NEW[1]){
                NEW[1]= arr[i];
            }
        }
        return NEW;
    }

    public static void main(String[] args) {
        int[] arr = {5,8,1,3,6,2};
        int[] Final = Small_Larger(arr);

        System.out.println(Final[0] + "  " + Final[1]);
    }
}
