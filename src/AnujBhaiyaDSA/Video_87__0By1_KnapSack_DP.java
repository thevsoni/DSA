package AnujBhaiyaDSA;

import java.util.Arrays;

public class Video_87__0By1_KnapSack_DP {
    static class Pair{
        int wt;
        int pr;
        Pair(int wt,int pr){
            this.wt=wt;
            this.pr=pr;
        }

    }
    //using only recursion
    static int numberOfOperationUsingRecursion=0;
    public static int getMaxProfit(Pair[] arr,int bagWt,int idx){
        numberOfOperationUsingRecursion++;
        if (bagWt==0 || idx==arr.length){
            return 0;
        }
        int profit = Integer.MIN_VALUE;
        for(int i=idx; i<arr.length; i++){
            if(bagWt-arr[i].wt>=0){
                int subProfit = getMaxProfit(arr,bagWt-arr[i].wt,i+1);
                if(subProfit != -1 && subProfit+arr[i].pr>profit){
                    profit = subProfit+arr[i].pr;
                }
            }
        }
        if(profit==Integer.MIN_VALUE){
            profit=-1;
        }
        return profit;
    }

    public static void main(String[] args) {
        Pair[] arr = new Pair[4];
        /*
        arr[0] = new Pair(10,40);
        arr[1] = new Pair(20,10);
        arr[2] = new Pair(30,90);
        arr[3] = new Pair(40,50);
        int bagWt = 60;
        */
        arr[0] = new Pair(1,20);
        arr[1] = new Pair(3,30);
        arr[2] = new Pair(4,10);
        arr[3] = new Pair(6,50);
        int bagWt = 10;


        //using only recursion
        System.out.println("using simple recursion = ");
        //here i can also use 1d dp but i am going to code diff algorithm for this so in that code,i will use dp
        int maxProfit = getMaxProfit(arr,bagWt,0);
        System.out.println(maxProfit);
        System.out.println("numberOfOperationUsingRecursion = "+numberOfOperationUsingRecursion);


        //lets use 1d array dp as well
        System.out.println("using 1d dp = ");
        int[] dp_1d = new int[bagWt+1];
        Arrays.fill(dp_1d,-2);
        dp_1d[0] = 0;
        System.out.println(getMaxProfit_1d_Dp(arr,bagWt,0,dp_1d));
        System.out.println("numberOfOperationUsingDp_1d = "+numberOfOperationUsingDp_1d);

        //lets use 2d dp here
        System.out.println("using 2d dp = ");
        Pair[] arr2 = new Pair[5];

        arr2[0] = new Pair(0,0);
        arr2[1] = new Pair(1,20);
        arr2[2] = new Pair(3,30);
        arr2[3] = new Pair(4,10);
        arr2[4] = new Pair(6,50);

        int[][] dp_2d = new int[arr2.length][bagWt+1];
        for(int i=0; i<dp_2d.length; i++){
            Arrays.fill(dp_2d[i],-2);
            dp_2d[i][0]=0;
        }
        Arrays.fill(dp_2d[0],0);
        //for this  i want my first row ,first col is zero so uding weight i have done but using arr

        System.out.println(getNumberOfOperationUsingDp_2d(dp_2d,arr2));
        //but for 2d dp ,not need to fill default value bcs we have to travel all the matrix from top to down and this
        //time, we fill value

    }

    //using 1d dp
    static int numberOfOperationUsingDp_1d=0;
    public static int getMaxProfit_1d_Dp(Pair[] arr,int bagWt,int idx,int[] dp_1d){
        numberOfOperationUsingDp_1d++;
        if (bagWt==0 || idx==arr.length){
            return 0;
        }
        int profit = Integer.MIN_VALUE;
        for(int i=idx; i<arr.length; i++){
            if(bagWt-arr[i].wt>=0){
                int subProfit;
                if(dp_1d[bagWt-arr[i].wt]!=-2){
                    subProfit = dp_1d[bagWt-arr[i].wt];
                }else{
                    subProfit = getMaxProfit_1d_Dp(arr,bagWt-arr[i].wt,i+1,dp_1d);
                }
                if(subProfit != -1 && subProfit+arr[i].pr>profit){
                    profit = subProfit+arr[i].pr;
                }
            }
        }
        if(profit==Integer.MIN_VALUE){
            profit=-1;
        }
        dp_1d[bagWt]=profit;
        return profit;
    }

    //using 2d dp
    public static int getNumberOfOperationUsingDp_2d(int[][] dp_2d, Pair[] arr2){

        for(int i=1; i<arr2.length; i++){
            for(int j=1; j<dp_2d[0].length; j++){
                //j is presenting weight from 1 to bag weight
                if(arr2[i].wt>j){
                    dp_2d[i][j]=dp_2d[i-1][j];
                }else if(arr2[i].wt==j){
                    dp_2d[i][j]=Math.max(dp_2d[i-1][j],arr2[i].pr);
                                        //if not take    //if take  //so max of both
                }else{ //if arr[i].wt<j
                    dp_2d[i][j] = Math.max(dp_2d[i-1][j],arr2[i].pr+dp_2d[i-1][j-arr2[i].wt]);
                }
            }
        }
        return dp_2d[dp_2d.length-1][dp_2d[0].length-1];
    }
}
