// USING LAMBDA
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class AddApp1 extends JFrame
{
    
	JLabel l1= new JLabel("First no");
	JTextField tf1= new JTextField(10);
	JLabel l2= new JLabel("Second no");
	JTextField tf2= new JTextField(10);
	JLabel l3= new JLabel("Result");
	JTextArea tf3= new JTextArea();
	JButton b1 = new JButton("ADD");
	JButton b2 = new JButton("SUB");
	AddApp1()
	{
		setTitle("Calculator");
		add(l1);
		add(tf1);
		add(l2);
		add(tf2);
		add(l3);
		add(tf3);
		add(b1);
		add(b2);
		setSize(300,200);
		setLayout(new GridLayout(4,2));
		setResizable(false);
		//pack();
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		b1.addActionListener(e->{
			int a=Integer.parseInt(tf1.getText());
			int x=Integer.parseInt(tf2.getText());
			tf3.setText(String.valueOf(a+x));});

		b2.addActionListener(e->{int a=Integer.parseInt(tf1.getText());
		int x=Integer.parseInt(tf2.getText());
		tf3.setText(String.valueOf(a-x));});

		tf3.setEditable(false);

	}
}
public class GUI1 
{
	public static void main(String[] args) 
	{
		AddApp1 ap= new AddApp1();
	}	

}
