class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        for(int i = 0; i < matrix.length; i++){
            for(int j = matrix[i].length - 1; j >= 0; j--){
                System.out.println(matrix[i][j]);
                if(target == matrix[i][j]) return true;
                else if(target > matrix[i][j]){
                    break;
                }
            }
        }
        return false;
    }
}