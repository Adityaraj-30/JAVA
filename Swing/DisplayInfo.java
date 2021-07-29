/**
 * 13e) Using Swing, write a program to create two buttons labelled ‘A’ and ‘B’. When button 
‘A’ is pressed, it displays your personal information (Name, Course, Roll No, College) and 
when button ‘B’ is pressed, it displays your CGPA in previous semester. 
 */

package Swing;

import javax.swing.*;
import java.awt.event.*;

public class DisplayInfo extends JFrame implements ActionListener {
    JButton b, c;
    JTextField tf, tf1, tf2, tf3, tf4;
    JLabel l1, l2, l3, l4, l5;

    DisplayInfo() {
        setSize(500, 400);
        setLayout(null);

        tf = new JTextField("Aditya Raj");
        tf1 = new JTextField("B.Sc  (Hons.) Computer Science");
        tf2 = new JTextField("5815");
        tf3 = new JTextField("Keshav Mahavidyalaya");
        tf4 = new JTextField("8.64");
        tf.setBounds(180, 100, 220, 20);
        tf1.setBounds(180, 130, 220, 20);
        tf2.setBounds(180, 160, 220, 20);
        tf3.setBounds(180, 190, 220, 20);
        tf4.setBounds(280, 190, 60, 20);
        add(tf);
        add(tf1);
        add(tf2);
        add(tf3);
        add(tf4);
        tf.setVisible(false);
        tf1.setVisible(false);
        tf2.setVisible(false);
        tf3.setVisible(false);
        tf4.setVisible(false);
        tf.setEditable(false);
        tf1.setEditable(false);
        tf2.setEditable(false);
        tf3.setEditable(false);
        tf4.setEditable(false);
        l1 = new JLabel("Name :");
        l2 = new JLabel("Course :");
        l3 = new JLabel("Roll No. :");
        l4 = new JLabel("College :");
        l5 = new JLabel("CGPA in previous semester :");
        l1.setBounds(20, 100, 90, 20);
        l2.setBounds(20, 130, 140, 20);
        l3.setBounds(20, 160, 140, 20);
        l4.setBounds(20, 190, 130, 20);
        l5.setBounds(20, 190, 230, 40);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        l1.setVisible(false);
        l2.setVisible(false);
        l3.setVisible(false);
        l4.setVisible(false);
        l5.setVisible(false);
        b = new JButton("Button : A");
        b.setBounds(20, 60, 150, 30);
        b.addActionListener(this);
        add(b);
        c = new JButton("Button : B");
        c.setBounds(220, 60, 150, 30);
        add(c);
        c.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }

    public static void main(String args[]) {
        new DisplayInfo();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b) {
            tf.setVisible(true);
            tf1.setVisible(true);
            tf2.setVisible(true);
            tf3.setVisible(true);
            tf4.setVisible(false);
            l1.setVisible(true);
            l2.setVisible(true);
            l3.setVisible(true);
            l4.setVisible(true);
            l5.setVisible(false);
        } else if (e.getSource() == c) {
            tf.setVisible(false);
            tf1.setVisible(false);
            tf2.setVisible(false);
            tf3.setVisible(false);
            tf4.setVisible(true);
            l1.setVisible(false);
            l2.setVisible(false);
            l3.setVisible(false);
            l4.setVisible(false);
            l5.setVisible(true);
        }
    }
}
