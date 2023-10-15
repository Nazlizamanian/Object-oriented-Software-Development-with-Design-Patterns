// Launcher class containing the main method to start the application
public class Launcher {
    
    public static void main(String[] args) {
        // Creating instances of Board and GameView, and initializing the Controller
        new Controller(new Board(), new GameView());
    }
}
