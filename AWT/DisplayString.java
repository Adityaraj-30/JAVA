/**
 * Question 9: Using AWT, write a program to display a string in 
 * frame window with pink color as background.
 */
package AWT;

import java.awt.*;
import java.awt.event.*;

public class DisplayString extends Frame {
    Label label = new Label();

    public DisplayString() {
        setSize(300, 300); // for size of frame
        setLayout(new FlowLayout()); // setting layout to flow layout
        setBackground(Color.pink); // setting background color
        setTitle("Display String");
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        label.setText("It's a new Day!!");
        add(label);
        setVisible(true);
    }

    public static void main(String[] args) {
        new DisplayString();
    }

}
