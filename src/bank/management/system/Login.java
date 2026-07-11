package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

// Login class allows users to log in to the Bank Management System
public class Login extends JFrame implements ActionListener {

    // Labels for text
    JLabel label1, label2, label3;

    // Text field for Card Number
    JTextField textField2;

    // Password field for PIN
    JPasswordField passwordField3;

    // Buttons for Sign In, Clear and Sign Up
    JButton button1, button2, button3;

    // Constructor
    Login() {

        // Set window title
        super("Bank Management System");

        // Use absolute positioning
        setLayout(null);

        // Load and display background image
        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image iii2 = iii1.getImage().
                getScaledInstance(850, 480, Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel iiimage = new JLabel(iii3);
        iiimage.setBounds(0, 0, 850, 480);
        iiimage.setLayout(null);

        // Load and display bank logo
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);

        JLabel image = new JLabel(i3);
        image.setBounds(350, 10, 100, 100);
        iiimage.add(image);

        // Load and display ATM card image
        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image ii2 = ii1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);

        JLabel iimage = new JLabel(ii3);
        iimage.setBounds(630, 350, 100, 100);
        iiimage.add(iimage);

        // Welcome message
        label1 = new JLabel("WELCOME TO ATM");
        label1.setBounds(250, 130, 400, 40);
        label1.setFont(new Font("AverGrade", Font.BOLD, 30));
        label1.setForeground(Color.WHITE);
        iiimage.add(label1);

        // Card Number label
        label2 = new JLabel("Card No:");
        label2.setBounds(150, 190, 375, 30);
        label2.setFont(new Font("Ralway", Font.BOLD, 28));
        label2.setForeground(Color.WHITE);
        iiimage.add(label2);

        // Text field to enter card number
        textField2 = new JTextField(15);
        textField2.setBounds(325, 190, 230, 30);
        textField2.setFont(new Font("Arial", Font.BOLD, 14));
        add(textField2);

        // PIN label
        label3 = new JLabel("Enter Pin:");
        label3.setBounds(150, 250, 375, 30);
        label3.setFont(new Font("Ralway", Font.BOLD, 28));
        label3.setForeground(Color.WHITE);
        iiimage.add(label3);

        // Password field to enter PIN
        passwordField3 = new JPasswordField(15);
        passwordField3.setBounds(325, 250, 230, 30);
        passwordField3.setFont(new Font("Arial", Font.BOLD, 14));
        add(passwordField3);

        // Sign In button
        button1 = new JButton("SIGN IN");
        button1.setFont(new Font("Arial", Font.BOLD, 14));
        button1.setForeground(Color.WHITE);
        button1.setBackground(Color.black);
        button1.setBounds(325, 300, 100, 30);
        button1.addActionListener(this);
        add(button1);

        // Clear button
        button2 = new JButton("CLEAR");
        button2.setFont(new Font("Arial", Font.BOLD, 14));
        button2.setForeground(Color.WHITE);
        button2.setBackground(Color.black);
        button2.setBounds(455, 300, 100, 30);
        button2.addActionListener(this);
        add(button2);

        // Sign Up button
        button3 = new JButton("SIGN UP");
        button3.setFont(new Font("Arial", Font.BOLD, 14));
        button3.setForeground(Color.WHITE);
        button3.setBackground(Color.black);
        button3.setBounds(325, 350, 230, 30);
        button3.addActionListener(this);
        add(button3);

        // Add background image to frame
        add(iiimage);

        // Frame settings
        setSize(850, 480);
        setLocation(450, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUndecorated(true);
        setVisible(true);
    }

    // Handles button click events
    @Override
    public void actionPerformed(ActionEvent e) {

        try {

            // Sign In button is clicked
            if (e.getSource() == button1) {

                // Create database connection
                Connection c = new Connection();

                // Read card number and PIN
                String cardno = textField2.getText();
                String pin = passwordField3.getText();

                // SQL query to verify login credentials
                String q = "select * from login where card_number = '" + cardno + "' and pin = '" + pin + "'";

                // Execute query
                ResultSet resultSet = c.statement.executeQuery(q);

                // Check whether user exists
                if (resultSet.next()) {

                    JOptionPane.showMessageDialog(null, "Login Successful");

                    // Open main menu
                    setVisible(false);
                    new Main_Class(pin);

                } else {

                    JOptionPane.showMessageDialog(null, "Incorrect Card Number or PIN");
                }

            }

            // Clear button is clicked
            else if (e.getSource() == button2) {

                // Clear both input fields
                textField2.setText("");
                passwordField3.setText("");
            }

            // Sign Up button is clicked
            else if (e.getSource() == button3) {

                // Open Sign Up page
                new SignUp();
                setVisible(false);
            }

        } catch (Exception E) {

            // Print exception if any error occurs
            E.printStackTrace();
        }
    }

    // Main method
    public static void main(String[] args) {

        // Launch Login window
        new Login();
    }
}