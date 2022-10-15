class Solution {
    int[][] visited;
    int rows;
    int cols;
    
    private int dfs(int[][] grid, int r, int c){
            if(r < 0 || r == rows || c < 0 || c == cols
              || grid[r][c] == 0 || visited[r][c] == 1){
                return 0;
            }
            visited[r][c] = 1;
            return 1 + dfs(grid, r + 1, c)
                + dfs(grid, r - 1, c)
                + dfs(grid, r, c + 1)
                + dfs(grid, r, c - 1);
        }
    
    public int maxAreaOfIsland(int[][] grid) {
        rows = grid.length;
        cols = grid[0].length;
        visited = new int[rows][cols];
        int area = Integer.MIN_VALUE;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(visited[i][j] == 0){
                    area = Math.max(area, dfs(grid, i,j));
                }
            }
        }
        return area;
    }
}