class Solution {
    public boolean isValidSudoku(char[][] board) {
        //Map<Integer, Integer> count = new HashMap<>();
        HashSet<Character> lines = new HashSet<Character>();

        //check columns
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(lines.contains(board[i][j]) && (board[i][j] != '.')){
                    return false;
                }
                lines.add(board[i][j]);
            }
            lines.clear();
        }

        //check rows
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(lines.contains(board[j][i]) && (board[j][i] != '.')){
                    return false;
                }
                lines.add(board[j][i]);
            }
            lines.clear();
        }

        //check boxes
        for (int boxRow = 0; boxRow < 9; boxRow += 3) {
            for (int boxCol = 0; boxCol < 9; boxCol += 3) {

                for (int i = boxRow; i < boxRow + 3; i++) {
                    for (int j = boxCol; j < boxCol + 3; j++) {
                            if(lines.contains(board[i][j]) && (board[i][j] != '.')){
                                return false;
                            }
                            lines.add(board[i][j]);
                        }
                    }
                    lines.clear();
                }
        }
        return true;
    }
}