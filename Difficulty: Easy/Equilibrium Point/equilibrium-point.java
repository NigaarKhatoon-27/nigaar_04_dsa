class Solution {
    public static int findEquilibrium(int arr[]) {
        int total_sum =0;
        for(int i=0;i<arr.length;i++){
            total_sum += arr[i];
        }
        int left_sum =0;
        for(int i=0;i<arr.length;i++){
            total_sum -= arr[i];
            if(total_sum == left_sum){
                return i;
            }
            left_sum += arr[i];
        }
        return -1;
        
    }
}
