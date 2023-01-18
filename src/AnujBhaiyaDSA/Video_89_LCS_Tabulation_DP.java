package AnujBhaiyaDSA;

public class Video_89_LCS_Tabulation_DP {
    public static void main(String[] args) {

        String str1 = "aecb";
        String str2 = "abcab";
        int m = str1.length();
        int n = str2.length();
        int[][] dp = new int[m+1][n+1];
        System.out.println(maxLCS(str1,str2,m,n,dp));

        //to get that common subsequence
        System.out.println(getLCS(dp,str1,str2));

    }
    public static int maxLCS(String str1,String str2,int m,int n,int[][] dp){

        for(int i=1; i<dp.length; i++){
            for(int j=1; j<dp[0].length; j++){
                if(str2.charAt(j-1)==str1.charAt(i-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
    public static String getLCS(int[][] dp,String str1,String str2){
        StringBuilder sb = new StringBuilder();

        for(int i= dp.length-1,j=dp[0].length-1; i>=1 && j>=1;){
            if(dp[i][j]==dp[i-1][j]){
                i--;
            }
            else if(dp[i][j]==dp[i][j-1]){
                j--;
            }
            else{
                sb.insert(0,str1.charAt(i-1));
                i--;
                j--;
            }
        }
        return sb.toString();
    }

}
