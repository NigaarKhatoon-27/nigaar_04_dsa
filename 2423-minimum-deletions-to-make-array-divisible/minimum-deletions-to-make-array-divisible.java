import java.util.*;

class Solution {
    
    public int minOperations(int[] nums, int[] numsDivide) {
        
        
        int gcdValue = numsDivide[0];
        
        for (int i = 1; i < numsDivide.length; i++) {
            gcdValue = gcd(gcdValue, numsDivide[i]);
        }
        
        
        Arrays.sort(nums);
        
        
        for (int i = 0; i < nums.length; i++) {
            if (gcdValue % nums[i] == 0) {
                return i;
            }
        }
        
        return -1;
    }
    
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}