package AnujBhaiyaDSA;

public class Video_95_Palindromic_Partitioning_Problem_Minimum_Cuts_Required_To_Make_Palindrome {
    public static void main(String[] args) {

        //using bruteforce also we can do like starting idx ko last idx se compare krenge agar equal hai to starting ko
        //ek badhayenge and last ko ek decrease krenge else starting idx ko last idx ko 1 decrease krke compare krna start
        //krenge and jab bhi aisa kre to last me 1 add krna hoga jo bhi answer aaye usme but ye thoda complicate hoga

        //so use recursion

        //using recursion
//        String str = "abcd";
//        String str = "abba";
//        String str = "ababbbabbabab";
//        String str = "abbaaa";
        String str = "abbabcd";
        System.out.println(usingRecursion(str,0,str.length()-1));

        //using dp
        System.out.println(using_dp(str));


    }
    public static int usingRecursion(String str,int start,int end){

        if (isPalindrome(str,start,end) || start>=end){
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        for (int i=start; i<end; i++){
            ans = Math.min(usingRecursion(str,start,i)+usingRecursion(str,i+1,end)+1,ans);
        }
        return ans;
    }
    public static boolean isPalindrome(String str,int start,int end){

        for (int i=start,j=end; i<j; i++,j--){
            if (str.charAt(i)!=str.charAt(j)){
                return false;
            }
        }
        return true;
    }

    //using dp
    public static int using_dp(String str){
        int[][] dp = new int[str.length()][str.length()];

        for (int j=1; j<dp.length; j++){
            for (int row=0,col=j; row<dp.length&&col<dp.length; row++,col++){
                if (isPalindrome(str,row,col)){
                    dp[row][col]=0;
                }else{
                    int ans = Integer.MAX_VALUE;
                    for (int i=row; i<col; i++){
                        ans = Math.min(ans,dp[row][i]+dp[i+1][col]+1);
                    }
                    dp[row][col] = ans;
                }
            }
        }
        return dp[0][dp.length-1];
    }
}
