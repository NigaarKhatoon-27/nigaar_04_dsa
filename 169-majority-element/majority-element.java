class Solution {
    public int majorityElement(int[] nums) {
    //BRUTE FORCE
    if(nums.length == 1) return nums[0];
    int majority = nums.length / 2;
    for(int i=0;i<nums.length;i++){
        int count =1;
        for(int j=i+1;j<nums.length;j++){
            if(nums[i]==nums[j]){
                count++;
            }
            if(count > majority) return nums[i];
        }
    
    }
    return -1;
        
    }
}