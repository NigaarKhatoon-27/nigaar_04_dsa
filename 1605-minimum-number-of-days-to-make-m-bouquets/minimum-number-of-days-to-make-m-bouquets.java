class Solution {
    public boolean CanBloom(int[] bloomDay , int mid , int k ,int m ){
        int flowers = 0;
        int bouquet =0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i] <= mid){
                flowers++;
                if(flowers == k){
                    bouquet++;
                    flowers = 0;
                }
            }
            else{
                flowers = 0;
            }
        }
        return bouquet >= m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k > bloomDay.length) return -1;
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        for(int i=0;i<bloomDay.length;i++){
            low = Math.min(bloomDay[i] , low);
            high = Math.max(bloomDay[i] , high);
        }
        while(low<=high){
            int mid = low + (high-low)/2;
             if(CanBloom(bloomDay , mid , k,m)){
                high = mid-1;

             }
             else{
                low = mid+1;
             }
        }
        return low;
        
    }
}