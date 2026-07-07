class Solution {
    public int fibo(int[] dp ,int n){
        if(n<=1) return n;
        if(dp[n] != -1) return dp[n];
        dp[n] = fibo(dp , n-1) + fibo(dp , n-2);
        return dp[n];

    

    }
    public int fib(int n) {
        int[] dp = new int[n+1];
        for(int i=0;i<dp.length;i++){
            dp[i] = -1;
        }
        return fibo(dp , n);
        
    }
}