//View
import java.awt.event.*;

import javax.swing.*;

public class View extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Controller controller;
	
    private JPanel mainPanel;
    private JPanel textPanel;
    private JPanel buttonPanel;
    private JPanel labelPanel;
    private JPanel textFieldPanel;
    private JLabel encryptionKeyLabel;
    private JLabel inputTextLabel;
    private JLabel outputTextLabel;
    private JTextField encryptionKeyTextField;
    private JTextField inputTextTextField;
    private JTextField outputTextTextField;
	private JButton encryptButton;
	private JButton decryptButton;
    

    public void setOutputText(String outputText) {
    	outputTextTextField.setText(outputText);
    }
    
    public String getInputText() {
    	return inputTextTextField.getText();
    }
    
    public String getEncryptionKey() {
        // get the encryption key from the corresponding text field and return it
    	return encryptionKeyTextField.getText();
    }
    
    public View(Controller _controller){
    	
    	this.controller = _controller;

        mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        textPanel = new JPanel();
        textPanel.setLayout(new BoxLayout(textPanel, BoxLayout.X_AXIS));
        labelPanel = new JPanel();
        labelPanel.setLayout(new BoxLayout(labelPanel, BoxLayout.Y_AXIS));
        textFieldPanel = new JPanel();
        textFieldPanel.setLayout(new BoxLayout(textFieldPanel, BoxLayout.Y_AXIS));
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));
        
        textPanel.add(labelPanel);
        textPanel.add(textFieldPanel);
        mainPanel.add(textPanel);
        mainPanel.add(buttonPanel);
        
        encryptionKeyLabel = new JLabel("encryption key", SwingConstants.LEFT);
        inputTextLabel = new JLabel("input text", SwingConstants.LEFT);
        outputTextLabel = new JLabel("output text", SwingConstants.LEFT);
        labelPanel.add(encryptionKeyLabel);
        labelPanel.add(inputTextLabel);
        labelPanel.add(outputTextLabel);
        
        encryptionKeyTextField = new JTextField();
        inputTextTextField = new JTextField();
        inputTextTextField.setColumns(18);
        outputTextTextField = new JTextField();
        
        textFieldPanel.add(encryptionKeyTextField);
        textFieldPanel.add(inputTextTextField);
        textFieldPanel.add(outputTextTextField);
        
        encryptButton = new JButton("encrypt");
		encryptButton.addActionListener(new ActionListener() {
			@Override
        	public void actionPerformed(ActionEvent e) {
				// call corresponding controller method
				controller.encryptBtnClicked();
			}
		});
        decryptButton = new JButton("decrypt");
		decryptButton.addActionListener(new ActionListener() {
			@Override
        	public void actionPerformed(ActionEvent e) {
				// call corresponding controller method
				controller.decryptBtnClicked();
			}
		});
        
        buttonPanel.add(encryptButton);
        buttonPanel.add(decryptButton);
        
        this.getContentPane().add(mainPanel);
    	
    	pack();
        setVisible(true);
        setTitle("I am GUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}