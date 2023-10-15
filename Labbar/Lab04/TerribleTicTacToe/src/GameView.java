import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

// Main GameView class which is responsible for the UI layout and interactions
public class GameView extends JFrame {
	private static final int ROWS = 3; 
	private static final int COLS = 3;
    private static final long serialVersionUID = 2338510144441592703L;
	
    private final GameButton[][] buttons = new GameButton[ROWS][COLS];
    private final JLabel playerTurnLabel;
    // Constructor to initialize
    public GameView() {
        // Setting up the layout and panels
        setLayout(new BorderLayout());
        JPanel buttonPanel = new JPanel(new GridLayout(3, 3)); //if you change board view oyu owuld also change layout. 
        initializeButtons(buttonPanel);
        add(buttonPanel, BorderLayout.CENTER);

        // Initializing and adding label
        playerTurnLabel = new JLabel("Player 1's Turn", SwingConstants.CENTER);
        add(playerTurnLabel, BorderLayout.SOUTH);
        
       
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setTitle("Tic Tac Toe");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    // Updating UI components
    public void setPlayerTurnLabel(int player) {
        playerTurnLabel.setText("Player " + player + "'s Turn");
    }
    
    private void initializeButtons(JPanel panel) {
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                GameButton button = new GameButton(row, col);
                button.setPreferredSize(new Dimension(100, 100));
                buttons[row][col] = button;
                panel.add(button);
            }
        }
    }
    
    public void setButtonListener(ActionListener listener) {
        for (GameButton[] row : buttons)
            for (GameButton button : row)
                button.addActionListener(listener);
    }
    
    public void updateButton(int row, int col, int player) {
        buttons[row][col].setText(player == 1 ? "X" : "O");
        buttons[row][col].setEnabled(false);
    }
    
    public void showWinner(int player) {
        JOptionPane.showMessageDialog(this, "Player " + player + " wins!");
    }

    public void showDraw() {
        JOptionPane.showMessageDialog(this, "It's a draw!");
    }
}

// GameButton class representing each button in the grid
class GameButton extends JButton {
    
    private static final long serialVersionUID = 1L;
	private final int row;
    private final int col;

    public GameButton(int row, int col) {
        this.row = row;
        this.col = col;
        this.setFocusable(false);
        
        // Font sizes
        Font currentFont = getFont();
        Font bigFont = new Font(currentFont.getName(), currentFont.getStyle(), 60);
        this.setFont(bigFont);
    }
   
    
    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }
}
