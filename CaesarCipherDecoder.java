import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 



public class CaesarCipherDecoder {
	
	
	public static String decode(String cipher, int shift) {
		
		/*Accepts cipher (String) to be decoded, shift (int) that represents the number of places up or 
		down the alphabet each character of the string is to be shifted, and returns decodedCipher (String) with 
		the decoded cipher. If a character is not in ALPHABET ("abcdefghijklmnopqrstuvwxyz"), the character is kept 
		in the the decoded cipher as is, eg "ab c%4" with a shift of -1 is decoded "bc d%4".*/
		
		final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
		cipher = cipher.toLowerCase();
		String decodedCipher = "";
		for (int i = 0; i < cipher.length(); i++) {
			char character = cipher.charAt(i);
			if (ALPHABET.contains(Character.toString(character))) {
				int characterPosition = ALPHABET.indexOf(cipher.charAt(i));
				int substitutePosition = (characterPosition - shift) % 26;
				if (substitutePosition < 0) {
					substitutePosition = ALPHABET.length() + substitutePosition;
				}
				char substituteCharacter = ALPHABET.charAt(substitutePosition);
				decodedCipher += substituteCharacter;
			} else {
				decodedCipher += character;
			}
		}
		return decodedCipher;
	}

	
	
	public static void main(String[] args) {
		
		/*Launches a window (JFrame) for the user to decode Caesar ciphers. The user is instructed (JLabel) 
		to enter the cipher (String) into a text area (JTextArea), select the desired shift from a drop down menu 
		(JComboBox), and press a button (JButton) for the decoded cipher (String) to be presented to the user (JLabel).*/
		
		Color bgColour = Color.ORANGE; 
		
		JFrame frame = new JFrame("Caesar Cipher Decoder");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600,200);
		frame.getContentPane().setBackground(bgColour);		
		
		JPanel inputPanel = new JPanel();
		inputPanel.setBackground(bgColour);   
		inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.PAGE_AXIS)); 
		JLabel inputInstructionLbl = new JLabel("Enter cipher:"); 
		inputInstructionLbl.setPreferredSize(new Dimension(20, 40));
		JTextArea cipherTextArea = new JTextArea("", 5, 15);
		inputPanel.add(inputInstructionLbl); 
		inputPanel.add(cipherTextArea);

		JPanel controlsPanel = new JPanel();
		controlsPanel.setBackground(bgColour);
		Integer[] shiftOptions = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};  
		JComboBox<Integer> shiftComboBox = new JComboBox<>(shiftOptions);
		shiftComboBox.setSelectedIndex(5);
		shiftComboBox.setBounds(80, 50, 140, 20);
		JButton decodeButton = new JButton("decode");
		controlsPanel.add(shiftComboBox);
		controlsPanel.add(decodeButton);
		
		JPanel decodedCipherPanel = new JPanel();         
		decodedCipherPanel.setBackground(Color.WHITE);
		JLabel decodedCipherLbl = new JLabel(""); 
		decodedCipherLbl.setPreferredSize(new Dimension(150, 70));
		decodedCipherPanel.add(decodedCipherLbl);
		
		JPanel outputPanel = new JPanel();
		outputPanel.setBackground(bgColour);
		outputPanel.setLayout(new BoxLayout(outputPanel, BoxLayout.PAGE_AXIS)); 
		JLabel outputInstructionLbl = new JLabel("Decoded cipher");
		outputInstructionLbl.setPreferredSize(new Dimension(20, 40));
		outputPanel.add(outputInstructionLbl);
		outputPanel.add(decodedCipherPanel);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setBackground(bgColour);
		mainPanel.add(inputPanel); 
		mainPanel.add(controlsPanel);
		mainPanel.add(outputPanel);
		 
		decodeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cipherUserInput = cipherTextArea.getText(); 
				Integer shiftUserInput = shiftComboBox.getItemAt(shiftComboBox.getSelectedIndex());
				String decodedCipherOutput = decode(cipherUserInput, shiftUserInput);
				decodedCipherLbl.setText(decodedCipherOutput);
			}
		});				
		
		frame.getContentPane().add(BorderLayout.SOUTH, mainPanel);
		frame.setVisible(true);
	}
}
