import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class UserForm extends JFrame implements ActionListener, ItemListener
{
    JLabel l1, l2, l3;
    JTextField tf1;
    JRadioButton r1, r2;
    JCheckBox c1, c2, c3;
    JButton b1;
    //ButtonGroup bg;

    String gender = "";
    String hobbies = "";

    UserForm()
    {
        setTitle("User Form");
        setLayout(new FlowLayout(FlowLayout.CENTER,19,18));

  
        l1 = new JLabel("Enter Name:");
        tf1 = new JTextField(15);

  
        l2 = new JLabel("Gender:");
        r1 = new JRadioButton("Male");
        r2 = new JRadioButton("Female");

       // bg = new ButtonGroup();
        add(r1);
        add(r2);
        r1.addItemListener(this);
        r2.addItemListener(this);

        l3 = new JLabel("Hobbies:");
        c1 = new JCheckBox("Reading");
        c2 = new JCheckBox("Sports");
        c3 = new JCheckBox("Music");
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);

        b1 = new JButton("Submit");
        b1.addActionListener(this);
        add(l1); add(tf1);
        add(l2); add(r1); add(r2);
        add(l3); add(c1); add(c2); add(c3);
        add(b1);

        setSize(300,250);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

  
    public void itemStateChanged(ItemEvent e)
    {
     
        if(r1.isSelected())
            gender = "Male";
        if(r2.isSelected())
            gender = "Female";
        hobbies = "";
        if(c1.isSelected())
            hobbies += "Reading ";
        if(c2.isSelected())
            hobbies += "Sports ";
        if(c3.isSelected())
            hobbies += "Music ";
    }


    public void actionPerformed(ActionEvent e)
    {
        String name = tf1.getText();
// use JTextArea for Displaying the info ----> assignment
       
        JOptionPane.showMessageDialog(this,
            "Name: " + name +
            "\nGender: " + gender +
            "\nHobbies: " + hobbies);
    }

    public static void main(String args[])
    {
        new UserForm();
    }
}