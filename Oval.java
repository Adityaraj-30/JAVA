import java.awt.*;
import java.awt.event.*;



public class Oval extends Frame{
    
    public Oval(){
        addWindowListener( new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g){

        Insets insets=getInsets();
        Dimension d = getSize();
        g.setColor(Color.yellow);
        g.fillOval(insets.left, insets.top, d.width-(insets.right+insets.left),d.height-(insets.bottom+insets.top));
    }

    public static void main(String[] args) {
        Oval appwin = new Oval();
        appwin.setSize(new Dimension(350,350));
        appwin.setBackground(Color.cyan);
        appwin.setTitle("Oval");
        appwin.setVisible(true);
    }
}
