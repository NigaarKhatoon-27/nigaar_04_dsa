class Solution {
    public static int solve(int[] dp , int n){
        if(n<=1 ) return n;
        if(dp[n] != -1) return dp[n];
        return dp[n] = solve(dp , n-1)+ solve(dp , n-2);
    }
    public int fib(int n) {
        //Recursion
        // if(n<=1) return n;
        // return fib(n-1) + fib(n-2);

        //Memoization
        int[] dp = new int[n+1];
        for(int i=0;i<=n;i++){
            dp[i] = -1;
        }
        return solve(dp , n);
        
    }
}