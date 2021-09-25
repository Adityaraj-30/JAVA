import java.awt.*;
import java.awt.event.*;
public class MouseLis {
    public static void main(String[] args) {
        new MyClickListener();     
    //    MouseLis ob=new MouseLis();
		//ob.repaint();   
    }

    
}

class MyClickListener extends Frame implements MouseListener {
    int width = 0;
    int height = 0;
    Dimension d;
    MyClickListener() 
    {
        setSize(150,150);
        setVisible(true);
        addMouseListener(this);
        addWindowListener(new MyWindowListenenr());
        height = getHeight();
        width = getWidth();
    }
    // public void mouseDragged(MouseEvent e) {          
    // }  
    // public void mouseMoved(MouseEvent e) {

    // }

    public void mouseClicked(MouseEvent event) {
        if (height == 250)
        {
            height = 150;
            width = 150;
        }
        else{
             height += 10;
             width += 10;
        }
        setSize(height,width);
    }
    public void mousePressed(MouseEvent e) {
        
     }
 
     public void mouseReleased(MouseEvent e) {
       System.out.println("Released!!");
     }
 
     public void mouseEntered(MouseEvent e) {
        
     }
 
     public void mouseExited(MouseEvent e) {
        
     }

     public void paint(Graphics g){
        Insets i = getInsets();
        d=getSize();
    
    
        g.setColor(Color.white);
        g.drawLine(i.left,i.top,d.width-i.right,d.height-i.bottom);
        g.setColor(Color.white);
        g.drawLine(width-i.right,i.top,i.left,height-i.bottom);
          
     }
}

class MyWindowListenenr extends WindowAdapter {

    public void windowClosing(WindowEvent event) {
        System.exit(0);
    }

}