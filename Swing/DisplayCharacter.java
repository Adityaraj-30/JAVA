/**
 * Question 13)d: Using AWT,Swing write a program using appropriate adapter class to
 *  display the message (“Typed character is: ”) in the frame window 
 * when user types any key.
 */

package Swing;

import javax.swing.*;
import java.awt.event.*;

public class DisplayCharacter extends JFrame {

	String string = "Typed character is: "; // To store character typed
	JLabel jLabel; // To display character typed

	public DisplayCharacter() {
		jLabel = new JLabel(string); // Initializing Label
		setSize(300, 300); // Setting size of Frame
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent Ke) {
				string += Ke.getKeyChar();
				jLabel.setText(string); // Displaying Character Typed
				string = "Typed character is: ";
			}
		});
		add(jLabel); // Adding Label to Frame
		setVisible(true);
	}

	public static void main(String[] args) {

		new DisplayCharacter();
	}

}
