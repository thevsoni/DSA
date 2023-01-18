package AnujBhaiyaDSA;

import java.util.Arrays;
import java.util.HashSet;

public class Video_27_Hashing_Challenge {
    public static void main(String[] args) {
        // Question 1 find distinct element
        int[] arr = {5,10,5,4,5,10};

        HashSet<Integer> hs = new HashSet<>();
        for (int i=0; i< arr.length; i++){
            hs.add(arr[i]);
        }
        System.out.println(hs.size());

        // brute force
        //O(n^2)
        int coun = 0;
        for(int i=0; i< arr.length; i++){
            boolean bl = false;
            for (int j=0; j<i; j++){
                if (arr[i]==arr[j]){
                    bl = true;
                }
            }
            if(bl==false){
                coun++;
            }
        }
        System.out.println(coun);



        //O(nlogn)
        Arrays.sort(arr);
        int count =1;

        for (int i=1;i< arr.length; i++){
            if (arr[i]==arr[i-1]){
                continue;
            }else{
                count++;
            }
        }
        System.out.println(count);
    }
}
