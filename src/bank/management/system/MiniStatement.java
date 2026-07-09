package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class MiniStatement extends JFrame implements ActionListener {

    String randomPin;
    JButton button;
    JTextArea statementArea;

    MiniStatement(String randomPin) {

        this.randomPin = randomPin;

        setTitle("Mini Statement");
        setLayout(null);
        getContentPane().setBackground(new Color(245, 245, 245));

        // Heading
        JLabel heading = new JLabel("MINI STATEMENT");
        heading.setFont(new Font("Segoe UI", Font.BOLD, 20));
        heading.setBounds(110, 20, 220, 30);
        add(heading);

        // Card Number
        JLabel cardLabel = new JLabel();
        cardLabel.setFont(new Font("Segoe UI", Font.BOLD, 14));
        cardLabel.setBounds(20, 70, 350, 25);
        add(cardLabel);

        // Statement Area
        statementArea = new JTextArea();

        statementArea.setEditable(false);
        statementArea.setFont(new Font("Monospaced", Font.PLAIN, 13));
        statementArea.setBackground(Color.WHITE);
        statementArea.setMargin(new Insets(10, 10, 10, 10));

        JScrollPane scrollPane = new JScrollPane(statementArea);
        scrollPane.setBounds(20, 110, 350, 320);
        add(scrollPane);

        // Balance Label
        JLabel balanceLabel = new JLabel();
        balanceLabel.setFont(new Font("Segoe UI", Font.BOLD, 15));
        balanceLabel.setBounds(20, 445, 350, 30);
        add(balanceLabel);


        // Fetch Card Number


        try {

            Connection c = new Connection();

            ResultSet rs = c.statement.executeQuery(
                    "select * from login where pin='" + randomPin + "'");

            while (rs.next()) {

                String card = rs.getString("card_number");

                cardLabel.setText(
                        "Card Number : "
                                + card.substring(0, 4)
                                + "XXXXXXXX"
                                + card.substring(12)
                );

            }

        } catch (Exception e) {
            e.printStackTrace();
        }


        // Fetch Transactions


        try {

            int balance = 0;

            Connection c = new Connection();

            ResultSet rs = c.statement.executeQuery(
                    "select * from bank where pin='" + randomPin + "'");

            StringBuilder sb = new StringBuilder();

            sb.append("------------------------------------------------------------\n");
            sb.append(String.format("%-20s %-12s %10s\n",
                    "DATE", "TYPE", "AMOUNT"));
            sb.append("------------------------------------------------------------\n");

            while (rs.next()) {

                String date = rs.getString("date");

                if (date.length() > 18)
                    date = date.substring(0, 18);

                String type = rs.getString("type");

                String amount = rs.getString("amount");

                sb.append(String.format("%-20s %-12s Rs. %8s\n",
                        date, type, amount));

                if (type.equals("Deposit"))
                    balance += Integer.parseInt(amount);
                else
                    balance -= Integer.parseInt(amount);

            }

            sb.append("------------------------------------------------------------");

            statementArea.setText(sb.toString());

            balanceLabel.setText("Available Balance : Rs. " + balance);

        } catch (Exception e) {
            e.printStackTrace();
        }

        // Exit Button

        button = new JButton("Exit");
        button.setBounds(145, 500, 100, 35);
        button.setFont(new Font("Segoe UI", Font.BOLD, 14));
        button.setBackground(Color.BLACK);
        button.setForeground(Color.WHITE);
        button.addActionListener(this);
        add(button);

        setSize(410, 600);
        setLocationRelativeTo(null);
        setUndecorated(true);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == button) {

            setVisible(false);
            new Main_Class(randomPin);

        }

    }

    public static void main(String[] args) {

        new MiniStatement("");

    }

}