class Solution {
    public boolean isPossible(int[] nums , int mid , int threshold){
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum += (int)Math.ceil((double)nums[i]/mid);
        }
        return sum <=threshold;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
           
            high = Math.max(nums[i] , high);
        }
        while(low<= high){
            int mid = low+(high-low)/2;
            if(isPossible(nums , mid , threshold)){
                high = mid-1;
            
            }
            else{
                low= mid+1;
            }

        }
        return low;
        
    }
}