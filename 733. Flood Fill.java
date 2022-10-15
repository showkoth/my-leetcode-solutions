class Solution {
    int rows;
    int cols;
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        rows = image.length;
        cols = image[0].length;
        int color = image[sr][sc];
        if(color == newColor) return image;
        else{
            dfs(image, sr,sc, color, newColor);
        }
        return image;
        
    }
    
    private void dfs(int[][] image, int row, int col, int color, int newColor){
        if(row < 0 || row >= rows || col < 0 || col >= cols) return;
        if(image[row][col] == color){
            image[row][col] = newColor;
            dfs(image, row + 1, col, color, newColor);
            dfs(image, row - 1, col, color, newColor);
            dfs(image, row, col + 1, color, newColor);
            dfs(image, row, col - 1, color, newColor);
        }
    }
}
