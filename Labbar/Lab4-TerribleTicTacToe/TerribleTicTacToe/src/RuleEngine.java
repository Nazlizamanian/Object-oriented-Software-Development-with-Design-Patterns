// RuleEngine class containing logic to determine the winner of the game
public class RuleEngine {

    // Method to check if the last move resulted in a win
    public static boolean checkWinner(int[][] board, int player, int lastRow, int lastCol) {

        // Check Row
        if(isLineWin(board, player, lastRow, true)) return true;

        // Check Column
        if(isLineWin(board, player, lastCol, false)) return true;

        // Check Left Diagonal
        if (lastRow == lastCol && isDiagonalWin(board, player, true)) return true;

        // Check Right Diagonal
        int lastIndex = board.length - 1;
        if (lastRow + lastCol == lastIndex && isDiagonalWin(board, player, false)) return true;
        
        return false; // No winning condition met
    }

    // Method to check if any row or column is winning
    private static boolean isLineWin(int[][] board, int player, int line, boolean checkRow) {
        for (int i = 0; i < board.length; i++) {
            int value = checkRow ? board[line][i] : board[i][line];
            if (value != player) return false;
        }
        return true;
    }

    // Method to check if any diagonal is winning
    private static boolean isDiagonalWin(int[][] board, int player, boolean isLeftDiagonal) {
        int lastIndex = board.length - 1;
        for (int i = 0; i < board.length; i++) {
            int value = isLeftDiagonal ? board[i][i] : board[i][lastIndex - i];
            if (value != player) return false;
        }
        return true;
    }
}
