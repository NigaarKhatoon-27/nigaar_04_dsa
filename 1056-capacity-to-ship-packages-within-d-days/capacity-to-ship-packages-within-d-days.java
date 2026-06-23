class Solution {
    public boolean canShip(int[] weights , int mid , int days){
        int load = 0;
        int reqDays = 1;
        for(int i=0;i<weights.length;i++){
            if(load + weights[i] <= mid){
                load += weights[i];
            }
            else{
                load = weights[i];
                reqDays++;
            }
        }
        return reqDays <= days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low =0;
        int high =0 ;
      
        for(int i=0;i<weights.length;i++){
            low = Math.max(low , weights[i]);
            high += weights[i];
        }
        int ans = high;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(canShip(weights , mid , days)){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return low;
        
    }
}