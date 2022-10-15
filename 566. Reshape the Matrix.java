class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] result = new int[r][c];
        int row = 0, col = 0;
        if(m*n != r*c) return mat;
        for(int i = 0; i < m; i++){
                for(int j = 0; j < n; j++){
                    result[row][col++] = mat[i][j];
                    if(col == c){
                        row++;
                        col = 0;
                    }
                }
            }
            return result;
        
    }
}