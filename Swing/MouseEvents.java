/**
 * Question 13)a: Write a program to create a frame using AWT Swing. Implement mouseClicked(), 				mouseEntered() and mouseExited() events such that:
		 a) Size of the frame should be tripled when mouse enters it. 
		b) Frame should reduce to its original size when mouse is clicked in it. 
		c) Close the frame when mouse exits it.
 */

package Swing;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class MouseEvents extends JFrame {
	int w, h; // Variables for width and height of frame

	MouseEvents(int w, int h) {
		this.w = w;
		this.h = h;
		setSize(w, h);
		setTitle("Mouse Event");
		setLayout(null);
		addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				setSize(w, h);
			}

			public void mouseEntered(MouseEvent e) {
				setSize(3 * getWidth(), 3 * getHeight());
			}

			public void mouseExited(MouseEvent e) {
				System.exit(0);
			}
		});
		setVisible(true);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the width of the Frame");
		int w = scanner.nextInt();
		System.out.println("Enter the height of the Frame");
		int h = scanner.nextInt();
		new MouseEvents(w, h);
		scanner.close();
	}

}
