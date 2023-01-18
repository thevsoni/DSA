package AnujBhaiyaDSA;

public class Video_94_Matrix_Chain_Multiplication {
    public static void main(String[] args) {
        // 2*3,3*4,4*1,1*3
        int[] arr = {2, 3, 4, 1, 3};
        System.out.println(using_recursion(arr, 0, arr.length - 1));

        System.out.println(using_dp(arr));
    }

    public static int using_recursion(int[] arr, int start, int end) {
        if (end - start <= 1 || end >= arr.length) {
            return 0;
        }
        if (end - start == 2) {
            return arr[start] * arr[start + 1] * arr[end];
        }

        int ans = Integer.MAX_VALUE;

        for (int i = start; i <= end - 2; i++) {
            int a = using_recursion(arr, start, i + 1);
            int b = using_recursion(arr, i + 1, end);
            int c = a + b + (arr[start] * arr[i + 1] * arr[end]);
            ans = Math.min(ans, c);
        }
        return ans;
    }
    public static int using_dp(int[] arr){
        int[][] dp = new int[arr.length][arr.length];

        for(int j=2 ; j<dp.length; j++){
            for (int row=0,col=j; row<dp.length&&col<dp.length; row++,col++){
                dp[row][col] = Math.min(dp[row][col-1]+ arr[row]*arr[col-1]*arr[col], dp[row+1][col]+ arr[row]*arr[row+1]*arr[col]);
            }
        }
        return dp[0][arr.length-1];
    }
}