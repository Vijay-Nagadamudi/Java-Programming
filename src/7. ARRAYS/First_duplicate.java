package ARRAYS;

public class First_duplicate {
    static int firstUNIQUE(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {0,2,5,3,4,8,9,0,6};
        System.out.println(firstUNIQUE(arr));
    }
    }