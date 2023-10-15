//Board class representing the TicTacToe game board
public class Board {
    
    // Constants for the number of rows and columns
    private static final int ROWS = 3;
    private static final int COLS = 3;
    
    // Class variables declaration
    private final int[][] board = new int[ROWS][COLS];
    private boolean win;
    private int playerTurn = 1; // Starting with player 1
   
    // Method to check if the board is full
    public boolean isFull() {
        for (int[] row : board)
            for (int cell : row)
                if (cell == 0) return false; // Found an empty cell, board is not full
        return true; // All cells are filled, board is full
    }

    
    // Getter method to check if there is a winner
    public boolean isWin() {
        return win;
    }
    
    // Method to make a move
    public void move(int row, int col) {
        if (board[row][col] == 0) { // Check if the cell is empty
            board[row][col] = playerTurn; // Mark the cell with the current player's symbol
            
            // Logic to check win conditions
            win = RuleEngine.checkWinner(board, playerTurn, row, col);
            
            // Switch between player 1 and 2 for the next turn
            playerTurn = 3 - playerTurn; 
        }
    }
    
    // Getter method to get the current player's turn
    public int getPlayerTurn() {
        return playerTurn;
    }
    
    // Method to get the value at a particular coordinate on the board
    public int getCordinate(int row, int col) {
        return board[row][col];
    }
}
