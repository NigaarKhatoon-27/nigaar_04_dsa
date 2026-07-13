class Solution {
    // public static int solve(int[] dp , int n){
    //     if(n<=1 ) return n;
    //     if(dp[n] != -1) return dp[n];
    //     return dp[n] = solve(dp , n-1)+ solve(dp , n-2);
    // }
    public int fib(int n) {
        //Recursion
        // if(n<=1) return n;
        // return fib(n-1) + fib(n-2);

        //Memoization
        // int[] dp = new int[n+1];
        // for(int i=0;i<=n;i++){
        //     dp[i] = -1;
        // }
        // return solve(dp , n);

        //Tabulation
        // int[] dp = new int[n+1];
        // if(n<=1) return n;
        // dp[0] = 0;
        // dp[1] = 1;
        // for(int i=2;i<dp.length;i++){
        //     dp[i] = dp[i-1] + dp[i-2];
        // }
        // return dp[n];

        //Space optimization
        
        if(n<=1) return n;
       int prev2 = 0;
       int prev1 = 1;
       int curr = 0;
        for(int i=2;i<=n;i++){
            curr = prev2 + prev1;
             prev2 = prev1;
            prev1 = curr;
       
        }
        
        return curr;
    }
}