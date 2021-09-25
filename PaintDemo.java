
import javax.swing.*;
import java.awt.*;
import java.util.Random;

class PaintPanel extends JPanel {

    Insets ins;
    Random rand;

    PaintPanel(){
        setBorder(BorderFactory.createLineBorder(Color.RED, 5));

        rand = new Random();
    }

    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        int x=40, y=40, x2, y2;
        int height = getHeight();
        int width = getWidth();
        ins = getInsets();

        //For drawing 10 lines, 10 is used in Loop Condition
        for(int i= 0; i<10; i++)
        {
            
            x = rand.nextInt(width - ins.left);
            y = rand.nextInt(height - ins.bottom);
            x2 = rand.nextInt(width - ins.left);
            y2 = rand.nextInt(height - ins.bottom);

            g.drawLine(x,y, x2, y2);
        }
    }

}


public class PaintDemo {
    PaintPanel pp;

    PaintDemo(){
        JFrame jFrm = new JFrame("Paint Demo");
        jFrm.setSize(400,500);
        jFrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pp= new PaintPanel();
        jFrm.add(pp);

        jFrm.setVisible(true);
    }

    public static void main(String[] args) {
        new PaintDemo();
    }

}


// import javax.swing.*;

// import java.awt.*;

// import java.util.Random;

// class PaintPanel extends JPanel {
//     Insets insets;
//     Random random;
//     //Construct a Panel
//     PaintPanel(){
//         //Put a border around the panel
//         setBorder(BorderFactory.createLineBorder(Color.ORANGE,5));
//         random = new Random();
//     }
//     //Override the paintComponent() method.
//     protected void paintComponent(Graphics g){
//         //Always call the superclass method first
//         super.paintComponent(g);
//         int x, y, x2, y2;
//         //Get the height and width of the component
//         int height = getHeight();
//         int width = getWidth();

//         //Draw ten lines whose endpoints are random
//         for (int i=0; i<10; i++){
//             //Obtain random coordinates that defines the end point of each line
//             x = random.nextInt(width-insets.left);
//             y = random.nextInt(height-insets.bottom);
//             x2 = random.nextInt(width-insets.left);
//             y2 = random.nextInt(height-insets.bottom);

//             //Draw the line.
//             g.drawLine(x, y, x2, y2);
//         }
//     }
// }

// //Demonstrate painting directly onto a panel.
// class  PaintDemo{
//     JLabel jLabel;
//     PaintPanel paintPanel;

//     PaintDemo(){
//         //Create a new jFrame container.
//         JFrame jFrame = new JFrame("Paint Demo");
//         //Give the Frame an initial size.
//         jFrame.setSize(200,150);
//         //Terminate the program when the user close the application.
//         jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         //Create the panel that will be painted.
//         paintPanel = new PaintPanel();

//         jFrame.add(paintPanel);
//         //Display the frame
//         jFrame.setVisible(true);
//     }

//     public static void main(String[] args) {
//         new PaintDemo();
//         //Create the frame on the event dispatching thread.
//         // SwingUtilities.invokeLater(new Runnable() {
//         //     @Override
//         //     public void run() {
//         // //         new PaintDemo();
//         //     }
//         // });
//     }
// }

// /*
// package in.coding;

// import javax.swing.*;

// import java.awt.*;

// import java.util.Random;

// class PaintPanel extends JPanel {
//     Insets insets;
//     Random random;
//     //Construct a Panel
//     PaintPanel(){
//         //Put a border around the panel
//         setBorder(BorderFactory.createLineBorder(Color.ORANGE,5));
//         random = new Random();
//     }
//     //Override the paintComponent() method.
//     protected void paintComponent(Graphics g){
//         //Always call the superclass method first
//         super.paintComponent(g);
//         int x, y, x2, y2;
//         //Get the height and width of the component
//         int height = getHeight();
//         int width = getWidth();

//         //Draw ten lines whose endpoints are random
//         for (int i=0; i<10; i++){
//             //Obtain random coordinates that defines the end point of each line
//             x = random.nextInt(width-insets.left);
//             y = random.nextInt(height-insets.bottom);
//             x2 = random.nextInt(width-insets.left);
//             y2 = random.nextInt(height-insets.bottom);

//             //Draw the line.
//             g.drawLine(x, y, x2, y2);
//         }
//     }
// }

// //Demonstrate painting directly onto a panel.
// public class  PaintDemo{
//     JLabel jLabel;
//     in.coding.PaintPanel paintPanel;

//     PaintDemo(){
//         //Create a new jFrame container.
//         JFrame jFrame = new JFrame("Paint Demo");
//         //Give the Frame an initial size.
//         jFrame.setSize(200,150);
//         //Terminate the program when the user close the application.
//         jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         //Create the panel that will be painted.
//         paintPanel = new in.coding.PaintPanel();

//         jFrame.add(paintPanel);
//         //Display the frame
//         jFrame.setVisible(true);
//     }

//     public static void main(String[] args) {
//         //Create the frame on the event dispatching thread.
//         SwingUtilities.invokeLater(new Runnable() {
//             @Override
//             public void run() {
//                 new in.coding.PaintDemo();
//             }
//         });
//     }
// }



// */ 