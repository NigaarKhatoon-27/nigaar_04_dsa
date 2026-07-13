class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left_count =0;
        int right_count=0;
        int low = 0;
        int high = nums.length-1;
        int n = nums.length;
        if(nums.length ==1 ) return nums[0];
        
        if(nums[0]!=nums[1]) return nums[0];
        if(nums[n-2]!=nums[n-1]) return nums[n-1];
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid]!=nums[mid-1] && nums[mid] != nums[mid+1]){
                return nums[mid];
            }
            int first = mid;
            int sec = mid;
            if(nums[mid]==nums[mid-1]){
                first = mid-1;
            }
            else{
                sec = mid +1;
            }
            left_count = first - low;
            right_count = high - sec;
            if(left_count % 2 ==0){
                low = sec+1;
            }
            else{
                high = first -1;
            }



        }
        return -1;
        
    }
}