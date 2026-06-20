class Solution {
    public void markRow(int[] row , int r){
        row[r]=1;
    }
    public void markCol(int[] col , int s){
        col[s]=1;
    }
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] row = new int[rows];
        int[] col = new int[cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j]==0){
                    markRow(row , i);
                    markCol(col , j);
                }
            }
        }
            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                    if(row[i]==1 || col[j]==1 ){
                        matrix[i][j]=0;
                    }
                }

            }
        }
        
    }
