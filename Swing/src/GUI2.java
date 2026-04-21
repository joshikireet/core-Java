// ACTIONLISTENER AND KEYLISTENER


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Swing2 extends JFrame implements ActionListener,KeyListener
{
	JLabel l1= new JLabel("First no");
	JTextField tf1 = new JTextField(10); 
	JLabel l2= new JLabel("Second no");
	JTextField tf2 = new JTextField(10);
	JLabel l3= new JLabel("Result");
	JTextArea tf3 = new JTextArea();
	JButton b1 = new JButton("Add");
	JButton b2 = new JButton("Sub");
	JButton b3 = new JButton("Reset");
	Swing2()
	{
		setTitle("My calculator");
		add(l1);
		add(tf1);
		add(l2);
		add(tf2);
		add(l3);
		add(tf3);
		add(b1);
		add(b2);
		add(b3);
		setLayout(new GridLayout(5,2));
		setSize(500,300);
		setVisible(true);
		setResizable(false);
		//pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	   b1.addActionListener(this);
	   b2.addActionListener(this);
	   b3.addActionListener(this);
	   tf1.addKeyListener(this);
	   tf2.addKeyListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b3)
		{
			tf1.setText(" ");
			tf2.setText(" ");
			tf3.setText(" ");
			return;
		}	
	int x=	Integer.parseInt(tf1.getText());
	int y=	Integer.parseInt(tf2.getText());
if(e.getSource()==b1)
{
	tf3.setText(String.valueOf(x+y));
}
if(e.getSource()==b2)
{
	tf3.setText(String.valueOf(x-y));
}
//if(e.getSource()==b3)
//{
//	tf1.setText(" ");
//	tf2.setText(" ");
//	tf3.setText(" ");
//	return;
//}


tf3.setEditable(false);	
	}
	@Override
	public void keyTyped(KeyEvent e) {
		char ch= e.getKeyChar();
		if(e.getSource()==tf1)
		{
			if(!Character.isDigit(ch))
			{
				b1.setEnabled(false);
				l1.setText("Only numbers are allowed");
				l1.setForeground(Color.red);
			
				e.consume();
			}
			
			else
			{
				//b1.setEnabled(true);
				l1.setText("First no");
				l1.setForeground(Color.black);	
				
				
			}
		}
		
		if(e.getSource()==tf2)
		{
			if(!Character.isDigit(ch))
			{
				b2.setEnabled(false);
				l2.setText("Only numbers are allowed");
				l2.setForeground(Color.red);
				e.consume();
			}
			
			else
			{
			//	b2.setEnabled(true);
				l2.setText("second no");
				l2.setForeground(Color.black);	
				
			}
		}
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void keyReleased(KeyEvent e) {
		 
	    String s1 = tf1.getText().trim();
	    String s2 = tf2.getText().trim();

	    
	    if (s1.equals("") || s2.equals("")) {
	        b1.setEnabled(false);
	        b2.setEnabled(false);
	        return;
	    }

	    
	    b1.setEnabled(true);
	    b2.setEnabled(true);
	}
		    }
		

public class GUI2 {
public static void main(String[] args) {
	Swing2 ob = new Swing2();
}
}
