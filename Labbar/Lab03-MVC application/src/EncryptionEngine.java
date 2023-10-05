//EncryptionEngine
public class EncryptionEngine {

    private int encryptionKey;
    private Controller controller;

    public EncryptionEngine(Controller controller) {
        this.controller = controller;
    }

    protected void setEncryptionKey(int encryptionKey) {
        this.encryptionKey = encryptionKey;
    }

    private int getEncryptionKey() {
        return encryptionKey;
    }

    protected String encrypt(String input) {
        char[] inCharArr = input.toCharArray();

        for (int i = 0; i < inCharArr.length; i++) {
            inCharArr[i] = encryptChar(inCharArr[i]);
        }

        return new String(inCharArr);
    }

    protected String decrypt(String input) {
        char[] inCharArr = input.toCharArray();

        for (int i = 0; i < inCharArr.length; i++) {
            inCharArr[i] = decryptChar(inCharArr[i]);
        }

        return new String(inCharArr);
    }

    private char encryptChar(char c) {
        int shiftedChar = c + encryptionKey - 'A';
        shiftedChar = (shiftedChar % 26 + 26) % 26; // range [0, 25]
        return (char) (shiftedChar + 'A');
    }

    private char decryptChar(char c) {
        int shiftedChar = c - encryptionKey - 'A';
        shiftedChar = (shiftedChar % 26 + 26) % 26; // range [0, 25]
        return (char) (shiftedChar + 'A');
    }
}
