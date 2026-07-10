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
//         HashMap<Integer , Integer> map = new HashMap<>();
//         for(int i=0;i<nums.length;i++){
//             if(map.containsKey(nums[i])){
//                 map.put(nums[i] , map.get(nums[i])+1);
//             }
//             else{
//                 map.put(nums[i] , 1);
//             }
//         }
//         ArrayList<Integer> list = new ArrayList<>();
//         int limit = nums.length / 3;
//         for(int key : map.keySet()){
//            if(map.get(key) > limit){
// list.add(key);
//            }
//         }
//         return list;

//Moore voting algorithm
int count1=0;
int count2 =0;
int ele1= Integer.MIN_VALUE;
int ele2 = Integer.MIN_VALUE;
ArrayList<Integer> list = new ArrayList<>();
for(int i=0;i<nums.length;i++){
    if(count1 == 0 && ele2 != nums[i]){
        count1++;
        ele1 = nums[i];
    }
    else if(count2 == 0 && ele1 != nums[i]){
        count2++;
        ele2 = nums[i];
    }
    else if(ele1 == nums[i]){
        count1++;
    }
    else if(ele2 == nums[i]){
        count2++;
    }
    else{
        count1--;
        count2--;
    }
}
count1=0;
count2=0;
for(int num : nums){
    if(num == ele1) count1++;
    if(num == ele2) count2++;
}
int limit = nums.length / 3;
if(count1 > limit) list.add(ele1);
if(count2 > limit) list.add(ele2);
return list;


        
    }
}