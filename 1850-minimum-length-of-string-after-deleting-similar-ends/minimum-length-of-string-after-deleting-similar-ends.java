class Solution {
    public int minimumLength(String s) {
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length -1;
        while(left<right && arr[left]==arr[right]){
            char ch = arr[left];
            while(left<=right && arr[left]==ch){
                left++;
            }
            while(left<=right && arr[right]==ch){
                right--;
            }
        }
        return right-left+1;
    
    }
}