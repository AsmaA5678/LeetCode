class Solution {
    public void gameOfLife(int[][] board) {
        int rows = board.length;
        int cols = board[0].length;
        int[][] copy = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                copy[i][j] = board[i][j];
            }
        }

     
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int liveN = countLiveNeighbors(copy, i, j);
                update(board, copy[i][j], i, j, liveN);
            }
        }
    }

    public int countLiveNeighbors(int[][] board, int i, int j) {
        int count = 0;
        int rows = board.length, cols = board[0].length;
        int[] directions = {-1, 0, 1};

        for (int r : directions) {
            for (int c : directions) {
                if (r == 0 && c == 0) continue;
                int row = i + r, col = j + c;
                if (row >= 0 && row < rows && col >= 0 && col < cols) {
                    count += board[row][col]; 
                }
            }
        }
        return count;
    }

    public void update(int[][] board, int currentState, int i, int j, int liveNeighbors) {
        if (currentState == 1) { 
            if (liveNeighbors < 2 || liveNeighbors > 3) {
                board[i][j] = 0;
            } else {
                board[i][j] = 1; 
            }
        } else { 
            if (liveNeighbors == 3) {
                board[i][j] = 1; 
            } else {
                board[i][j] = 0; 
            }
        }
    }
}
