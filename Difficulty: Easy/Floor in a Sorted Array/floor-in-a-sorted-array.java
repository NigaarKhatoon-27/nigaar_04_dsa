class Solution {
    static int findFloor(int[] arr, int target) {
        int low = 0;
        int high = arr.length -1;
        int floor = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] <= target){
                floor = mid;
                low = mid+1;
            }
            else if(arr[mid] > target){
                high = mid -1;
            }
          
        }
        return floor;
        // code here
        
    }
}
