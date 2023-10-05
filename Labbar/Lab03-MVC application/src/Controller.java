//Controller
// This is a dummy Controller, so the View compiles
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
		if(isNumeric(encryptionKey)) {
			
			
			encryptionEngine.setEncryptionKey(Integer.parseInt(encryptionKey));
			
			String encryptedString = encryptionEngine.encrypt(input);
			
			this.view.setOutputText(encryptedString);
		}
		else {
			this.view.setOutputText("Error 404");
		}
		
		
	}
	
	public void decryptBtnClicked() {
        String input = view.getInputText();
        String encryptionKey = view.getEncryptionKey();
        if(isNumeric(encryptionKey)) {
        	
		
        	encryptionEngine.setEncryptionKey(Integer.parseInt(encryptionKey));
		
        	String decryptedString = encryptionEngine.decrypt(input);
		
        	this.view.setOutputText(decryptedString);
    	}
		else {
			this.view.setOutputText("Error 404");
		}
	}
	public static boolean isNumeric(String str) {
		try {
			int v = Integer.parseInt(str);
			System.out.println(str);
			return true;
		}
		
		catch(NumberFormatException e) {
			System.out.println(str);
			return false;
		}
	}
}

