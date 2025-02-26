class Solution {
    public void solve(char[][] grid) {
        if (grid == null || grid.length == 0) return;

        int rows = grid.length;
        int cols = grid[0].length;
        for (int i = 0; i < rows; i++) {
            if (grid[i][0] == 'O') bfs(grid, i, 0);
            if (grid[i][cols - 1] == 'O') bfs(grid, i, cols - 1);
        }
        for (int j = 0; j < cols; j++) {
            if (grid[0][j] == 'O') bfs(grid, 0, j);
            if (grid[rows - 1][j] == 'O') bfs(grid, rows - 1, j);
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 'O') {
                    grid[i][j] = 'X';
                } else if (grid[i][j] == 'T') {
                    grid[i][j] = 'O'; 
                }
            }
        }
    }

    public void bfs(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] != 'O') return;
        grid[i][j] = 'T'; 
        bfs(grid, i + 1, j);
        bfs(grid, i - 1, j);
        bfs(grid, i, j + 1);
        bfs(grid, i, j - 1);
    }
}
