class Solution {
    public int subarraySum(int[] nums, int k) {
        //Brute
        // int count =0;
        // for(int i=0;i<nums.length;i++){
        //     int sum =0;
        //     for(int j=i;j<nums.length;j++){
        //         sum = sum + nums[j];
        //           if(sum==k) count++;
        //     }
          
        // }
        // return count;
        
        //Better
        HashMap<Integer  , Integer> mp = new HashMap<>();
        mp.put(0,1);
        int count = 0;
        int prefixSum =0;
        for(int i=0;i<nums.length;i++){
            prefixSum += nums[i];
            if(mp.containsKey(prefixSum-k)){
                count += mp.get(prefixSum - k);
            }
            mp.put(prefixSum , mp.getOrDefault(prefixSum,0)+1);
        }
        return count;

    }
}