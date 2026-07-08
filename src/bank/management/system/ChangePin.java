package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangePin extends JFrame implements ActionListener {

    JButton b1, b2;
    JPasswordField p1, p2;
    String randomPin;

    ChangePin(String randomPin) {


        this.randomPin = randomPin;


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 1550, 830);
        l3.setLayout(null);
        add(l3);

        JLabel label1 = new JLabel("CHANGE YOUR PIN");
        label1.setFont(new Font("System", Font.BOLD, 18));
        label1.setForeground(Color.WHITE);
        label1.setBounds(430, 170, 300, 35);
        l3.add(label1);

        JLabel label2 = new JLabel("New PIN");
        label2.setFont(new Font("System", Font.BOLD, 16));
        label2.setForeground(Color.WHITE);
        label2.setBounds(430, 230, 150, 30);
        l3.add(label2);

        p1 = new JPasswordField();
        p1.setBackground(new Color(65, 125, 128));
        p1.setForeground(Color.WHITE);
        p1.setBounds(600, 230, 180, 30);
        p1.setFont(new Font("Raleway", Font.BOLD, 18));
        l3.add(p1);

        JLabel label3 = new JLabel("Re-Enter New PIN");
        label3.setFont(new Font("System", Font.BOLD, 16));
        label3.setForeground(Color.WHITE);
        label3.setBounds(430, 280, 170, 30);
        l3.add(label3);

        p2 = new JPasswordField();
        p2.setBackground(new Color(65, 125, 128));
        p2.setForeground(Color.WHITE);
        p2.setBounds(600, 280, 180, 30);
        p2.setFont(new Font("Raleway", Font.BOLD, 18));
        l3.add(p2);

        b1 = new JButton("CHANGE PIN");
        b1.setBounds(430, 350, 160, 35);
        b1.setBackground(new Color(65, 125, 128));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("BACK");
        b2.setBounds(620, 350, 160, 35);
        b2.setBackground(new Color(65, 125, 128));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        l3.add(b2);

        setSize(1550, 1080);
        setLocation(0, 0);
        setUndecorated(true);
        //setTitle("Change PIN");
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == b1) {

                String newPin = new String(p1.getPassword());
                String rePin = new String(p2.getPassword());

                if (newPin.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please enter new PIN");
                    return;
                }

                if (rePin.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please re-enter new PIN");
                    return;
                }

                if (!newPin.equals(rePin)) {
                    JOptionPane.showMessageDialog(null, "Entered PIN does not match");
                    return;
                }

                if (!newPin.matches("\\d{4}")) {
                    JOptionPane.showMessageDialog(null, "PIN must be exactly 4 digits.");
                    return;
                }

//
                Connection c = new Connection();
                String q1 = "update bank set pin = '" + newPin + "' where pin ='" + randomPin + "'";
                String q2 = "update login set pin = '" + newPin + "' where pin ='" + randomPin + "'";
                String q3 = "update signup3 set pin = '" + newPin + "' where pin ='" + randomPin + "'";

                c.statement.executeUpdate(q1);
                c.statement.executeUpdate(q2);
                c.statement.executeUpdate(q3);

                JOptionPane.showMessageDialog(null, "PIN changed successfully.");
                setVisible(false);

                new Main_Class(newPin);

            } else if (e.getSource() == b2) {

                new Main_Class(randomPin);
                setVisible(false);
                // new Transactions(pinNumber);
            }

        } catch (Exception E) {
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new ChangePin("");
    }
}