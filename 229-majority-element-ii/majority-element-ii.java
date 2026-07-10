class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // BRUTE FORCE
        // int majority = nums.length / 3;
        // ArrayList<Integer> list = new ArrayList<>();
        // for(int i=0;i<nums.length;i++){
        //     if(list.contains(nums[i])){
        //         continue;
        //     }
        //     int count =0;
        //     for(int j= 0;j<nums.length;j++){
        //         if(nums[i]== nums[j]){
        //             count++;
        //         }
                

        //     }
        //     if(count > majority){
        //             list.add(nums[i]);
        //         }
        // }
        // return list;

        //Hashmap
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i] , map.get(nums[i])+1);
            }
            else{
                map.put(nums[i] , 1);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        int limit = nums.length / 3;
        for(int key : map.keySet()){
           if(map.get(key) > limit){
list.add(key);
           }
        }
        return list;
        
    }
}