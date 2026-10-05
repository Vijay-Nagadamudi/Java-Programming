package HASHMAP;

import java.util.HashMap;

public class max_freq {
    public static void main(String[] args) {
        int[] arr = {2,2,2,3,4,4,3,2,4,5,6,7,5,8};
        HashMap <Integer,Integer> mp = new HashMap<>();
        for(int num : arr){
            if(mp.containsKey(num)) mp.put(num,mp.get(num)+1);
            else mp.put(num,1);
        }
        int max_freq = 0;
        int max_key = 0;
        for(var e : mp.entrySet()){
            if(e.getValue() > max_freq){
                max_freq = e.getValue();
                max_key = e.getKey();
            }
        }
        System.out.println(mp.entrySet());
        System.out.println(max_key);
    }
}
