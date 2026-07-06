package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class Withdrawal extends JFrame implements ActionListener {


    TextField textField;
    JButton b1, b2;
    String randomPin;

    Withdrawal(String randomPin) {
        this.randomPin = randomPin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 1550, 830);
        add(l3);

        JLabel label1 = new JLabel("MAXIMUM WITHDRAWAL IS RS. 10,000:");
        label1.setFont(new Font("System", Font.BOLD, 16));
        label1.setForeground(Color.WHITE);
        label1.setBounds(460, 180, 700, 35);
        l3.add(label1);

        JLabel label2 = new JLabel("PLEASE ENTER THE AMOUNT:");
        label2.setFont(new Font("System", Font.BOLD, 16));
        label2.setForeground(Color.WHITE);
        label2.setBounds(460, 220, 700, 35);
        l3.add(label2);


        textField = new TextField();
        textField.setBackground(new Color(65, 125, 128));
        textField.setForeground(Color.WHITE);
        textField.setBounds(460, 260, 320, 25);
        textField.setFont(new Font("Raleway", Font.BOLD, 22));
        l3.add(textField);

        b1 = new JButton("WITHDRAWAL");
        b1.setBounds(700, 362, 150, 35);
        b1.setBackground(new Color(65, 125, 128));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        l3.add(b1);


        b2 = new JButton("BACK");
        b2.setBounds(700, 406, 150, 35);
        b2.setBackground(new Color(65, 125, 128));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        l3.add(b2);


        setSize(1550, 1080);
        setLocation(0, 0);
        setLayout(null);
        setUndecorated(true);
        setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {

            try {
                String amount = textField.getText();
                Date date = new Date();
                if (textField.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please enter the amount you want to withdraw");
                } else {
                    Connection c = new Connection();
                    System.out.println("Withdrawal PIN = " + randomPin);
                    ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '" + randomPin + "'");
                    int balance = 0;
                    while (resultSet.next()) {

                        System.out.println("Type   : " + resultSet.getString("type"));
                        System.out.println("Amount : " + resultSet.getString("amount"));

                        if (resultSet.getString("type").equalsIgnoreCase("Deposit")) {
                            balance += Integer.parseInt(resultSet.getString("amount"));
                        } else {
                            balance -= Integer.parseInt(resultSet.getString("amount"));
                        }
                    }

                    System.out.println("Calculated Balance = " + balance);
                    if (balance < Integer.parseInt(amount)) {
                        JOptionPane.showMessageDialog(null, "Insufficient Balance");
                        return;
                    }

                    c.statement.executeUpdate("insert into bank values ('" + randomPin + "','" + date + "','Withrawal','" + amount + "')");
                    JOptionPane.showMessageDialog(null, "Rs." + amount + " Debited Succesfully...");
                    setVisible(false);
                    new Main_Class(randomPin);

                }
            } catch (Exception E) {

            }
        } else if (e.getSource() == b2) {
            setVisible(false);
            new Main_Class(randomPin);
        }
    }

    public static void main(String[] args) {
        new Withdrawal("");
    }
}
