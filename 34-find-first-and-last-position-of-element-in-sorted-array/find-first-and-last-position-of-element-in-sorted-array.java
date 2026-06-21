class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] temp = new int[2];
        int low = 0;
        int high = nums.length -1;
        int first = nums.length;
        int last = nums.length;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]>= target){
                first = mid;
                high = mid-1;
            }
            else {
                low = mid+1;
            }
            
        }
            if (first == nums.length || nums[first] != target) {
            return new int[]{-1, -1};
        }
        temp[0]= first;
        low = 0;
        high = nums.length-1;
        while(low<=high){
            int mid = low + (high - low)/2;
            if(nums[mid] > target){
                last = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        temp[1]= last -1 ;
        return temp;

        
    }
}