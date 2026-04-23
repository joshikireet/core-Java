/**
 * @author Kireet
 * MouseListener
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MouseDemo extends JFrame implements MouseListener 
{

	JLabel label;
	JPanel panel;

	MouseDemo() {
		setTitle("Mouse Listener Demo");

		label = new JLabel("Click anywhere on panel", JLabel.CENTER);

		panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);


		panel.addMouseListener(this);

		setLayout(new BorderLayout());
		add(label, BorderLayout.NORTH);
		add(panel, BorderLayout.CENTER);
		setSize(500, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public void mouseClicked(MouseEvent e) {
		if (e.getClickCount() == 2) {

			label.setText("Click anywhere on panel");
		} else {
			int x = e.getX();
			int y = e.getY();
			label.setText("Coordinates: X = " + x + ", Y = " + y);
		}
	}


	public void mouseEntered(MouseEvent e) {
		panel.setBackground(Color.GREEN);
		label.setText("Mouse Entered");
	}


	public void mouseExited(MouseEvent e) {
		panel.setBackground(Color.RED);
		label.setText("Mouse Exited");
	}


	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}

	public static void main(String[] args) {
		new MouseDemo();
	}
}