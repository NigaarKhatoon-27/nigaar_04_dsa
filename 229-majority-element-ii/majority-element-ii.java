class Solution {
    public List<Integer> majorityElement(int[] nums) {
//Brute force

        // ArrayList<Integer> ls = new ArrayList<>();
        // for(int i=0;i<nums.length;i++){
        //     if(ls.contains(nums[i])){
        //         continue;
        //     }
        //     int count =0;
        //     for(int j=0;j<nums.length;j++){
        //         if(nums[i]==nums[j]){
        //             count++;
        //         }
        //     }
        //     int limit = nums.length / 3;
        //     if(count > limit){
        //         ls.add(nums[i]);
        //     }
        // }
        // return ls;

        //Better 

        ArrayList<Integer> ls = new ArrayList<>();
        HashMap<Integer , Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(nums[i])){
                mp.put(nums[i] , mp.get(nums[i])+1);
            }
            else {
                mp.put(nums[i] , 1);
            }
        }
        int limit = nums.length / 3;
        for(int key : mp.keySet()){
            if(mp.get(key) > limit){
                ls.add(key);
            }
        }
return ls;
        
    }
}