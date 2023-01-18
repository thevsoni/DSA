package AnujBhaiyaDSA;

public class Video_88_Longest_Common_SubSequence_DP {
    public static void main(String[] args) {
        //using bruteforce it takes O(n2^n)

        //lets try to use good logic to decrease tc with O(2^n)
        String str1 = "abcab";
        String str2 = "aecb";
        System.out.println(helper(str1,str2));//using recursion with substring
        System.out.println(longestSS_recursion_pointer(0,0,str1,str2)); //without substring,with pointer


        //using dp
        int m=str1.length();
        int n = str2.length();
        int[][] dp = new int[m+1][n+1];
        for(int i=1; i<dp.length; i++){
            for(int j=1; j<dp[0].length; j++){
                dp[i][j]=-1;
            }
        }
        System.out.println(longestSS_dp(1,1,str1,str2,dp));
      }

      //using dp
      public static int longestSS_dp(int m,int n,String str1,String str2,int[][] dp){
          if(m==str1.length()+1 || n==str2.length()+1){
              return 0;
          }
          if(dp[m][n] !=-1){
              return dp[m][n];
          }
          if(str1.charAt(m-1)==str2.charAt(n-1)){
              return dp[m][n]= 1+longestSS_recursion_pointer(m+1,n+1,str1,str2);
          }else{
              return dp[m][n]=Math.max(longestSS_recursion_pointer(m,n+1,str1,str2),
                      longestSS_recursion_pointer(m+1,n,str1,str2));
          }
      }



    //using simple recursion
    public static int helper(String str1,String str2){
        if(str1.length()==0 || str2.length()==0){
            return 0;
        }
        if(str1.charAt(0)==str2.charAt(0)){
            return 1+(helper(str1.substring(1),str2.substring(1)));
        }else{
            return Math.max(helper(str1.substring(1),str2),helper(str1,str2.substring(1)));
        }
    }
    public static int longestSS_recursion_pointer(int m,int n,String str1,String str2){
        if(m==str1.length() || n==str2.length()){
            return 0;
        }
        if(str1.charAt(m)==str2.charAt(n)){
            return 1+longestSS_recursion_pointer(m+1,n+1,str1,str2);
        }else{
            return Math.max(longestSS_recursion_pointer(m,n+1,str1,str2),
                    longestSS_recursion_pointer(m+1,n,str1,str2));
        }
    }

}
