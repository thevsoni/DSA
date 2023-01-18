package AnujBhaiyaDSA;

public class Video_15_Best_time_to_buy_sell_2 {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,14,4};
        int profit = 0;
        for (int i=1; i< arr.length; i++){
            if (arr[i]>arr[i-1]){
                profit += arr[i]-arr[i-1];
            }
        }
        System.out.println(profit);
    }
}
