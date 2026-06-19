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

//         ArrayList<Integer> ls = new ArrayList<>();
//         HashMap<Integer , Integer> mp = new HashMap<>();
//         for(int i=0;i<nums.length;i++){
//             if(mp.containsKey(nums[i])){
//                 mp.put(nums[i] , mp.get(nums[i])+1);
//             }
//             else {
//                 mp.put(nums[i] , 1);
//             }
//         }
//         int limit = nums.length / 3;
//         for(int key : mp.keySet()){
//             if(mp.get(key) > limit){
//                 ls.add(key);
//             }
//         }
// return ls;

//optimal

List<Integer> ls = new ArrayList<>();
int cnt1 =0;
int cnt2=0;
int ele1 = Integer.MIN_VALUE;
int ele2 = Integer.MIN_VALUE;
for(int i=0;i<nums.length;i++){
    if(cnt1==0 && ele2 != nums[i]){
        cnt1++;
        ele1 = nums[i];

    }
    else if(cnt2==0 && ele1 != nums[i]){
        cnt2++;
        ele2 = nums[i];

    }
    else if(ele1 == nums[i]){
        cnt1++;
    }
    else if(ele2 == nums[i]){
        cnt2++;
    }
    else{
        cnt1--;
        cnt2--;
    }
   

}
 cnt1=0;
    cnt2=0;
    for(int num : nums){
        if(num == ele1) cnt1++  ;
        if(num == ele2) cnt2++;
    }

int limit = nums.length / 3;
if(cnt1 > limit) ls.add(ele1);
if(cnt2 > limit) ls.add(ele2);
return ls;
        
    }
}