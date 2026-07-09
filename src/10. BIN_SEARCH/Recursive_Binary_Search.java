import java.util.Arrays;

public class Recursive_Binary_Search {

    static boolean Binary_Search(int[] arr, int low, int high, int target) {
        if (low > high) return false;

        int mid = low + (high - low) / 2;

        if (arr[mid] == target) return true;
        else if (arr[mid] > target)
            return Binary_Search(arr, low, mid - 1, target);
        else
            return Binary_Search(arr, mid + 1, high, target);
    }

    public static void main(String[] args) {
        int arr[] = {45,5,0,23,65,98,49,78,51,2,56,89,69};
        Arrays.sort(arr);

        int target = 65;

        boolean found = Binary_Search(arr, 0, arr.length - 1, target);

        System.out.println("Element found: " + found);
    }
}
