import java.awt.*;
import java.awt.event.*;
public class SimpleKey extends Frame implements KeyListener 
{
	String msg="";
	String keyState="";
	public SimpleKey()
	{
		addKeyListener(this);
		addWindowListener(new MyWindowAdapteer());
	}
	public void keyPressed(KeyEvent Ke)
	{
		keyState="Key Down";
        int key=Ke.getKeyCode();
        switch(key){
            case KeyEvent.VK_F1:
            msg+=Ke.getKeyChar();
            break;
        }
		repaint();
	}
	public void keyReleased(KeyEvent Ke)
	{
		keyState="Key Up";
		repaint();
	}
	public void keyTyped(KeyEvent Ke)
	{
		msg+=Ke.getKeyChar();
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(msg, 20, 100);
		g.drawString(keyState, 20, 50);
	}
	public static void main(String[] args) {
		// TO DO Auto generated method stub
		SimpleKey appwin=new SimpleKey();
		appwin.setSize(new Dimension(200,150));
		appwin.setTitle("SimpleKey");
		appwin.setVisible(true);
	}

}
class MyWindowAdapteer extends WindowAdapter
{
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
}