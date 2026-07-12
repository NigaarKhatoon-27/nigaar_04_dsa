class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        int low = 0;
        int high = nums.length-1;
        int first = nums.length;
        while(low<= high){
            int mid = low + (high - low)/2;
            if(nums[mid] >= target){
                first = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        if(first == nums.length || nums[first] != target){
            return new int[]{-1,-1};
        }
        ans[0] = first;
low = 0;
high = nums.length -1 ;
int second = nums.length;
while(low<= high){
    int mid = low + (high - low)/2;
    if(nums[mid]> target){
        second = mid;
        high = mid-1;
    }
    else{
        low = mid+1;
    }
}
ans[1] = second -1;
return ans;
        
    }
}