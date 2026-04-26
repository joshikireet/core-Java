/** use of Jtable in Database
 * @author Kireet Joshi
 */
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class GridLayout1 extends JFrame implements ActionListener {

    JTextField tname, tcode, tdesig, tsalary;
    JButton save, reset, exit;

    JTable table;
    DefaultTableModel model;

    GridLayout1() {

        setLayout(new BorderLayout());

        JPanel p1 = new JPanel(new GridLayout(4,2));
        JPanel p2 = new JPanel();

        tname = new JTextField();
        tcode = new JTextField();
        tdesig = new JTextField();
        tsalary = new JTextField();

        p1.add(new JLabel("NAME")); p1.add(tname);
        p1.add(new JLabel("CODE")); p1.add(tcode);
        p1.add(new JLabel("DESIGNATION")); p1.add(tdesig);
        p1.add(new JLabel("SALARY")); p1.add(tsalary);

        save = new JButton("SAVE");
        reset = new JButton("RESET");
        exit = new JButton("EXIT");

        save.addActionListener(this);
        reset.addActionListener(this);
        exit.addActionListener(this);

        p2.add(save);
        p2.add(reset);
        p2.add(exit);

        // JTable
        model = new DefaultTableModel(new String[]{"Name","Code","Designation","Salary"},0);
        table = new JTable(model);

        add(p1, BorderLayout.NORTH);
        add(p2, BorderLayout.SOUTH);
        add(new JScrollPane(table), BorderLayout.CENTER);

        setSize(600,400);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        String cmd = e.getActionCommand();

        if(cmd.equals("RESET")) {
            tname.setText("");
            tcode.setText("");
            tdesig.setText("");
            tsalary.setText("");
        }

        if(cmd.equals("EXIT")) {
            System.exit(0);
        }

        if(cmd.equals("SAVE")) {

            try {
                Connection con = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/kireet","root","root");

                PreparedStatement ps = con.prepareStatement(
                        "insert into employee values(?,?,?,?)");

                ps.setString(1, tname.getText());
                ps.setInt(2, Integer.parseInt(tcode.getText()));
                ps.setString(3, tdesig.getText());
                ps.setInt(4, Integer.parseInt(tsalary.getText()));

                ps.executeUpdate();

                // clear + reload table
                model.setRowCount(0);

                ResultSet rs = con.createStatement().executeQuery("select * from employee");

                while(rs.next()) {
                    model.addRow(new Object[]{
                            rs.getString(1),
                            rs.getInt(2),
                            rs.getString(3),
                            rs.getInt(4)
                    });
                }

                JOptionPane.showMessageDialog(this, "Saved");

                con.close();

            } catch(Exception ex) {
                JOptionPane.showMessageDialog(this, "Error");
            }
        }
    }
}

public class EmpRecord1 {
    public static void main(String[] args) {
        new GridLayout1();
    }
}