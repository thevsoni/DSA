package AnujBhaiyaDSA;

import java.util.HashMap;
import java.util.HashSet;

public class Video_29_CountDistinctElementInEveryWindowOfSizeK {
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,3,1,1,3};
        int k = 4;
        // brute force
        for(int i=0; i< arr.length-k+1; i++){
            int count = 0;
            for(int j=i; j<i+4; j++){
                boolean bl = false;
                for(int l = i; l<j ; l++){
                    if(arr[j]==arr[l]){
                        bl = true;
                    }
                }
                if (bl==false){
                    count++;
                }
            }
            System.out.println(count);
        }

        // O(n^2) using hashset
        System.out.println("O(n^2) using hashset");
        for(int i=0 ;i<arr.length-k+1;i++){
            HashSet<Integer> hs = new HashSet<>();
            int count = 0;
            for (int j=i;j<i+4;j++){
                if(!hs.contains(arr[j])){
                    count++;
                    hs.add(arr[j]);
                }
            }
            System.out.println(count);
            hs.clear(); // optional
        }

        // O(n) using hashmap with O(k) sc
        System.out.println("O(n) using hashmap");
        HashMap<Integer,Integer> hm = new HashMap<>();

        for (int i=0; i< arr.length; i++){

//            hm.put(arr[i],hm.get(arr[i]+1));
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
            if(i>=k-1){
                System.out.println(hm.size());
                int x = i-k+1;
                hm.put(arr[x],hm.get(arr[x])-1);
                if (hm.get(arr[x])<=0){
                    hm.remove(arr[x]);
                }
            }
        }
    }
}
