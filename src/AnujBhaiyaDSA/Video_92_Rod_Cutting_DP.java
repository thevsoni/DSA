package AnujBhaiyaDSA;

public class Video_92_Rod_Cutting_DP {
    public static void main(String[] args) {

        //i can solve this using simply recursion then 1d dp also then 2d dp also so lets do directly with 2d dp

        //there are n rodes like =1,2,3,4,5,6,7,8 i have to make 8 using anything anytimes
        //                profit =1,5,6,9,11,12,14,16                       but want maximum profit
        //so its easy like our 1st dp question

        int[] arr = {1,2,3,4,5,6,7,8};
        int[] pr =  {1,5,6,9,11,12,14,16};

        int[][] dp = new int[arr.length+1][pr.length+1];

        for(int i=1; i<dp.length; i++){
            for (int j=1; j<dp[0].length; j++){
                if(arr[j-1]<arr[i-1]){
                    dp[i][j]=dp[i-1][j];
                }else{
                    dp[i][j] = Math.max(dp[i-1][j],pr[i-1]+dp[i][arr[j-1]-arr[i-1]]);
                }
            }
        }
        int ans = dp[dp.length-1][dp[0].length-1];
        System.out.println(ans);

        //with O(n^2) but sc = O(n)
        System.out.println(cutRod(pr,8));

        //another method and this is understandable
        System.out.println(cutRod2(pr,8));
    }
    //more optimize
    public static int cutRod(int[] pr,int n){
        int[] dp = new int[n+1];
        for(int i=1; i<=n; i++){
            for (int j=0; j<i; j++){
                dp[i] = Math.max(dp[i],pr[j]+dp[i-j-1]);
            }
        }
        return dp[n];
    }
    public static int cutRod2(int[] pr,int n){
        int[] dp = new int[n+1];
        for(int i=1; i<=n; i++){
            dp[i] = pr[i-1];
            for (int j=0; j<=i/2; j++){
                dp[i] = Math.max(dp[i],dp[j]+dp[i-j]);
            }
        }
        return dp[n];
    }
}
