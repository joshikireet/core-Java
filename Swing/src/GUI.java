// demonstration of swing components
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Swing1 extends JFrame implements ActionListener
{
	JLabel l1= new JLabel("First no");
	JTextField tf1 = new JTextField(10); 
	JLabel l2= new JLabel("Second no");
	JTextField tf2 = new JTextField(10);
	JLabel l3= new JLabel("Result");
	JTextField tf3 = new JTextField(10);
	JButton b1 = new JButton("Add");
	JButton b2 = new JButton("Sub");
	Swing1()
	{
		add(l1);
		add(tf1);
		add(l2);
		add(tf2);
		add(l3);
		add(tf3);
		add(b1);
		add(b2);
		setLayout(new GridLayout(4,2));
		setSize(500,300);
		setVisible(true);
		setResizable(false);
		//pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	   b1.addActionListener(this);
	   b2.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	
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
	tf3.setEditable(false);	
	}
}
public class GUI {
public static void main(String[] args) {
	Swing1 ob = new Swing1();
}
}
