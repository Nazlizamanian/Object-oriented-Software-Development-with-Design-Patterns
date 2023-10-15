// Importing necessary libraries
import java.awt.event.ActionEvent;

// Controller class to manage interactions between the Board and the GameView
public class Controller {
    
    // Class variables declaration
    private final Board board;
    private final GameView gameView;
    
    // Constructor to initialize the Controller
    public Controller(Board board, GameView gameView) {
        this.board = board;
        this.gameView = gameView;
        
        // Setting the button listener to handle moves
        gameView.setButtonListener(this::handleMove);
    }

    // Method to handle a move when a button is clicked
    private void handleMove(ActionEvent e) {
        // Getting the button that was clicked
        GameButton button = (GameButton) e.getSource();
        
        // Getting the row and column of the clicked button
        int row = button.getRow();
        int col = button.getCol();
        
        // Proceed if the cell on the board is empty
        if (board.getCordinate(row, col) == 0) {
            // Make the move on the board
            board.move(row, col);
            
            // Update the corresponding button in the view
            gameView.updateButton(row, col, 3 - board.getPlayerTurn());
            
            // Check for a winner or a draw, and update the view accordingly
            if (board.isWin()) 
                gameView.showWinner(3 - board.getPlayerTurn());
            else if (board.isFull()) 
                gameView.showDraw();
            else 
                gameView.setPlayerTurnLabel(board.getPlayerTurn()); // Update the player turn label if the game continues
        }
    }
}
