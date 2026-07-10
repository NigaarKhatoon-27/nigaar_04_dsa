class Solution {
    public static boolean isPalindrome(int n){
        int rev = 0;
        int dup = n;
        while(n>0){
            int ld = n % 10;
            rev = rev * 10 + ld;
            n = n / 10;
            
        }
        return rev == dup;
    }
    public static boolean isPalinArray(int[] arr) {
        // code here.
        for(int num : arr){
            if(!isPalindrome(num)){
                return false;
            }
        }
        return true;
        
    }
}