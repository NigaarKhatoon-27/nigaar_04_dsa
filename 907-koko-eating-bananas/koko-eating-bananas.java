class Solution {
    public int canFinish(int[] piles , int h , int mid){
        int hours = 0;
        for(int i=0;i<piles.length;i++){
            hours += Math.ceil((double)piles[i]/mid);
        }
        return hours;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            max = Math.max(max , piles[i]);
        }
        int low = 1;
        int high = max;
        while(low<=high){
            int mid = low+(high-low)/2;
           int total_hrs = canFinish(piles , h , mid);
            if(total_hrs <= h){
                high = mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
        
    }
}