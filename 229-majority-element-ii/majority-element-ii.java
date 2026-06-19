class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> ls = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(ls.contains(nums[i])){
                continue;
            }
            int count =0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            int limit = nums.length / 3;
            if(count > limit){
                ls.add(nums[i]);
            }
        }
        return ls;
        
    }
}