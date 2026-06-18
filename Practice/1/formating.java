class Solution {
    /*
     * Approach :-
     * 
     * 1. Traverse the board to find an
     * empty cell ('.').
     * 
     * 2. For the first empty cell found,
     * try placing digits from '1' to '9'.
     * 
     * 3. Before placing a digit, check
     * whether it satisfies Sudoku rules:
     * - Not present in the same row.
     * - Not present in the same column.
     * - Not present in the same 3 × 3 box.
     * 
     * 4. If the digit is valid:
     * - Place the digit.
     * - Recursively solve the remaining board.
     * 
     * 5. If recursion returns true:
     * - The puzzle is solved.
     * - Return true.
     * 
     * 6. Otherwise:
     * - Remove the digit.
     * - Try the next digit.
     * (Backtracking)
     * 
     * 7. If no digit can be placed in the
     * current empty cell:
     * - Return false.
     * 
     * 8. If the entire board is traversed
     * without finding an empty cell:
     * - The puzzle is completely solved.
     * - Return true.
     * 
     * Time Complexity: O(9^(N²))
     * Space Complexity: O(N²)
     */
    public void solveSudoku(char[][] board) {
        solve(board);
    }

    private boolean solve(char[][] board) {
        int n = 9;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == '.') {
                    for (char digit = '1'; digit <= '9'; digit++) {
                        if (areRulesMet(board, i, j, digit)) {
                            board[i][j] = digit;
                            if (solve(board)) {
                                return true;
                            } else {
                                board[i][j] = '.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private boolean areRulesMet(char[][] board, int row, int col, char digit) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == digit || board[i][col] == digit) {
                return false;
            }
        }
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == digit) {
                    return false;
                }
            }
        }
        return true;
    }
};