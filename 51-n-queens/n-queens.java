class Solution {
    public List<List<String>> solveNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        return nQueensListOfLists(board,0);
    }
    public static List<String> nQueensList(boolean[][] board, int row)
    {
        if(row == board.length)
        {
            List<String> list = new ArrayList<>();
            for(int i = 0; i < board.length; i++)
            {
                StringBuilder sb = new StringBuilder();
                for(int j = 0; j < board.length; j++)
                {
                    if(board[i][j])
                    {
                        sb.append("Q");
                    }
                    else
                    {
                        sb.append(".");
                    }
                }
                list.add(sb.toString());
            }
            return list;
        }
        List<String> ans = new ArrayList<>();
        for(int col = 0; col < board.length; col++)
        {
            if(isSafe(board, row, col))
            {
                board[row][col] = true;
                ans.addAll(nQueensList(board, row + 1));
                board[row][col] = false;
            }
        }
        return ans;
    }
    public static boolean isSafe(boolean[][] board, int row, int col)
    {
        for(int i = 0; i < row; i++)
        {
            if(board[i][col])
            {
                return false;
            }
        }
        int maxLeft = Math.min(row, col);
        for(int i = 1; i <= maxLeft; i++)
        {
            if(board[row - i][col - i])
            {
                return false;
            }
        }
        int maxRight = Math.min(row, board.length - col - 1);
        for(int i = 1; i <= maxRight; i++)
        {
            if(board[row - i][col + i])
            {
                return false;
            }
        }
        return true;
    }
    public static List<List<String>> nQueensListOfLists(boolean[][] board, int row)
    {
        if(row == board.length)
        {
            List<String> list = new ArrayList<>();
            for(int i = 0; i < board.length; i++)
            {
                StringBuilder sb = new StringBuilder();
                for(int j = 0; j < board.length; j++)
                {
                    if(board[i][j])
                    {
                        sb.append("Q");
                    }
                    else
                    {
                        sb.append(".");
                    }
                }
                list.add(sb.toString());
            }
            List<List<String>> result = new ArrayList<>();
            result.add(list);
            return result;
        }
        List<List<String>> ans = new ArrayList<>();
        for(int col = 0; col < board.length; col++)
        {
            if(isSafe(board, row, col))
            {
                board[row][col] = true;
                ans.addAll(nQueensListOfLists(board, row + 1));
                board[row][col] = false;
            }
        }
        return ans;
    }
}