class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
            Arrays.sort(nums1);
            Arrays.sort(nums2);
        int i=0;
        int j=0;
        int k = 0;
        int m = Math.min(nums1.length, nums2.length);
        int[] ans = new int[m];
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]){
                i++;
            }
            else if(nums2[j]<nums1[i]){
                j++;
            }
            else{
                if(k==0 || ans[k-1]!= nums1[i]){
                ans[k]=nums1[i];
                k++;
                }
                
                i++;
                j++;
            }
        }
    int[] result = new int[k];
for (int s = 0; s < k; s++) {
    result[s] = ans[s];
}
return result;
    }
}