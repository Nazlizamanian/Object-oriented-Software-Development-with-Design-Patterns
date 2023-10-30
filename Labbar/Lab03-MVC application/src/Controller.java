//Controller
public class Controller {
    private View view;
    private EncryptionEngine encryptionEngine;
    
    public Controller() {
        view = new View(this);
        encryptionEngine = new EncryptionEngine(this);
    }

    public void encryptBtnClicked() {
        String input = view.getInputText();
        String encryptionKey = view.getEncryptionKey();

        if (invalidInput.isNumeric(encryptionKey)) {
            encryptionEngine.setEncryptionKey(Integer.parseInt(encryptionKey));
            String encryptedString = encryptionEngine.encrypt(input);
            this.view.setOutputText(encryptedString);
        } else {
            this.view.setOutputText("Invalid encryption key");
        }
    }

    public void decryptBtnClicked() {
        String input = view.getInputText();
        String encryptionKey = view.getEncryptionKey();

        if (invalidInput.isNumeric(encryptionKey)) {
            encryptionEngine.setEncryptionKey(Integer.parseInt(encryptionKey));
            String decryptedString = encryptionEngine.decrypt(input);
            this.view.setOutputText(decryptedString);
        } else {
            this.view.setOutputText("Invalid encryption key");
        }
    }
}
