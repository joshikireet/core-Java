// ItemListener
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ItemListenerExample extends JFrame implements ItemListener 
{
	JCheckBox checkBox;
	JLabel label;

	public ItemListenerExample() {
		setTitle("ItemListener");
		setSize(550, 350);
		setLayout(new FlowLayout());
		checkBox = new JCheckBox("Show Message");
		label = new JLabel("Checkbox is unchecked");
		checkBox.addItemListener(this); // component is registered


		add(checkBox);
		add(label);
		setVisible(true);
	}


	public void itemStateChanged(ItemEvent e) {
		if(e.getSource()==checkBox)
		{
			if (checkBox.isSelected()) {
				JOptionPane.showMessageDialog(this,"Checkbox is checked","Information",JOptionPane.INFORMATION_MESSAGE, new ImageIcon("C:\\Users\\USER\\eclipse-workspace\\SimpleItemListener\\src\\giphy.gif"));
				//label.setText("Checkbox is checked");
			} else {
				label.setText("Checkbox is unchecked");
			}
		}}

	public static void main(String[] args) {
		new ItemListenerExample();
	}
}