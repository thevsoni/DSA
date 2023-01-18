package AnujBhaiyaDSA;

import java.util.Arrays;

public class Video_13_kadanesAlgorithm_LongestSumContiguousSubArray {
    public static void main(String[] args) {

        //O(n^2) tc
        System.out.println("O(n^2) tc");
        int[] arr = {-5,4,6,-3,4,-1};
//        int[] arr = {-5,-4,-6,-3,-4,-1};
        for (int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
        int checkLong = Integer.MIN_VALUE;
        int indexStart = 0;
        int indexEnd = 0;
        for (int i=0;i< arr.length;i++){
            for (int j=i;j< arr.length;j++){
                int longest = 0;
                for (int k=i;k<=j;k++){
                    longest+=arr[k];
                }
                if (longest>checkLong){
                    checkLong=longest;
                    indexStart = i;
                    indexEnd = j;
                }
            }
        }
        System.out.println("longest sum "+checkLong);
        System.out.println("indexStart "+indexStart);
        System.out.println("indexEnd "+indexEnd);
        System.out.println("which is ");
        for (int i=indexStart;i<=indexEnd;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println(Math.floor(Math.sqrt(222)));


        System.out.println("O(n) tc");
        System.out.println("using kadanes algo");

        int[] arr2 = {-5,4,6,-3,4,-1};
        System.out.println(Arrays.toString(arr2));
        int maxValue =0;
        int curValue =0;
        // here we are not able to get starting index so with sum ,to get proper starting index and subarray then previous
        // but after doing some code , will able to get starting index as well

        // method is ok which takes O(n^2) time.
        int stIndex = 0;
        int enIndex = 0;


        for (int i=0;i< arr2.length;i++){
            curValue=curValue+arr2[i];


            //it works to get max sum
            if (curValue>maxValue){
                maxValue=curValue;

                    enIndex=i;

            }
            // if curValue <0 then will become 0
            if (curValue<0) {
                curValue = 0;
            }
        }
        System.out.println(maxValue);
//        System.out.println("start index "+stIndex);  it will give wrong answer
        System.out.println("ending index "+enIndex);


        //when all elements are less than zero then

        // then sabse chota value hi longest sum hoga. ek hi loop chalayenge jisse sabse chota value sabse side
        // me chala jayega.use hi print kara denge
    }
}
