class Solution {
    // public boolean linearSearch(int[] nums , int n){
    //     for(int i=0;i<nums.length;i++){
    //         if(nums[i]==n){
    //             return true;
    //         }
            
    //     }
    //     return false;
    // }
    
    public int longestConsecutive(int[] nums) {
    //     //Brute force
    //     int longest =0;
       
    //     for(int i=0;i<nums.length;i++){
    //         int current = nums[i];
    //         int count =1;
    //         while(linearSearch(nums , current+1)){
    //             current++;
    //             count++;
    //         }
    //         longest = Math.max(longest , count);



    //     }
    //     return longest;

    //Better 
//     if(nums.length == 0){
//         return 0;
//     }
//     Arrays.sort(nums);
//     int longest =1;
//     int count =1;
//     for(int i=1;i<nums.length;i++){
//         if(nums[i]==nums[i-1]){
//             continue;
//         }
//         else if(nums[i]==nums[i-1]+1){
//             count++;
//         }

//         else{
//             count =1;
//         }
//         longest = Math.max(longest , count);
//     }
// return longest;

//Better
HashSet<Integer> set = new HashSet<>();
if(nums.length ==0) return 0;
for(int i=0;i<nums.length;i++){
    set.add(nums[i]);
}

int longest =1;

for(int num : set ){
    if(!set.contains(num-1)){
        int current = num;
        int count=1;
    
    while(set.contains(current + 1)){
        current++;
        count++;
    }
    longest = Math.max(longest , count);
}
}
return longest;


        
    }
}