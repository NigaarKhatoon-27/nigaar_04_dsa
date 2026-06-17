class Solution {
    public int[][] merge(int[][] intervals) {
        //Brute
        // Arrays.sort(intervals , (a,b)->a[0]-b[0]);
        // int n = intervals.length;
        // List<int[]> ans = new ArrayList<>();
        // for(int i=0;i<intervals.length;i++){
        //     int start = intervals[i][0];
        //     int end = intervals[i][1];
        //     if(!ans.isEmpty() && (end  <= ans.get(ans.size()-1)[1]) ){
        //         continue;
        //     }
        //     for(int j=i+1;j<intervals.length;j++){
        //         if(intervals[j][0] <= end){
        //             end = Math.max(end , intervals[j][1]);
        //         }
        //         else {
        //             break;
        //         }
        //     }
        //     ans.add(new int[]{start , end});
        // }
        //  return ans.toArray(new int[ans.size()][]);

        //Better / Optimal
        int n = intervals.length;
        Arrays.sort(intervals , (a,b)->a[0]-b[0]);
        List<int[]> ans = new ArrayList<>();
        for(int[] interval : intervals){
            if(ans.isEmpty() || ans.get(ans.size()-1)[1] < interval[0]){
                ans.add(interval);
            }
            else {
                ans.get(ans.size()-1)[1] = Math.max(ans.get(ans.size()-1)[1] , interval[1]);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    
        
    }
}