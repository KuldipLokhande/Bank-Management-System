package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUp3 extends JFrame implements ActionListener {

    private JRadioButton r1, r2, r3, r4;
    private JCheckBox c1, c2, c3, c4, c5, c6, c7;
    private JButton submit, cancel;

    private String formNo;

    long randomCard =
            (long) (Math.random() * 90000000L) + 5040936000000000L;

    String randomPin =
            String.valueOf((long) (Math.random() * 9000L) + 1000L);

    Font headingFont = new Font("Segoe UI", Font.BOLD, 28);
    Font titleFont = new Font("Segoe UI", Font.BOLD, 18);
    Font normalFont = new Font("Segoe UI", Font.PLAIN, 16);

    public SignUp3(String formNo) {

        this.formNo = formNo;

        setTitle("Application Form");
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        // LOGO

        ImageIcon i1 = new ImageIcon(
                ClassLoader.getSystemResource("icon/bank.png"));

        Image i2 = i1.getImage().getScaledInstance(
                90,
                90,
                Image.SCALE_SMOOTH);

        JLabel logo = new JLabel(new ImageIcon(i2));
        logo.setBounds(60, 20, 90, 90);
        add(logo);

        //  Heading

        JLabel heading = new JLabel("Page 3 : Account Details");
        heading.setBounds(220, 30, 420, 40);
        heading.setFont(headingFont);
        add(heading);

        JLabel form = new JLabel("Form No : " + formNo);
        form.setBounds(280, 75, 250, 25);
        form.setFont(new Font("Segoe UI", Font.BOLD, 18));
        form.setForeground(new Color(0, 102, 204));
        add(form);

        //  Account Type

        JLabel account =
                new JLabel("Select Account Type");

        account.setBounds(90, 140, 220, 30);
        account.setFont(titleFont);
        add(account);

        r1 = new JRadioButton("Saving Account");
        r1.setBounds(100, 185, 180, 30);
        r1.setBackground(Color.WHITE);
        r1.setFont(normalFont);
        add(r1);

        r2 = new JRadioButton("Fixed Deposit");
        r2.setBounds(380, 185, 180, 30);
        r2.setBackground(Color.WHITE);
        r2.setFont(normalFont);
        add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setBounds(100, 225, 180, 30);
        r3.setBackground(Color.WHITE);
        r3.setFont(normalFont);
        add(r3);

        r4 = new JRadioButton("Recurring Deposit");
        r4.setBounds(380, 225, 200, 30);
        r4.setBackground(Color.WHITE);
        r4.setFont(normalFont);
        add(r4);

        ButtonGroup group = new ButtonGroup();

        group.add(r1);
        group.add(r2);
        group.add(r3);
        group.add(r4);

        //  Card Number

        JLabel card =
                new JLabel("Card Number");

        card.setBounds(90, 295, 170, 30);
        card.setFont(titleFont);
        add(card);

        JLabel cardNo =
                new JLabel(String.valueOf(randomCard));

        cardNo.setBounds(300, 295, 280, 30);
        cardNo.setFont(new Font("Segoe UI", Font.BOLD, 18));
        cardNo.setForeground(new Color(0, 102, 204));
        add(cardNo);

        JLabel cardInfo =
                new JLabel("(16 Digit ATM Card Number)");

        cardInfo.setBounds(300, 325, 260, 20);
        cardInfo.setForeground(Color.GRAY);
        add(cardInfo);

        //  PIN

        JLabel pin =
                new JLabel("PIN");

        pin.setBounds(90, 370, 170, 30);
        pin.setFont(titleFont);
        add(pin);

        JLabel pinNo =
                new JLabel(randomPin);

        pinNo.setBounds(300, 370, 150, 30);
        pinNo.setFont(new Font("Segoe UI", Font.BOLD, 20));
        pinNo.setForeground(new Color(0, 102, 204));
        add(pinNo);

        JLabel pinInfo =
                new JLabel("(4 Digit Password)");

        pinInfo.setBounds(300, 400, 180, 20);
        pinInfo.setForeground(Color.GRAY);
        add(pinInfo);

        //  Services

        JLabel services =
                new JLabel("Select Services");

        services.setBounds(90, 450, 180, 30);
        services.setFont(titleFont);
        add(services);

        c1 = new JCheckBox("ATM Card");
        c1.setBounds(100, 495, 170, 30);
        c1.setBackground(Color.WHITE);
        c1.setFont(normalFont);
        add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setBounds(380, 495, 220, 30);
        c2.setBackground(Color.WHITE);
        c2.setFont(normalFont);
        add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setBounds(100, 535, 200, 30);
        c3.setBackground(Color.WHITE);
        c3.setFont(normalFont);
        add(c3);

        c4 = new JCheckBox("E-Mail Alerts");
        c4.setBounds(380, 535, 180, 30);
        c4.setBackground(Color.WHITE);
        c4.setFont(normalFont);
        add(c4);

        c5 = new JCheckBox("Cheque Book");
        c5.setBounds(100, 575, 180, 30);
        c5.setBackground(Color.WHITE);
        c5.setFont(normalFont);
        add(c5);

        c6 = new JCheckBox("E-Statement");
        c6.setBounds(380, 575, 180, 30);
        c6.setBackground(Color.WHITE);
        c6.setFont(normalFont);
        add(c6);

        c7 = new JCheckBox(
                "I hereby declare that all the above details are correct.");

        c7.setBounds(90, 625, 500, 30);
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        add(c7);

        //  Buttons

        submit = new JButton("Submit");
        submit.setBounds(220, 700, 140, 40);
        submit.setBackground(new Color(0, 102, 204));
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Segoe UI", Font.BOLD, 16));
        submit.setFocusPainted(false);
        submit.setCursor(new Cursor(Cursor.HAND_CURSOR));
        submit.addActionListener(this);
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setBounds(420, 700, 140, 40);
        cancel.setBackground(new Color(220, 53, 69));
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Segoe UI", Font.BOLD, 16));
        cancel.setFocusPainted(false);
        cancel.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cancel.addActionListener(this);
        add(cancel);

        //  Window

        setSize(850, 820);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == submit) {

            String accountType = "";

            if (r1.isSelected()) {
                accountType = "Saving Account";
            } else if (r2.isSelected()) {
                accountType = "Fixed Deposit Account";
            } else if (r3.isSelected()) {
                accountType = "Current Account";
            } else if (r4.isSelected()) {
                accountType = "Recurring Deposit Account";
            }

            if (accountType.equals("")) {
                JOptionPane.showMessageDialog(
                        null,
                        "Please select an account type.");
                return;
            }

            if (!c7.isSelected()) {
                JOptionPane.showMessageDialog(
                        null,
                        "Please accept the declaration.");
                return;
            }

            String facility = "";

            if (c1.isSelected())
                facility += "ATM Card ";

            if (c2.isSelected())
                facility += "Internet Banking ";

            if (c3.isSelected())
                facility += "Mobile Banking ";

            if (c4.isSelected())
                facility += "E-Mail Alerts ";

            if (c5.isSelected())
                facility += "Cheque Book ";

            if (c6.isSelected())
                facility += "E-Statement ";

            try {

                Connection c = new Connection();

                String query =
                        "INSERT INTO signup3(form_no,account_type,card_number,pin,facility) VALUES('"
                                + formNo + "','"
                                + accountType + "','"
                                + randomCard + "','"
                                + randomPin + "','"
                                + facility + "')";

                c.statement.executeUpdate(query);

                String query2 =
                        "INSERT INTO login(form_no,card_number,pin) VALUES('"
                                + formNo + "','"
                                + randomCard + "','"
                                + randomPin + "')";

                c.statement.executeUpdate(query2);

                JOptionPane.showMessageDialog(
                        null,
                        "Account Created Successfully\n\n"
                                + "Card Number : "
                                + randomCard
                                + "\nPIN : "
                                + randomPin);

                setVisible(false);

                new Deposit(randomPin);

            } catch (Exception ex) {

                ex.printStackTrace();

                JOptionPane.showMessageDialog(
                        null,
                        ex.getMessage());

            }

        } else if (e.getSource() == cancel) {

            int option = JOptionPane.showConfirmDialog(
                    null,
                    "Do you really want to cancel?",
                    "Confirm",
                    JOptionPane.YES_NO_OPTION);

            if (option == JOptionPane.YES_OPTION) {

                System.exit(0);

            }

        }

    }

    public static void main(String[] args) {

        new SignUp3("123456");

    }

}