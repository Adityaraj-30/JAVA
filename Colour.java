import java.awt.*;
import java.awt.event.*;
public class Colour extends Frame{

	Colour()
	{
		setSize(300,300);
		setLayout(new FlowLayout());
		setTitle("Color");
		setVisible(true);
		addWindowListener(new MyWindowAdapter());
	}
	public void setColor()
	{
		Color c=new Color(255,255,255);
		Label l=new Label("This Program is to test Colouring");
		l.setForeground(Color.green);
		add(l);
		setBackground(c);
	}
	public static void main(String[] args) {
		// TO DO Auto-generated method stub
		Colour ob=new Colour();
		ob.setColor();
	}

}
class MyWindowAdapter extends WindowAdapter
{
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
}