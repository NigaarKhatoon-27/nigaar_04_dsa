class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxsofar=0;
        int minsofar=0;
        int currmax=0;
        int currmin=0;
        for (int num:nums){
            currmax=Math.max(currmax + num,num);
            maxsofar=Math.max(currmax,maxsofar);
            currmin=Math.min(currmin + num,num);
            minsofar=Math.min(currmin,minsofar);
        }return Math.max(maxsofar,Math.abs(minsofar));

    }
}