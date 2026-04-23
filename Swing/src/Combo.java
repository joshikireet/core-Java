/**
 * @author Kireet
 * ComboBox
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Combo extends JFrame implements ActionListener
{
    JComboBox<String> cb;
    JButton b;

    Combo()
    {
        setLayout(new FlowLayout(FlowLayout.CENTER,150,10));

        String s[] = {"Simik", "Rohan", "Vrinda"};
        cb = new JComboBox<>(s);
        b = new JButton("Show");

        add(cb);
        add(b);

        b.addActionListener(this);

        setSize(200,200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e)
    {
        JOptionPane.showMessageDialog(this, cb.getSelectedItem());
    }

    public static void main(String args[])
    {
        new Combo();
    }
}