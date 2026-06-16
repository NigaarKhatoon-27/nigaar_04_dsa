class Solution {
    public int maxProduct(int[] nums) {
        //Brute force O(n^3)
        // if(nums.length==0) return 0;
        // int maxi = Integer.MIN_VALUE;
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i;j<nums.length;j++){
        //         int prod = 1;
        //         for(int k= i;k<=j;k++){
        //             prod = prod * nums[k];
        //             maxi = Math.max(prod , maxi);
        //         }
        //     }
        // }
        // return maxi;

        //Better O(n^2)
           if(nums.length==0) return 0;
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
             int prod = 1;
            for(int j=i;j<nums.length;j++){
                
                    prod = prod * nums[j];
                    maxi = Math.max(prod , maxi);
                
            }
        }
        return maxi;
        

    }
}