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
        //    if(nums.length==0) return 0;
        // int maxi = Integer.MIN_VALUE;
        // for(int i=0;i<nums.length;i++){
        //      int prod = 1;
        //     for(int j=i;j<nums.length;j++){
                
        //             prod = prod * nums[j];
        //             maxi = Math.max(prod , maxi);
                
        //     }
        // }
        // return maxi;
        

        //Optimal
          if(nums.length==0) return 0;

          int n = nums.length;
         int maxi = Integer.MIN_VALUE;
         int prefix = 1;
         int suffix = 1;
         for(int i=0;i<nums.length;i++){
            if(prefix == 0) prefix = 1;
            if(suffix == 0) suffix = 1;
             prefix = prefix * nums[i];
             suffix = suffix * nums[n-i-1];
             maxi =  Math.max(maxi , Math.max(prefix , suffix));
         }
         return maxi;

    }
}