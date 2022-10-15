class Solution {
    
    public boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                var number = board[i][j];
                if(number == '.') continue;
                var row = "number " + number + " in row " + i;
                var col = "number " + number + " in col " + j;
                var grid = "number " + number + " in grid " + i/3 + "-" + j/3;
                if(set.contains(row) || set.contains(col) || set.contains(grid)){
                    return false;
                }
                else{
                    set.add(row);
                    set.add(col);
                    set.add(grid);
                }
            }
        }
        return true;
}
}