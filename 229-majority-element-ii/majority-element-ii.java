class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // BRUTE FORCE
        int majority = nums.length / 3;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(list.contains(nums[i])){
                continue;
            }
            int count =0;
            for(int j= 0;j<nums.length;j++){
                if(nums[i]== nums[j]){
                    count++;
                }
                

            }
            if(count > majority){
                    list.add(nums[i]);
                }
        }
        return list;
        
    }
}