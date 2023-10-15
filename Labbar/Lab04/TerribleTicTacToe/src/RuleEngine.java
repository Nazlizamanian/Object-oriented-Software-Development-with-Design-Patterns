// RuleEngine class
public class RuleEngine {

    // Method to check if the last move resulted in a win
    public static boolean checkWinner(int[][] board, int player, int lastRow, int lastCol) {

        // Row
        if (isLineWin(board, player, lastRow, true, 3)) return true;

        // Check Column
        if (isLineWin(board, player, lastCol, false, 3)) return true;

        // Left Diagonal
        if (lastRow == lastCol && isDiagonalWin(board, player, true, 3)) return true;
        
        // Right Diagonal
        int lastIndex = board.length - 1;
        if (lastRow + lastCol == lastIndex && isDiagonalWin(board, player, false, 3)) return true;
        
        return false; // No winning
    }

    // Method that looks on the row or column to see who is winning.
    private static boolean isLineWin(int[][] board, int player, int line, boolean checkRow, int requiredInLine) {
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            int value = checkRow ? board[line][i] : board[i][line];
            if (value == player) {
                count++;
                if (count == requiredInLine) {
                    return true;
                }
            } else {
                count = 0;
            }
        }
        return false;
    }

    // Method that checks diagonal.
    private static boolean isDiagonalWin(int[][] board, int player, boolean isLeftDiagonal, int requiredInLine) {
        int count = 0;
        int lastIndex = board.length - 1;
        for (int i = 0; i < board.length; i++) {
            int value = isLeftDiagonal ? board[i][i] : board[i][lastIndex - i];
            if (value == player) {
                count++;
                if (count == requiredInLine) {
                    return true;
                }
            } else {
                count = 0;
            }
        }
        return false;
    }
}
