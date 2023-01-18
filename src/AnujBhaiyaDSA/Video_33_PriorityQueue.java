package AnujBhaiyaDSA;

import java.util.Collections;
import java.util.PriorityQueue;

public class Video_33_PriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // using min heap (by default min heap implement hota hai)
        System.out.println("using min heap");
        pq.add(45);
        pq.add(49);
        pq.add(295);
        pq.add(35);
        pq.add(55);
        pq.add(5);
        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.poll();
        }

        // using max heap
        System.out.println("using max heap");
        pq.add(-45);
        pq.add(-49);
        pq.add(-295);
        pq.add(-35);
        pq.add(-55);
        pq.add(-5);
        while(!pq.isEmpty()){
            System.out.println(-pq.peek());
            pq.poll();
        }
        // we can also this one using max heap
        System.out.println("we can also this one using max heap");
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());//doubt why it is not working
        pq.add(45);
        pq.add(49);
        pq.add(295);
        pq.add(35);
        pq.add(55);
        pq.add(5);
        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.poll();
        }


        //Question : kth larget element in a array
        System.out.println("Question : kth larget element in a array");
        int[] arr = {20,10,60,30,50,40};
        int k = 3; // 3rd largest element
        for(int i=0; i<k; i++){
            pq.add(arr[i]);
        }
        for(int i=k; i< arr.length; i++){
            if(pq.peek()<arr[i]){
                pq.poll();
                pq.add(arr[i]);
            }
        }
        System.out.println(pq.peek());

        //kth minimum
        System.out.println("kth minimum ");
        // minus value daal kr bhi solve kr skte hain and max heap bana kr bhi solve kr skte hain
        for(int i=0; i<k; i++){
            pq2.add(arr[i]);
        }
        for(int i=k; i<k; i++){
            if(pq2.peek()>arr[i]){
                pq2.poll();
                pq2.add(arr[i]);
            }
        }
        System.out.println(pq.peek());
    }
}
