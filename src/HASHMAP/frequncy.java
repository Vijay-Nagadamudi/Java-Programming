package HASHMAP;

import java.util.HashMap;

public class frequncy {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,4,1,5,2,3};
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int num : arr){
            if(mp.containsKey(num)) mp.put(num,mp.get(num) + 1);
            else mp.put(num,1);
        }
        System.out.println(mp.entrySet());
    }
}
