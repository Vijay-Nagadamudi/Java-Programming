package ARRAYS;

public class Arraysum {
    public static void main(String[] args) {
        int [] arr = {1,23,45,65,89,78,16,23,565};
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
