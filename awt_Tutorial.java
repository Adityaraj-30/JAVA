import java.awt.*;
import java.awt.event.*;


import java.awt.event.WindowEvent;

public class awt_Tutorial extends Frame{
    public awt_Tutorial(){
       addWindowListener(new WindowAdapter(){
           public void windowClosing(WindowEvent we){
               System.exit(0);
           }
       });

    Button button = new Button("Click me");
    button.setBounds(20,40,80,20);
    add(button);
    setLayout(null);

    TextField textField =new TextField("Hello Friends");
    textField.setBounds(20, 120, 150, 30);
    add(textField);

    Label label=new Label("Hello Friends!");
    label.setBounds(20, 180, 150, 30);
    label.setBackground(Color.cyan);
    add(label);

    button.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            label.setText("Kaise ho??");
        }
    });
    

       
    }
    
    


    public static void main(String[] args) {
        awt_Tutorial appwin=new awt_Tutorial();

        appwin.setSize(new Dimension(500,500));
        appwin.setTitle("First GUI");
        appwin.setVisible(true);
    }
  
}
