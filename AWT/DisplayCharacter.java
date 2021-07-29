/**
 * Question 11: Using AWT, write a program using appropriate adapter class to
 *  display the message (“Typed character is: ”) in the frame window 
 * when user types any key.
 */
package AWT;

import java.awt.*;
import java.awt.event.*;

public class DisplayCharacter extends Frame {

	String msg = "Typed character is:"; // To store character typed
	Label l; // To display character typed

	public DisplayCharacter() {
		l = new Label(msg); // Initializing Label
		setSize(new Dimension(200, 150)); // Setting size of Frame
		setTitle("TypedCharacter");
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent Ke) {
				msg += Ke.getKeyChar();
				l.setText(msg); // Displaying Character Typed
				msg = "Typed character is:";
			}
		});
		add(l); // Adding Label to Frame
		setVisible(true);
	}

	public static void main(String[] args) {

		new DisplayCharacter();
	}

}
