class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        //Brute force
        // HashSet<List<Integer>> set = new HashSet<>();
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         for(int k = j+1;k<nums.length;k++){
        //             if(nums[i] + nums[j] + nums[k] ==0){
        //                 List<Integer> lt = Arrays.asList(nums[i] , nums[j] , nums[k]);
        //                 Collections.sort(lt);
        //                 set.add(lt);
        //             }
        //         }
        //     }
        // }
        // return new ArrayList<>(set);

        //Better
        Set<List<Integer>> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            HashSet<Integer> hashset = new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
                int third = - (nums[i] + nums[j]);
                if(hashset.contains(third)){
                    List<Integer> lt = Arrays.asList(nums[i] , nums[j] , third);
                    Collections.sort(lt);
                    set.add(lt);
                }
                else{
                    hashset.add(nums[j]);
                }
            }
        }
        return new ArrayList<>(set);
    }
}