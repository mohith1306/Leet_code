import java.util.*;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            Set<Character> rowSet = new HashSet<>();
            Set<Character> colSet = new HashSet<>();

            for (int j = 0; j < 9; j++) {
                
                if (board[i][j] != '.') {
                    if (rowSet.contains(board[i][j])) return false;
                    rowSet.add(board[i][j]);
                }

                if (board[j][i] != '.') {
                    if (colSet.contains(board[j][i])) return false;
                    colSet.add(board[j][i]);
                }
            }
        }

        for (int row = 0; row < 9; row += 3) {
            for (int col = 0; col < 9; col += 3) {
                Set<Character> boxSet = new HashSet<>();
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        char current = board[row + i][col + j];
                        if (current != '.') {
                            if (boxSet.contains(current)) return false;
                            boxSet.add(current);
                        }
                    }
                }
            }
        }

        return true;
    }
}
