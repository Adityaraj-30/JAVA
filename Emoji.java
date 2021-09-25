// import java.awt.*;
// import java.awt.event.*;

// public class Emoji extends Frame{
    
//     public Emoji(){
//         addWindowListener(new WindowAdapter(){
//             public void windowClosing(WindowEvent we) {
//                 System.exit(0);
                
//             }
//         });
//     }

//     public void paint(Graphics g){
        

//         g.setColor(Color.yellow);
//       //  g.drawOval(20, 40, 50, 50);
//         g.fillOval(70, 90, 200, 205);
        
//         g.setColor(Color.black);
//         g.fillOval(100, 145, 30, 40);
//         g.fillOval(200, 145, 30, 40);
//        // g.fillArc(110, 200, 150, 150, 155, -130);
//         g.fillRect(165, 190, 10, 25);
//         g.fillRect(130, 240, 10, 15);
//         g.fillRect(150, 240, 10, 15);
//         g.fillRect(170, 240, 10, 15);
//         g.fillRect(190, 240, 10, 15);
//         g.drawRect(130, 240, 70, 15);
       
//         g.setColor(Color.white);
//         g.fillRect(140, 240, 10, 15);
//         g.fillRect(160, 240, 10, 15);
//         g.fillRect(180, 240, 10, 15);
//         g.fillRect(200, 240, 10, 15);

//         g.setColor(Color.blue);
//         g.fillRect(80, 110, 180, 10);

//         g.fillRect(110, 70, 120, 40);

//     }


//     public static void main(String[] args) {
//         Emoji appwin = new Emoji();

//         appwin.setSize(new Dimension(350,350));
//         appwin.setBackground(Color.cyan);
//         appwin.setTitle("Emoji");
//         appwin.setVisible(true);
//     }
// }


import java.awt.*;
import java.awt.event.*;

public class Emoji extends Frame implements ActionListener
{
    
	int i=0;
	Button b=new Button("Smilie");
	Button b1=new Button("Charlie");
    public Emoji()
    {
        setSize(350,350);
        setLayout(new FlowLayout());
        setBackground(Color.cyan);
        setTitle("Emoji");
        setVisible(true);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we) {
                System.exit(0);
                
            }
        });
        add(b);
        add(b1);
    }
    
    public void setChoice()
    {
    	b.addActionListener(this);
    	b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
    	if(e.getSource()==b)
    	{
    		i=1;
    		repaint();
    	}
    	if(e.getSource()==b1)
    	{
    		i=2;
    		repaint();
    	}
    }
    public void shape2(Graphics g)
    {
        g.setColor(Color.yellow);
        g.fillOval(70, 90, 200, 205);
        
        g.setColor(Color.black);
        g.fillOval(100, 145, 30, 40);
        g.fillOval(200, 145, 30, 40);
        g.fillRect(165, 190, 10, 25);
        g.fillRect(130, 240, 10, 15);
        g.fillRect(150, 240, 10, 15);
        g.fillRect(170, 240, 10, 15);
        g.fillRect(190, 240, 10, 15);
        g.drawRect(130, 240, 70, 15);
       
        g.setColor(Color.white);
        g.fillRect(140, 240, 10, 15);
        g.fillRect(160, 240, 10, 15);
        g.fillRect(180, 240, 10, 15);
        g.fillRect(200, 240, 10, 15);

        g.setColor(Color.blue);
        g.fillRect(80, 110, 180, 10);

        g.fillRect(110, 70, 120, 40);
    }

    public void shape1(Graphics g)
    {
    	Insets insets=getInsets();
		g.setColor(Color.yellow);
		g.fillOval(insets.left+20,50+insets.top,230, 230);
		g.setColor(Color.black);
		g.fillOval(insets.left+75,insets.top+100 ,30, 30);
		g.fillOval(insets.right+168,insets.top+100 ,30, 30);
		g.drawArc(insets.left+60, insets.bottom+120, 150, 150, -155, 130);
    }
    
    public void paint(Graphics g){
    	Insets insets=getInsets();
        if(i==1)
        {
        	g.clearRect(insets.left, insets.top, 350,350);        	
        	shape1(g);
        }
        if(i==2)
        {
        	g.clearRect(insets.left, insets.top, 350,350);        	
        	shape2(g);
        }
    }
    


    public static void main(String[] args) {
        Emoji appwin = new Emoji();
        appwin.setChoice();
    }
}