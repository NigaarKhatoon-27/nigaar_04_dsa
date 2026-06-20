class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i] , map.get(nums[i])+1);
            }
            else {
                map.put(nums[i] , 1);
            }
        }
        int maxfreq = 0;
        for(int fval : map.values()){
        maxfreq = Math.max(maxfreq , fval);
        }
        int ans = 0;
        for(int freq : map.values()){
            if(freq == maxfreq){
                ans += freq;
            }

        }
        return ans;
        
    }
}