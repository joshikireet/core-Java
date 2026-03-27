package gitt;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FeedbackForm extends JFrame implements ActionListener, KeyListener {

    JTextField nameField, rollField, courseField, feedbackField;
    JTextArea FeedBackDetails;
    JLabel errorLabel, feedbackLabel;

    JButton submitBtn, clearBtn;

    public FeedbackForm() {

        setTitle("Student Feedback Form");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        // ---------------- INPUT PANEL ----------------
        JPanel inputPanel = new JPanel(new GridLayout(4, 2, 10, 10));

        inputPanel.add(new JLabel("Name:"));
        nameField = new JTextField();
        inputPanel.add(nameField);

        inputPanel.add(new JLabel("Roll No:"));
        rollField = new JTextField();
        rollField.addKeyListener(this);
        inputPanel.add(rollField);

        inputPanel.add(new JLabel("Course:"));
        courseField = new JTextField();
        inputPanel.add(courseField);

        inputPanel.add(new JLabel("Feedback:"));
        feedbackField = new JTextField();
        inputPanel.add(feedbackField);

        add(inputPanel, BorderLayout.NORTH);

        // ---------------- ERROR LABEL ----------------
        errorLabel = new JLabel("");
        errorLabel.setForeground(Color.RED);

        // ---------------- BUTTON PANEL ----------------
        JPanel buttonPanel = new JPanel(new FlowLayout());

        submitBtn = new JButton("Submit");
        clearBtn = new JButton("Clear");

        buttonPanel.add(submitBtn);
        buttonPanel.add(clearBtn);

        submitBtn.addActionListener(this);
        clearBtn.addActionListener(this);

        // ---------------- TEXT AREA ----------------
        feedbackLabel = new JLabel("Feedback Details");

        FeedBackDetails = new JTextArea(10, 40);
        FeedBackDetails.setEditable(false);

        JScrollPane scroll = new JScrollPane(FeedBackDetails);

        // ---------------- CENTER PANEL ----------------
        JPanel centerPanel = new JPanel(new BorderLayout());

        centerPanel.add(errorLabel, BorderLayout.NORTH);

        JPanel middlePanel = new JPanel(new BorderLayout());
        middlePanel.add(buttonPanel, BorderLayout.NORTH);

        // label ABOVE textarea
        JPanel textPanel = new JPanel(new BorderLayout());
        textPanel.add(feedbackLabel, BorderLayout.NORTH);
        textPanel.add(scroll, BorderLayout.CENTER);

        middlePanel.add(textPanel, BorderLayout.CENTER);

        centerPanel.add(middlePanel, BorderLayout.CENTER);

        add(centerPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    // ---------------- ACTION LISTENER ----------------
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == submitBtn) {

            FeedBackDetails.setText(
                    "Name: " + nameField.getText() + "\n" +
                    "Roll No: " + rollField.getText() + "\n" +
                    "Course: " + courseField.getText() + "\n" +
                    "Feedback: " + feedbackField.getText() + "\n" +
                    "-----------------------------\n"
            );
        }

        else if (e.getSource() == clearBtn) {

            nameField.setText("");
            rollField.setText("");
            courseField.setText("");
            feedbackField.setText("");
            errorLabel.setText("");
        }
    }

    // ---------------- KEY LISTENER ----------------
    @Override
    public void keyTyped(KeyEvent e) {
        char ch = e.getKeyChar();

        if (!Character.isDigit(ch)) {
            e.consume();
            errorLabel.setText("Only numbers are allowed");
        } else {
            errorLabel.setText("");
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {}

    // ---------------- MAIN METHOD ----------------
    public static void main(String[] args) {
        new FeedbackForm();
    }
}