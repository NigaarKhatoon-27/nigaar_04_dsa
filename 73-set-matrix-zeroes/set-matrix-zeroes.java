// class Solution {
//     public void markRows(int[][] matrix , int row, int cols){
//         for(int j=0;j<cols;j++){
//             if(matrix[row][j] != 0){
//                 matrix[row][j]=-1;
//             }
// }
//     }
//         public void markCols(int[][] matrix , int col, int rows){
//         for(int i=0;i<rows;i++){
//             if(matrix[i][col] != 0){
//                 matrix[i][col]=-1;
//             }
// }
//     }
//     public void setZeroes(int[][] matrix) {
//         int rows = matrix.length;
//         int cols = matrix[0].length;
//         for(int i=0;i<rows;i++){
//             for(int j=0;j<cols;j++){
//                 if(matrix[i][j]==0){
//                 markRows(matrix , i,cols);
//                 markCols(matrix, j,rows);

//             }

//         }
//         }
//         for(int i=0;i<rows;i++){
//             for(int j=0;j<cols;j++){
//                 if(matrix[i][j]==-1){
//                     matrix[i][j]=0;
//                 }
//             }
//         }
      


        
//     }
// }

class Solution {

    public void markRow(int[] row, int r) {
        row[r] = 1;
    }

    public void markCol(int[] col, int c) {
        col[c] = 1;
    }

    public void setZeroes(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[] row = new int[rows];
        int[] col = new int[cols];

        // Mark rows and columns
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    markRow(row, i);
                    markCol(col, j);
                }
            }
        }

        // Set elements to 0
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}