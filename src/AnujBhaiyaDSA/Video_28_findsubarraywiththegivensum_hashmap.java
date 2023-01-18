package AnujBhaiyaDSA;

import java.util.HashMap;
import java.util.Map;

public class Video_28_findsubarraywiththegivensum_hashmap {
    public static void main(String[] args) {
        int[] arr = {10,15,-5,15,-10,5};
        int sum = 5;
        int start = 0;
        int end = -1;
        HashMap<Integer,Integer> hm = new HashMap<>();
        int currSum = 0;
        for(int i=0; i< arr.length; i++){
            currSum += arr[i];
            if (currSum-sum==0){
                end = i;
                break;
            }
            if (hm.containsKey(currSum-sum)){
                start = hm.get(currSum-sum)+1;
                end = i;
                break;
            }
            hm.put(currSum,i);
        }

        // print the answer
        if (end==-1){
            System.out.println("not found");
        }else{
            System.out.println(start+" "+end);
        }

        //find the largest subarray
        int[] arr2 = {10,15,-5,15,-10,5};
        int sum2 = 5;
        int start2 = 0;
        int end2 = -1;
        int minStart = 0;
        int maxEnd = 0;
        int maxDiff = 0;
        HashMap<Integer,Integer> hm2 = new HashMap<>();
        int currSum2 = 0;
        for(int i=0; i< arr.length; i++){
            currSum += arr[i];
            if (currSum-sum==0){
                end2 = i;
                if(maxDiff<end2-start2){
                    minStart=start2;
                    maxEnd = end2;
                    maxDiff = end2-start2;
                }
            }
            if (hm.containsKey(currSum-sum)){
                start2 = hm.get(currSum-sum)+1;
                end2 = i;
                if(maxDiff<end2-start2){
                    minStart=start2;
                    maxEnd = end2;
                    maxDiff = end2-start2;
                }
            }
            hm.put(currSum,i);
        }

        // print the answer
        if (end2==-1){
            System.out.println("not found");
        }else{
            System.out.println(minStart+" "+maxEnd);
        }

    }
}
