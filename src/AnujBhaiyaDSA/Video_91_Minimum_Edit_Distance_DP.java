package AnujBhaiyaDSA;

public class Video_91_Minimum_Edit_Distance_DP {
    // minimum number of operation to convert string str1 into string str2
    //operations : insert,delete,replace
    public static void main(String[] args) {
        String str1="horse";
        String str2="ros";
        int ans = recursion(0,0,str1,str2);
        System.out.println(ans);

        //but here many things are overlapping like if we are calling delete first then it covers many operations answer
        //which will come later with different recursion call
        //now lets use dp here

        //firstly use simple dp with recursion
        int[][] dp = new int[str1.length()+1][str2.length()+1];
        for(int i=1; i<dp.length; i++){
            for(int j=1; j<dp[0].length; j++){
                dp[i][j]=-2;
            }
        }
        ans = dp_recursion1(1,1,str1,str2,dp);
        System.out.println(ans);


        //now dp without recursion


        //since empty string takes 0 operation to make "" string
        //default value as ith position takes ith operation to make into ""
        //int this case delete operation happens
        int[][] dp2 = new int[str1.length()+1][str2.length()+1];
        for(int i=1; i<dp[0].length; i++){
            dp2[0][i]=i;
        }
        //as well in row,empty string takes ith operation to make string till
        //ith row position
        for(int i=1; i<dp.length; i++){
            dp2[i][0]=i;
        }

        System.out.println(dp_loop(str1,str2,dp2));
    }



    public static int dp_loop(String word1,String word2,int[][] dp){

        for(int i=1; i<dp.length; i++){
            for(int j=1; j<dp[0].length; j++){
                if(word1.charAt(i-1)==word2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }else{                     //delete check      //replace
                    dp[i][j] = 1+Math.min(dp[i][j-1],Math.min(dp[i-1][j-1],
                            dp[i-1][j]));
                    //insert check
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
    public static int dp_recursion1(int m,int n,String word1,String word2,int[][] dp){

        if(m==word1.length()+1 && n==word2.length()+1){
            return 0;
        }
        if(m==word1.length()+1){
            return word2.length()+1-n;
        }
        if(n==word2.length()+1){
            return word1.length()+1-m;
        }

        if(dp[m][n]!=-2){
            return dp[m][n];
        }
        if(word1.charAt(m-1)==word2.charAt(n-1)){
            return dp[m][n] = dp_recursion1(m+1,n+1,word1,word2,dp);
        }else{
            //3 things happens
            return dp[m][n] = 1+Math.min(dp_recursion1(m+1,n,word1,word2,dp),
                    Math.min(dp_recursion1(m,n+1,word1,word2,dp),
                            dp_recursion1(m+1,n+1,word1,word2,dp)));
        }

    }
    /*
    public static int dp_recursion(int m,int n,String str1,String str2,int[][] dp){
        if(m==str1.length()+1 && n==str2.length()+1){
            return 0;
        }
        if(m==str1.length()+1){
            return str2.length()+1-n;
        }
        if(n==str2.length()+1){
            return str1.length()+1-m;
        }

        if(dp[m][n]!=-2){
            return dp[m][m];
        }

        if(str1.charAt(m-1)==str2.charAt(n-1)){
            return dp[m][n]=dp_recursion(m+1,n+1,str1,str2,dp);
        }
        else{                           //delete                               //insert                     //replace
            return dp[m][n]=1+Math.min(dp_recursion(m+1,n,str1,str2,dp),Math.min(dp_recursion(m,n+1,str1,str2,dp),dp_recursion(m+1,n+1,str1,str2,dp)));
        }

    }
    */
    public static int recursion(int m,int n,String str1,String str2){
        if(m==str1.length() && n==str2.length()){
            return 0;
        }
        if(m==str1.length()){
            return str2.length()-n;
        }
        if(n==str2.length()){
            return str1.length()-m;
        }

        if(str1.charAt(m)==str2.charAt(n)){
            return recursion(m+1,n+1,str1,str2);
        }
        else{                           //delete                               //insert                     //replace
            return 1+Math.min(recursion(m+1,n,str1,str2),Math.min(recursion(m,n+1,str1,str2),recursion(m+1,n+1,str1,str2)));
        }
    }
}
