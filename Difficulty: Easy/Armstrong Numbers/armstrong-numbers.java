class Solution {
    static boolean armstrongNumber(int n) {
        int dup = n ;
        int sum = 0;
        while(n>0){
            int ld = n % 10;
            sum += ld * ld * ld;
            n = n / 10;
        }
        if(sum == dup) return true;
        return false;
        // code here
        
    }
}