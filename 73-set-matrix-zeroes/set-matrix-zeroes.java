
//Brute

// class Solution {

//     public void markRow(int[] row, int r) {
//         row[r] = 1;
//     }

//     public void markCol(int[] col, int c) {
//         col[c] = 1;
//     }

//     public void setZeroes(int[][] matrix) {

//         int rows = matrix.length;
//         int cols = matrix[0].length;

//         int[] row = new int[rows];
//         int[] col = new int[cols];

//         // Mark rows and columns
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 if (matrix[i][j] == 0) {
//                     markRow(row, i);
//                     markCol(col, j);
//                 }
//             }
//         }

//         // Set elements to 0
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 if (row[i] == 1 || col[j] == 1) {
//                     matrix[i][j] = 0;
//                 }
//             }
//         }
//     }
// }


//Better

class Solution {

   

 

    public void setZeroes(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[] row = new int[rows];
        int[] col = new int[cols];

        // Mark rows and columns
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    row[i]=1;
                    col[j]=1;
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
