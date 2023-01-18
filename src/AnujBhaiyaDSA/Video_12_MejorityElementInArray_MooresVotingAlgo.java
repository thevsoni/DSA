package AnujBhaiyaDSA;

import java.util.Arrays;
import java.util.HashMap;

public class Video_12_MejorityElementInArray_MooresVotingAlgo {
    public static void main(String[] args) {

        // here it takes tc = O(n^2)
        System.out.println("using n^2 or n*n");
        int[] arr = {5,1,4,4,4};
        int count=0;
        boolean bl = false;
        for(int i=0;i<arr.length; i++){
            for (int j=0;j< arr.length; j++){
                if (arr[i]==arr[j]){
                    count++;
                }
            }
            if (count> arr.length/2){
                System.out.println(arr[i]);
                bl = true;
                break;
            }else{
                count=0;
            }
        }
        if (!bl){
            System.out.println("no such element found which exist more than length/2");
        }

        // to decrease the time complexity
        //here it takes O(logn+n) nlogn to reverse array and n for traversal in a array.
        System.out.println("using nlogn+n");

        int[] arr2 = {5,5,5,1,4};
        Arrays.sort(arr2); // it takes tc = nlogn time
        System.out.println(Arrays.toString(arr2));
        count=1;
        for (int i=1; i< arr2.length; i++){
            if (arr2[i]==arr2[i-1]){
                count++;
            }else {
                count=1;
            }
            if (count> arr2.length/2){
                System.out.println(arr2[i]);
                break;
            }

        }

        //using HashMap
        // here tc is very less
        System.out.println("using hashmap tc = O(n)");
        int[] nArr = {4,4,5,1,4};
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i=0;i<nArr.length;i++){
            if (hm.containsKey(nArr[i])){
                hm.put(nArr[i],hm.get(nArr[i])+1);
                if (hm.get(nArr[i])>nArr.length/2){
                    System.out.println(nArr[i]);
                    break;
                }
            }else {
                hm.put(nArr[i],1);
            }
        }

        // now tc = O(n) and sc = O(1)
        System.out.println("now tc = O(n) and sc = O(1)");
        int[] nums = {7,7,7,5,8,7,7};
        int ansIndex = 0;
        int countt = 1;
        for(int i=1; i<nums.length; i++){
            if (nums[i]==nums[ansIndex]){
                count++;
            }else{
                countt--;
            }
            if (count==0){
                ansIndex=i;
                countt=1;
            }
        }
        System.out.println(nums[ansIndex]);
    }
}
