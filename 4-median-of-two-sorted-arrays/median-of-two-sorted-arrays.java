class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] ans = mergedArray(nums1 , nums2);
        double med = 0;
        if(ans.length % 2 ==0){
            int mid1 = ans.length / 2;
            int mid2 = mid1 -1;
            med = (ans[mid1]+ans[mid2])/2.0;
        }
        else{
            med = ans[ans.length / 2];
        }
return med;
    }
    
    public int[] mergedArray(int[] nums1 , int[] nums2){
        int[] ans = new int[nums1.length + nums2.length];
        int i=0;
        int j =0;
        int k =0;
        while(i<nums1.length && j<nums2.length){
            int val1 =  nums1[i];
            int val2 = nums2[j];
            if(val1 < val2){
                ans[k++]=val1;
                i++;
            }
            else{
                ans[k++]=val2;
                j++;
            }
        }
        while(i<nums1.length){
            ans[k++]=nums1[i++];
        }
    while(j<nums2.length){
            ans[k++]=nums2[j++];
        }
        return ans;
    }
}