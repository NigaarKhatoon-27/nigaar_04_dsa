class Solution {
    public int maxArea(int[] height) {
        int area = 0;
        int max_area = 0;
        int left = 0;
        int right = height.length - 1;
        while(left < right){
            int heights = Math.min(height[left] , height[right]);
            int width = right - left ;
            area = width * heights;
            max_area = Math.max(area , max_area);
            if(height[left] < height[right]) left++;
            else right--;
        }
        return max_area;



        
    }
}