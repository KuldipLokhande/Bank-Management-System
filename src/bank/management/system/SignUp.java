package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

// SignUp class collects the user's personal details (Page 1)
public class SignUp extends JFrame implements ActionListener {

    // Generates a random application form number
    Random random = new Random();

    long first4 = (random.nextLong() % 9000L) + 1000L;
    String first = "" + Math.abs(first4);

    // Text fields for user details
    JTextField textName, textFName, textEmail,
            textAdd, textCity, textPin, textState;

    // Date chooser for Date of Birth
    JDateChooser dateChooser;

    // Radio buttons for Gender
    JRadioButton r1, r2;

    // Radio buttons for Marital Status
    JRadioButton m1, m2, m3;

    // Next button
    JButton nextButton;

    // Fonts used in the form
    Font headingFont = new Font("Segoe UI", Font.BOLD, 30);
    Font subHeadingFont = new Font("Segoe UI", Font.BOLD, 22);
    Font labelFont = new Font("Segoe UI", Font.BOLD, 18);
    Font fieldFont = new Font("Segoe UI", Font.PLAIN, 16);

    // Constructor
    SignUp() {

        // Set window title
        super("Application Form");

        // Use absolute positioning
        setLayout(null);

        // Set background color
        getContentPane().setBackground(new Color(215, 252, 252));

        // -------------------- BANK LOGO --------------------

        // Load bank logo image
        ImageIcon i1 = new ImageIcon(
                ClassLoader.getSystemResource("icon/bank.png"));

        // Resize logo image
        Image i2 = i1.getImage().getScaledInstance(
                100,
                100,
                Image.SCALE_SMOOTH);

        // Display bank logo
        JLabel image = new JLabel(new ImageIcon(i2));
        image.setBounds(60, 20, 100, 100);
        add(image);

        // -------------------- HEADING --------------------

        // Display application form number
        JLabel heading = new JLabel(
                "APPLICATION FORM NO. " + first);

        heading.setBounds(200, 20, 600, 40);
        heading.setFont(headingFont);
        add(heading);

        // Display page number
        JLabel page = new JLabel("PAGE 1");
        page.setBounds(365, 65, 150, 30);
        page.setFont(subHeadingFont);
        add(page);

        // Display section title
        JLabel title = new JLabel("Personal Details");
        title.setBounds(285, 100, 300, 35);
        title.setFont(subHeadingFont);
        title.setForeground(new Color(0, 70, 140));
        add(title);

        // -------------------- FULL NAME --------------------

        // Label for Full Name
        JLabel name = new JLabel("Full Name");
        name.setBounds(90, 170, 180, 35);
        name.setFont(labelFont);
        add(name);

        // Text field for Full Name
        textName = new JTextField();
        textName.setBounds(330, 170, 360, 35);
        textName.setFont(fieldFont);
        add(textName);

        // -------------------- FATHER'S NAME --------------------

        // Label for Father's Name
        JLabel fname = new JLabel("Father's Name");
        fname.setBounds(90, 220, 180, 35);
        fname.setFont(labelFont);
        add(fname);

        // Text field for Father's Name
        textFName = new JTextField();
        textFName.setBounds(330, 220, 360, 35);
        textFName.setFont(fieldFont);
        add(textFName);

        // -------------------- DATE OF BIRTH --------------------

        // Label for Date of Birth
        JLabel dob = new JLabel("Date Of Birth");
        dob.setBounds(90, 270, 180, 35);
        dob.setFont(labelFont);
        add(dob);

        // Date chooser to select DOB
        dateChooser = new JDateChooser();
        dateChooser.setBounds(330, 270, 360, 35);
        dateChooser.setFont(fieldFont);
        add(dateChooser);

        // -------------------- GENDER --------------------

        // Label for Gender
        JLabel gender = new JLabel("Gender");
        gender.setBounds(90, 320, 180, 35);
        gender.setFont(labelFont);
        add(gender);

        // Male radio button
        r1 = new JRadioButton("Male");
        r1.setBounds(330, 320, 90, 35);
        r1.setBackground(new Color(215, 252, 252));
        r1.setFont(fieldFont);
        add(r1);

        // Female radio button
        r2 = new JRadioButton("Female");
        r2.setBounds(450, 320, 100, 35);
        r2.setBackground(new Color(215, 252, 252));
        r2.setFont(fieldFont);
        add(r2);

        // Group gender radio buttons
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(r1);
        genderGroup.add(r2);

        // -------------------- EMAIL ADDRESS --------------------

        // Label for Email
        JLabel email = new JLabel("Email Address");
        email.setBounds(90, 370, 180, 35);
        email.setFont(labelFont);
        add(email);

        // Text field for Email
        textEmail = new JTextField();
        textEmail.setBounds(330, 370, 360, 35);
        textEmail.setFont(fieldFont);
        add(textEmail);

        // -------------------- MARITAL STATUS --------------------

        // Label for Marital Status
        JLabel marital = new JLabel("Marital Status");
        marital.setBounds(90, 420, 180, 35);
        marital.setFont(labelFont);
        add(marital);

        // Single radio button
        m1 = new JRadioButton("Single");
        m1.setBounds(330, 420, 90, 35);
        m1.setBackground(new Color(215, 252, 252));
        m1.setFont(fieldFont);
        add(m1);

        // Married radio button
        m2 = new JRadioButton("Married");
        m2.setBounds(440, 420, 110, 35);
        m2.setBackground(new Color(215, 252, 252));
        m2.setFont(fieldFont);
        add(m2);

        // Other radio button
        m3 = new JRadioButton("Other");
        m3.setBounds(570, 420, 90, 35);
        m3.setBackground(new Color(215, 252, 252));
        m3.setFont(fieldFont);
        add(m3);

        // Group marital status radio buttons
        ButtonGroup maritalGroup = new ButtonGroup();
        maritalGroup.add(m1);
        maritalGroup.add(m2);
        maritalGroup.add(m3);

        // -------------------- ADDRESS --------------------

        // Label for Address
        JLabel address = new JLabel("Address");
        address.setBounds(90, 470, 180, 35);
        address.setFont(labelFont);
        add(address);

        // Text field for Address
        textAdd = new JTextField();
        textAdd.setBounds(330, 470, 360, 35);
        textAdd.setFont(fieldFont);
        add(textAdd);

        // -------------------- CITY --------------------

        // Label for City
        JLabel city = new JLabel("City");
        city.setBounds(90, 520, 180, 35);
        city.setFont(labelFont);
        add(city);

        // Text field for City
        textCity = new JTextField();
        textCity.setBounds(330, 520, 360, 35);
        textCity.setFont(fieldFont);
        add(textCity);

        // -------------------- PIN CODE --------------------

        // Label for Pin Code
        JLabel pin = new JLabel("Pin Code");
        pin.setBounds(90, 570, 180, 35);
        pin.setFont(labelFont);
        add(pin);

        // Text field for Pin Code
        textPin = new JTextField();
        textPin.setBounds(330, 570, 360, 35);
        textPin.setFont(fieldFont);
        add(textPin);

        // -------------------- STATE --------------------

        // Label for State
        JLabel state = new JLabel("State");
        state.setBounds(90, 620, 180, 35);
        state.setFont(labelFont);
        add(state);

        // Text field for State
        textState = new JTextField();
        textState.setBounds(330, 620, 360, 35);
        textState.setFont(fieldFont);
        add(textState);

        // -------------------- NEXT BUTTON --------------------

        // Button to save details and move to the next page
        nextButton = new JButton("Next");
        nextButton.setBounds(550, 700, 140, 42);
        nextButton.setFont(new Font("Segoe UI", Font.BOLD, 18));
        nextButton.setBackground(Color.BLACK);
        nextButton.setForeground(Color.WHITE);
        nextButton.setFocusPainted(false);
        nextButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        nextButton.addActionListener(this);
        add(nextButton);

        // -------------------- FRAME SETTINGS --------------------

        // Set window size and properties
        setSize(850, 800);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // Handles Next button click
    @Override
    public void actionPerformed(ActionEvent e) {

        // Read all entered details
        String formNo = first;

        String name = textName.getText();
        String fname = textFName.getText();

        // Get selected Date of Birth
        String dob = ((JTextField)
                dateChooser.getDateEditor()
                        .getUiComponent()).getText();

        // Get selected gender
        String gender = "";

        if (r1.isSelected()) {
            gender = "Male";
        } else if (r2.isSelected()) {
            gender = "Female";
        }

        // Read email address
        String email = textEmail.getText();

        // Get selected marital status
        String marital = "";

        if (m1.isSelected()) {
            marital = "Single";
        } else if (m2.isSelected()) {
            marital = "Married";
        } else if (m3.isSelected()) {
            marital = "Other";
        }

        // Read remaining details
        String address = textAdd.getText();
        String city = textCity.getText();
        String pincode = textPin.getText();
        String state = textState.getText();

        try {

            // Check if any field is empty
            if (name.equals("") ||
                    fname.equals("") ||
                    dob.equals("") ||
                    gender.equals("") ||
                    email.equals("") ||
                    marital.equals("") ||
                    address.equals("") ||
                    city.equals("") ||
                    pincode.equals("") ||
                    state.equals("")) {

                JOptionPane.showMessageDialog(
                        null,
                        "Please fill all the fields."
                );

                return;
            }

            // Create database connection
            Connection con = new Connection();

            // SQL query to save personal details
            String query =
                    "INSERT INTO signup VALUES('" +
                            formNo + "','" +
                            name + "','" +
                            fname + "','" +
                            dob + "','" +
                            gender + "','" +
                            email + "','" +
                            marital + "','" +
                            address + "','" +
                            city + "','" +
                            pincode + "','" +
                            state + "')";

            // Execute the query
            con.statement.executeUpdate(query);

            // Display success message
            JOptionPane.showMessageDialog(
                    null,
                    "Personal Details Saved Successfully."
            );

            // Close current window and open Page 2
            setVisible(false);
            new SignUp2(formNo);

        } catch (Exception ex) {

            // Print and display exception if any error occurs
            ex.printStackTrace();

            JOptionPane.showMessageDialog(
                    null,
                    ex.getMessage()
            );
        }
    }

    // Main method
    public static void main(String[] args) {

        // Launch SignUp window
        new SignUp();
    }
}