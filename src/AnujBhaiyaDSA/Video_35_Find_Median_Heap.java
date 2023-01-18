package AnujBhaiyaDSA;

import java.util.PriorityQueue;

public class Video_35_Find_Median_Heap {
    static PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
    static PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    public static void insertNum(int num){
        if(maxHeap.isEmpty() || maxHeap.peek()>=num){
            maxHeap.add(num);
        }else{
            minHeap.add(num);
        }

        if(maxHeap.size()>minHeap.size()+1){
            minHeap.add(maxHeap.poll());
        }else if (maxHeap.size()<minHeap.size()){
            maxHeap.add(minHeap.poll());
        }
    }

    public static double findMedian(){
        if (maxHeap.size()==minHeap.size()){
            return maxHeap.peek()+minHeap.peek()/2.0;
        }else{
            return maxHeap.peek();
        }
    }
    public static void main(String[] args) {

    }
}
