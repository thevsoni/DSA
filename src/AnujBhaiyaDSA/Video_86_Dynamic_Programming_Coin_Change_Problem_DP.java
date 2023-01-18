package AnujBhaiyaDSA;

import java.util.Arrays;

//we can solve this question using binary search also

public class Video_86_Dynamic_Programming_Coin_Change_Problem_DP {
    public static void main(String[] args) {

        //if we do this using simple recursion ,then no.of operation happens max ,for this question 620 times
        //bcs using this ,recursion call ho raha hai many times also for overlapping things
        //means we have already got the ans for 2 that for 2 its sure that ans will be 2 but each number
        //calls function also for 2 which does not make sence ,just waste of time so use dp
        int[] arr = {1,5,7};
        int n = 18;
//        int[] arr = {186,419,83,408};
//        int n=6249;

        //using simple recursion
        System.out.println("using recursion");
        System.out.println(minCoin(n,arr));
        System.out.println(operations);

        //using dp
        System.out.println("using dp");
        int[] dp = new int[n+1];
        Arrays.fill(dp,-2);
        dp[0]=0;
        System.out.println(minCoinDp(n,arr,dp));
        System.out.println(operations2);


        //best
        //using dp 2d
        System.out.println("using 2d dp");
        System.out.println(dp_2d(arr,18));

    }

    static int operations=0;
    static int operations2=0;

    //using simple recursion
    public static int minCoin(int n,int[] arr){
        operations++;
        if(n==0) return 0;
        int ans = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(n-arr[i]>=0){
                int subAns = minCoin(n-arr[i],arr);
                if(subAns+1<ans){
                    ans = subAns+1;
                }
            }
        }
        //we can write here code for corner cases if amount < coin rupees then retirn -1
        return ans;
    }
    // using dp
    public static int minCoinDp(int n,int[] arr,int[] dp){
         operations2++;
        if(n==0) return 0;
        int ans = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(n-arr[i]>=0){
                int subAns;
                if(dp[n-arr[i]]!=-2){
                    subAns=dp[n-arr[i]];
                }else {
                    subAns = minCoinDp(n - arr[i], arr, dp);
                    if(subAns==-1){
                        continue;
                    }
                }
                if(subAns!=-1 && subAns+1<ans){
                    ans = subAns+1;
                }
            }
        }
        if(ans==Integer.MAX_VALUE){
            ans=-1; //to handle that type of corner case where i have to make like 5 rupees but there is 7 rupees coin
        }
        dp[n]=ans;
        return ans;     //return dp[n]=ans; can write directly
    }

    //using 2d
    public static int dp_2d(int[] coins, int n){
        int[][] dp = new int[coins.length+1][n+1];
        Arrays.fill(dp[0],Integer.MAX_VALUE);
        for(int i=1; i<dp.length; i++){
            for(int j=1; j<dp[0].length; j++){
                if(j<coins[i-1]){
                    dp[i][j]=dp[i-1][j];
                }else{
                    dp[i][j] = Math.min(1+dp[i][j-coins[i-1]],dp[i-1][j]);
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}
