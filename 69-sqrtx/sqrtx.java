class Solution {
    public int mySqrt(int x) {
        // if(x==0) return 0;
        // int ans = 1;
        // for(int i=1;i<=x;i++){
        //     if( (long) i*i <= x ){
        //         ans = (int)i;
        //     }
        //     else{
        //         break;
        //     }
        // }
        // return ans;

        //Optimal using binary search
        if(x==0 || x==1) return x;
        int low = 1;
        int high = x;
        int ans = 1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if((long)mid * mid <= x){
                ans = mid;
                low = mid+1;
            }
          
            else high = mid-1;
        }
        return ans;
        
    }
}