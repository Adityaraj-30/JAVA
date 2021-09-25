/**
 * Question 13)b: Using AWT Swing, write a program to display a string in frame
 *  window with pink color as background.
 */

package Swing;

import javax.swing.*;
import java.awt.*;

public class DisplayString extends JFrame {

	DisplayString() {

		JPanel jPanel = new JPanel();
		setSize(300, 300);
		jPanel.setLayout(new FlowLayout());
		jPanel.setBackground(Color.pink);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		jPanel.add(new JLabel("It's a new Day!!"));
		add(jPanel);
		setVisible(true);
	}

	public static void main(String[] args) {

		new DisplayString();
	}

}
