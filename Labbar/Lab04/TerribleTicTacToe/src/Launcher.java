// Launcher class containing the main method to start the our game.

public class Launcher {
    
    public static void main(String[] args) {
        // Creating new instances of Controller and initializing with Board and GameView.
        new Controller(new Board(), new GameView());
    }
}
