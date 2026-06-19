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
        // int repeating = -1;
        // int[] hash = new int[nums.length];
        // for(int i=0;i<nums.length;i++){
        //     hash[nums[i]] += 1;
        // }
        // for(int i=1;i<hash.length;i++){
        //     if(hash[i] >=2) {
        //         repeating = i;
        //     }
        // }
        // return repeating;

        //Best or optimal approach
        // int n = nums.length -1; 
        // int sumN = (n * (n+1))/2;
        
        // int s = 0;
        
        // for(int i=0;i<nums.length;i++){
        //     s += nums[i];
            
        //     }
        //     int repeating = s-sumN;
        //     return repeating;

//Using HashSet
HashSet<Integer> st = new HashSet<>();
for(int i=0;i<nums.length;i++){
    if(st.contains(nums[i])){
        return nums[i];
    }
    else {
        st.add(nums[i]);
    }
}
return -1;
        
    }
}