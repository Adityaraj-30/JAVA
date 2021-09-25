/**
 * Question 10: Using AWT, write a program to create two buttons named “Red” and “Blue”.
 *  When a button is pressed the background color should
 *  be set to the color named by the button’s label.
 */

package AWT;

import java.awt.*;
import java.awt.event.*;

public class ChangeColor extends Frame implements ActionListener {

	Button b = new Button("Red");
	Button b1 = new Button("Blue");
	Label l = new Label();

	ChangeColor() {
		setSize(300, 300); // for frame size
		setLayout(new FlowLayout()); // setting layout to flow layout
		setTitle("Color");

		addWindowListener(new MyWindowListener());
		add(b); // adding button to frame
		add(b1); // adding button to frame
		add(l); // adding label to frame
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
			l.setText("This is red color");
			l.setBackground(Color.red);

			setBackground(Color.red);
		}
		if (e.getSource() == b1) {
			b.setForeground(Color.black);
			b1.setForeground(Color.blue);
			l.setText("This is blue color");
			l.setBackground(Color.blue);

			setBackground(Color.blue);
		}

	}

	public static void main(String[] args) {
		// TO DO Auto-generated method stub
		ChangeColor ob = new ChangeColor();
		ob.setColor();
	}

}

class MyWindowListener extends WindowAdapter {
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
}