/*
 * Question 13)c: Using AWT Swing, write a program to create two buttons buttons named “Red” and “Blue”.
 *  When a button is pressed the background color should
 *  be set to the color named by the button’s label.
*/

package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ChangeColor extends JFrame implements ActionListener {

	JButton b = new JButton("Red"); // Button for Red Color
	JButton b1 = new JButton("Blue"); // Button for Blue Color
	JLabel jLabel = new JLabel(); // Label to display color
	JPanel jPanel;

	ChangeColor() {
		jPanel = new JPanel();
		setSize(300, 300);
		jPanel.setLayout(new FlowLayout());
		setTitle("Color");
		setDefaultCloseOperation(EXIT_ON_CLOSE); // Setting Close Operation
		jPanel.add(b);
		jPanel.add(b1);
		jPanel.add(jLabel);
		add(jPanel);
		setVisible(true);
	}

	public void setColor() {
		b.addActionListener(this);
		b1.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b) {
			b1.setForeground(Color.black);
			b.setForeground(Color.red);
			jLabel.setText("This is Red");
			jPanel.setBackground(Color.red); // Setting background red on red button press
		}
		if (e.getSource() == b1) {
			b.setForeground(Color.black);
			b1.setForeground(Color.blue);
			jLabel.setText("This is Blue");
			jPanel.setBackground(Color.blue);// Setting background blue on blue button press
		}
	}

	public static void main(String[] args) {

		ChangeColor appwin = new ChangeColor();
		appwin.setColor();
	}

}
