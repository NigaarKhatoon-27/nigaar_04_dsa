class Solution {
    public int steps(int[] dp , int n){
        if(n<=1) return 1;
        if(dp[n] != -1) return dp[n];
        dp[n] = steps(dp ,n-1) + steps(dp,n-2);
        return dp[n];

    }
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        for(int i=0;i<dp.length;i++){
            dp[i] = -1;
        }
        return steps(dp , n);
        
        
    }
}