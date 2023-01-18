package AnujBhaiyaDSA;

import java.util.PriorityQueue;

public class Video_34_Connect_N_Ropes_Priority_Queue {
    public static void main(String[] args) {

        int[] arr = {2,5,4,8,6,9};
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<arr.length; i++){
            pq.add(arr[i]);
        }
        System.out.println(pq);

        int a;
        int b;
        int result = 0;
        while(!pq.isEmpty()){
            if(pq.size()==1){
                break;
            }
            a = pq.poll();
            b = pq.poll();
            result += a+b;
            pq.add(a+b);

        }
        System.out.println(result);
    }
}
