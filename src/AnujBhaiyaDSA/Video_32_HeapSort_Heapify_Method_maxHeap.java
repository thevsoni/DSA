package AnujBhaiyaDSA;

import java.util.Arrays;

public class Video_32_HeapSort_Heapify_Method_maxHeap {

    public static void heapify(int[] arr,int i){
            int larger = arr[2*i]>arr[2*i+1] ? 2*i : 2*i+1;
            if(larger != i){
                int temp = arr[larger];
                arr[larger] = arr[i];
                arr[i] = temp;
                heapify(arr,larger);
            }

    }
    public static void main(String[] args) {
        // create heap
        int[] arr = {0,20,10,30,5,50,40,0,0,0,0};
        for(int i=arr.length-2/2; i>0; i--){
            heapify(arr,i);
        }
        System.out.println(Arrays.toString(arr));

    }
}
