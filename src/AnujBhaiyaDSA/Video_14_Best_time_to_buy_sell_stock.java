package AnujBhaiyaDSA;

import java.util.Arrays;
import java.util.Collections;

public class Video_14_Best_time_to_buy_sell_stock {

    public static void main(String[] args) {

        int[] arr = {7,6,5,4,3,2,1};
        int maxProfit = 0;
        int buyingDay=0;
        int sellingDay=0;
        boolean bl = false;

        //brute force  it will take O(n^2) tc
        System.out.println("brute force  it will take O(n^2) tc");
        for (int i=0;i< arr.length-1;i++){

            for (int j=i+1;j< arr.length;j++){

                if (arr[j]-arr[i]>maxProfit) {
                        maxProfit = arr[j] - arr[i];
                        buyingDay = i + 1;
                        sellingDay = j + 1;
                        bl = true;
                }
            }
        }
        if (bl==true) {
            System.out.println("buying day is = " + buyingDay);
            System.out.println("selling day is = " + sellingDay);
            System.out.println("max profit is = " + maxProfit);
        }else{
            System.out.println(0);
        }

        //now we will use O(n) tc with O(n) sc
        System.out.println("now we will use O(n) tc with O(n) sc");
//        int[] ar = {7,1,5,9,4,3,2,8,6};
        int[] ar = {9,7,6,5,4,3,2};
//        int[] temp = Arrays.copyOf(ar,ar.length);
        int[] temp = Arrays.copyOf(ar,ar.length);

        for (int i= temp.length-2;i>=0;i--){
            if (temp[i]<temp[i+1]){
                temp[i]=temp[i+1];
            }
        }
        System.out.println(Arrays.toString(temp));
        int maxyValue=0;
        for (int i=0;i<ar.length;i++){
            if (maxyValue<temp[i]-ar[i]){
                maxyValue=temp[i]-ar[i];
            }
        }
        System.out.println("maxy value is = "+maxyValue);



        // will do more optimize with O(n) tc and sc O(1)
        System.out.println("will do more optimize with O(n) tc and sc O(1)");
        int[] nr = {3,1,4,8,7,2,5};
        int minSoFar=nr[0];   // it will consider as a buying value
        int mprofit = 0;
        for (int i=1; i<nr.length; i++){   // this nr[i]'s consider as a selling value
            minSoFar = Math.min(nr[i],minSoFar);
//            if (mprofit<nr[i]-min){
//                mprofit=nr[i]-min;
//            }
            mprofit = Math.max(mprofit,nr[i]-minSoFar);
            // mprofit = Math.max(mprofit,nr[i]-min) is one line code se bhi kaam ho jayega instead of taking if
        }
        System.out.println(mprofit);

        // like this we can solve previous method with O(n) tc and  with O(1) sc
        //isme hum last se start krenge max so far lekr


    }
}