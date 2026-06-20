class Solution {
    public void moveZeroes(int[] nums) {
        //Brute force
        int[] temp = new int[nums.length];
       int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
                temp[k] = nums[i];
                k++;
            }
        }
        for(int i=0;i<temp.length;i++){
            nums[i]=temp[i];
        }
        int non_zero = temp.length;
        for(int j =non_zero;j<nums.length;j++){
            nums[j]=0;
        }

        
    }
}