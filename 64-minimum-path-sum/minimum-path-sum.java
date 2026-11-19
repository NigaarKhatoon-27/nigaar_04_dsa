class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length; 
        int n = grid[0].length;

        for(int i = 0; i < m; i++){
            for(int ii = 0; ii < n; ii++){
                if(i + ii == 0) continue;
                if(i == 0) grid[i][ii] = grid[i][ii] + grid[i][ii - 1];
                else if(ii == 0) grid[i][ii] = grid[i][ii] + grid[i - 1][ii];
                else grid[i][ii] = grid[i][ii] + Math.min(grid[i - 1][ii], grid[i][ii - 1]);
            }
        }
        return grid[m - 1][n - 1];
    }
}