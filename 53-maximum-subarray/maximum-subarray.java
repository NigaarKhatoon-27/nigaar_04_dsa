class Solution {
    public int maxSubArray(int[] arr) {
        int sum = 0;
        int max_sum = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            sum += arr[i];
            max_sum = Math.max(max_sum , sum);
            if(sum < 0){
                sum =0;
            }
        }
        return max_sum;
    }
}