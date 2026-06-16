class Solution {
    // public boolean linearSearch(int[] nums , int target){
    //     for(int i=0;i<nums.length;i++){
    //         if(nums[i]==target) return true;
            
    //     }
    //  return false;
    // }
    public int longestConsecutive(int[] nums) {
    //     if(nums.length==0) return 0;
    //     //Brute force
    //     int longest = Integer.MIN_VALUE;
    //     int count =1 ;
    //     for(int i =0;i<nums.length;i++){
    //         int current = nums[i];
    //         count =1;
    //         while(linearSearch(nums ,current + 1)){
    //             current++;
    //             count++;
    //         }
    //         longest = Math.max(longest , count);
    //     }
    //     return longest;
        

        //Better approach using sorting
        // if(nums.length == 0) return 0;
        // Arrays.sort(nums);
        // int longest = 1;
        // int count = 1;
        // for(int i=1;i<nums.length;i++){
        //     if(nums[i]== nums[i-1]){
        //         continue;
        //     }
        //     else if(nums[i]==nums[i-1]+1){
        //         count++;
        //     }
        //     else{
        //         count = 1;
        //     }
        //     longest = Math.max(longest , count);
        // }
        // return longest;

        //optimal approach
        if(nums.length == 0) return 0;
        HashSet<Integer> st = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            st.add(nums[i]);
        }
       
      
        int longest = 1;
        

        for(int num : st){
        if(!st.contains(num-1)){
        int current = num;
          int count = 1;
        
        while(st.contains(current+1)){
            count++;
            current++;
        }
        
        longest = Math.max(count , longest);
             }
        }
        return longest;

    }
}