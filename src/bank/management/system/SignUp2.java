package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUp2 extends JFrame implements ActionListener {

    String formNo;
    JComboBox<String> comboBox, comboBox2, comboBox3, comboBox4, comboBox5;
    JTextField textPan, textAadhaar;
    JRadioButton r1, r2, r3, r4;
    JButton next;

    Font headingFont = new Font("Segoe UI", Font.BOLD, 28);
    Font labelFont = new Font("Segoe UI", Font.BOLD, 18);
    Font fieldFont = new Font("Segoe UI", Font.PLAIN, 16);

    SignUp2(String formNo) {

        super("Application Form");

        this.formNo = formNo;

        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        // Bank Logo
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);

        JLabel image = new JLabel(i3);
        image.setBounds(70, 15, 100, 100);
        add(image);

        // Heading
        JLabel heading = new JLabel("Page 2 : Additional Details");
        heading.setBounds(220, 30, 420, 40);
        heading.setFont(headingFont);
        add(heading);

        JLabel formLabel = new JLabel("Form No. " + formNo);
        formLabel.setBounds(300, 75, 250, 25);
        formLabel.setFont(new Font("Segoe UI", Font.BOLD, 18));
        add(formLabel);

        // Religion
        JLabel religion = new JLabel("Religion");
        religion.setBounds(100, 150, 150, 35);
        religion.setFont(labelFont);
        add(religion);

        String religions[] = {
                "Hindu",
                "Muslim",
                "Sikh",
                "Christian",
                "Others"
        };

        comboBox = new JComboBox<>(religions);
        comboBox.setBounds(350, 150, 320, 35);
        comboBox.setFont(fieldFont);
        comboBox.setBackground(Color.WHITE);
        add(comboBox);

        // Category
        JLabel category = new JLabel("Category");
        category.setBounds(100, 200, 150, 35);
        category.setFont(labelFont);
        add(category);

        String categories[] = {
                "General",
                "OBC",
                "SC",
                "ST",
                "Others"
        };

        comboBox2 = new JComboBox<>(categories);
        comboBox2.setBounds(350, 200, 320, 35);
        comboBox2.setFont(fieldFont);
        comboBox2.setBackground(Color.WHITE);
        add(comboBox2);

        // Income
        JLabel income = new JLabel("Income");
        income.setBounds(100, 250, 150, 35);
        income.setFont(labelFont);
        add(income);

        String incomes[] = {
                "< 1,50,000",
                "< 2,50,000",
                "< 5,00,000",
                "Up to 10,00,000",
                "Above 10,00,000"
        };

        comboBox3 = new JComboBox<>(incomes);
        comboBox3.setBounds(350, 250, 320, 35);
        comboBox3.setFont(fieldFont);
        comboBox3.setBackground(Color.WHITE);
        add(comboBox3);

        // Education
        JLabel education = new JLabel("Education");
        education.setBounds(100, 300, 150, 35);
        education.setFont(labelFont);
        add(education);

        String educations[] = {
                "Graduate",
                "Post Graduate",
                "Doctorate",
                "Other"
        };

        comboBox4 = new JComboBox<>(educations);
        comboBox4.setBounds(350, 300, 320, 35);
        comboBox4.setFont(fieldFont);
        comboBox4.setBackground(Color.WHITE);
        add(comboBox4);

        // Occupation
        JLabel occupation = new JLabel("Occupation");
        occupation.setBounds(100, 350, 150, 35);
        occupation.setFont(labelFont);
        add(occupation);

        String occupations[] = {
                "Salaried",
                "Self Employed",
                "Business",
                "Student",
                "Retired",
                "Other"
        };

        comboBox5 = new JComboBox<>(occupations);
        comboBox5.setBounds(350, 350, 320, 35);
        comboBox5.setFont(fieldFont);
        comboBox5.setBackground(Color.WHITE);
        add(comboBox5);

        // PAN Number
        JLabel pan = new JLabel("PAN Number");
        pan.setBounds(100, 400, 150, 35);
        pan.setFont(labelFont);
        add(pan);

        textPan = new JTextField();
        textPan.setBounds(350, 400, 320, 35);
        textPan.setFont(fieldFont);
        add(textPan);

        // Aadhaar Number
        JLabel aadhaar = new JLabel("Aadhaar Number");
        aadhaar.setBounds(100, 450, 170, 35);
        aadhaar.setFont(labelFont);
        add(aadhaar);

        textAadhaar = new JTextField();
        textAadhaar.setBounds(350, 450, 320, 35);
        textAadhaar.setFont(fieldFont);
        add(textAadhaar);

        // Senior Citizen
        JLabel sc = new JLabel("Senior Citizen");
        sc.setBounds(100, 500, 170, 35);
        sc.setFont(labelFont);
        add(sc);

        r1 = new JRadioButton("Yes");
        r1.setBounds(350, 500, 80, 35);
        r1.setFont(fieldFont);
        r1.setBackground(Color.WHITE);
        add(r1);

        r2 = new JRadioButton("No");
        r2.setBounds(450, 500, 80, 35);
        r2.setFont(fieldFont);
        r2.setBackground(Color.WHITE);
        add(r2);

        ButtonGroup seniorGroup = new ButtonGroup();
        seniorGroup.add(r1);
        seniorGroup.add(r2);

        // Existing Account
        JLabel ea = new JLabel("Existing Account");
        ea.setBounds(100, 550, 170, 35);
        ea.setFont(labelFont);
        add(ea);

        r3 = new JRadioButton("Yes");
        r3.setBounds(350, 550, 80, 35);
        r3.setFont(fieldFont);
        r3.setBackground(Color.WHITE);
        add(r3);

        r4 = new JRadioButton("No");
        r4.setBounds(450, 550, 80, 35);
        r4.setFont(fieldFont);
        r4.setBackground(Color.WHITE);
        add(r4);

        ButtonGroup accountGroup = new ButtonGroup();
        accountGroup.add(r3);
        accountGroup.add(r4);

        // Form Number
        JLabel fn = new JLabel("Form Number");
        fn.setBounds(100, 600, 170, 35);
        fn.setFont(labelFont);
        add(fn);

        JLabel fn1 = new JLabel(formNo);
        fn1.setBounds(350, 600, 200, 35);
        fn1.setFont(new Font("Segoe UI", Font.BOLD, 17));
        fn1.setForeground(new Color(0, 102, 204));
        add(fn1);

        // Next Button
        next = new JButton("Next");
        next.setBounds(560, 670, 120, 40);
        next.setFont(new Font("Segoe UI", Font.BOLD, 16));
        next.setBackground(new Color(0, 102, 204));
        next.setForeground(Color.WHITE);
        next.setFocusPainted(false);
        next.setCursor(new Cursor(Cursor.HAND_CURSOR));
        next.addActionListener(this);
        add(next);

        // Window Settings
        setTitle("Bank Management System");
        setSize(850, 780);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == next) {

            String religion = (String) comboBox.getSelectedItem();
            String category = (String) comboBox2.getSelectedItem();
            String income = (String) comboBox3.getSelectedItem();
            String education = (String) comboBox4.getSelectedItem();
            String occupation = (String) comboBox5.getSelectedItem();

            String pan = textPan.getText();
            String adhar = textAadhaar.getText();

            String seniorCitizen = "";
            if (r1.isSelected()) {
                seniorCitizen = "Yes";
            } else if (r2.isSelected()) {
                seniorCitizen = "No";
            }

            String existingAccount = "";
            if (r3.isSelected()) {
                existingAccount = "Yes";
            } else if (r4.isSelected()) {
                existingAccount = "No";
            }

            try {

                Connection c = new Connection();

                String query = "INSERT INTO signup2(form_no, religion, category, income, education, occupation, pan, adhar, seniorcitizon, existing_account) VALUES('" +
                        formNo + "','" +
                        religion + "','" +
                        category + "','" +
                        income + "','" +
                        education + "','" +
                        occupation + "','" +
                        pan + "','" +
                        adhar + "','" +
                        seniorCitizen + "','" +
                        existingAccount + "')";

                c.statement.executeUpdate(query);

                JOptionPane.showMessageDialog(null, "Details Saved Successfully");

                setVisible(false);
                new SignUp3(formNo);

            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        new SignUp2("123456789");
    }
}