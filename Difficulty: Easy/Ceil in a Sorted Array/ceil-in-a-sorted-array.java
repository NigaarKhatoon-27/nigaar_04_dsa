class Solution {
    public int findCeil(int[] arr, int x) {
        // code here
        int low =0;
        int high = arr.length -1;
        int ceil = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] >= x){
                ceil = mid;
                high = mid-1;
            }
        
            else{
                low = mid+1;
            }
        }
        return ceil;
    }
}
