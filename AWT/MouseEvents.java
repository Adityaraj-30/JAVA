
/**
 * Question 8: Write a program to create a frame using AWT. Implement mouseClicked(), mouseEntered() and mouseExited() events such that:
		a) Size of the frame should be tripled when mouse enters it. 
		b) Frame should reduce to its original size when mouse is clicked in it. 
		c) Close the frame when mouse exits it.
 */
package AWT;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class MouseEvents extends Frame {
    int w, h;// Variables for width and height of frame

    MouseEvents(int w, int h) {
        this.w = w;
        this.h = h;
        setSize(w, h); // Setting Size of Frame
        setTitle("Mouse Event");
        setLayout(null);

        // adding window listener event to close window when close option clicked

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) // Function for action peformed on mouse click in the frame
            {
                setSize(w, h);
            }

            public void mouseEntered(MouseEvent e)// Function for action performed on mouse entering the frame
            {
                setSize(3 * getWidth(), 3 * getHeight());
            }

            public void mouseExited(MouseEvent e)// Function for action performed on mouse exiting the frame
            {
                System.exit(0);
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width of the Frame");
        int w = sc.nextInt();
        System.out.println("Enter the height of the Frame");
        int h = sc.nextInt();
        new MouseEvents(w, h);
        sc.close();
    }

}