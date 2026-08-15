class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        ArrayList<Integer> ans = new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;

        int firstRow = 0;
        int firstCol = 0;
        int lastRow = m - 1;
        int lastCol = n - 1;

        while (firstRow <= lastRow && firstCol <= lastCol) {

            // Left -> Right
            for (int i = firstCol; i <= lastCol; i++) {
                ans.add(matrix[firstRow][i]);
            }
            firstRow++;

            // Top -> Bottom
            for (int i = firstRow; i <= lastRow; i++) {
                ans.add(matrix[i][lastCol]);
            }
            lastCol--;

            // Right -> Left
            if (firstRow <= lastRow) {
                for (int i = lastCol; i >= firstCol; i--) {
                    ans.add(matrix[lastRow][i]);
                }
                lastRow--;
            }

            // Bottom -> Top
            if (firstCol <= lastCol) {
                for (int i = lastRow; i >= firstRow; i--) {
                    ans.add(matrix[i][firstCol]);
                }
                firstCol++;
            }
        }

        return ans;
    }
}