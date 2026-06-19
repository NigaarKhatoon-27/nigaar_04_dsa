class Solution {
    public int findDuplicate(int[] nums) {
        //Brute force

        // int repeating = -1;
        // for(int i=1;i<nums.length;i++){
        //     int count =0;
        //     for(int j = 0;j<nums.length;j++){
        //         if(nums[j]==i){
        //             count++;
        //         }
        //     }
        //     if(count >= 2) repeating = i;
            

        // }
        // return repeating;


        //Better approach using hashing
        int repeating = -1;
        int[] hash = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            hash[nums[i]] += 1;
        }
        for(int i=1;i<hash.length;i++){
            if(hash[i] >=2) {
                repeating = i;
            }
        }
        return repeating;

        
    }
}