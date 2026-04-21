import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class AddApp extends JFrame implements ActionListener
{
	JLabel l1= new JLabel("First no");
	JTextField tf1= new JTextField(10);
	JLabel l2= new JLabel("Second no");
	JTextField tf2= new JTextField(10);
	JLabel l3= new JLabel("Result");
	JTextArea tf3= new JTextArea();
	JButton b1 = new JButton("ADD");
	JButton b2 = new JButton("SUB");
	AddApp()
	{
		
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
	b1.addActionListener(this);
	b2.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		int a=Integer.parseInt(tf1.getText());
		int x=Integer.parseInt(tf2.getText());
	
		if(e.getSource()==b1)
		{	
			tf3.setText(String.valueOf(a+x));
		}
		if(e.getSource()==b2)
		{
	
			tf3.setText(String.valueOf(a-x));
		}
		
		tf3.setEditable(false);
		
	}
}
public class Swi {
public static void main(String[] args) {
AddApp ap= new AddApp();
}	

}
