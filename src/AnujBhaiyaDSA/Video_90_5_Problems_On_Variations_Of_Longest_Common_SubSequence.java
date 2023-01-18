package AnujBhaiyaDSA;

public class Video_90_5_Problems_On_Variations_Of_Longest_Common_SubSequence {
    public static void main(String[] args) {

        //1.lcs space complexity optimisation
        //2.minimum insertion and deletion to convert s1 into s2
        //3.minimum length of super sequence of s1 and s2
        //4.longest repeating subsequence
        //5.longest palindrome subsequence


        //1.lcs space complexity optimising
        String word1 = "aecb";
        String word2 = "abcab";
        int m = word1.length();
        int n = word2.length();


        int[][] dp = new int[2][n+1]; //optimising space complexity

        int ans = mind(dp,word1,word2);
        System.out.println(ans);

    }
    public static int mind(int[][] dp, String word1, String word2){
        for(int i=1; i<word1.length()+1; i++){
            for(int j=1; j<dp[0].length; j++){
                if(word1.charAt(i-1)==word2.charAt(j-1)){
                    dp[1][j]=1+dp[1-1][j-1];
                }
                else{
                    dp[1][j]=Math.max(dp[1-1][j],dp[1][j-1]);
                }
            }
            //now copy 2nd row into 1st row
            System.arraycopy(dp[1],0,dp[0],0,dp[0].length);
        }
        return dp[1][dp[0].length-1];
    }

}
