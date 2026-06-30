package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignUp extends JFrame implements ActionListener {

    Random random = new Random();

    long first4 = (random.nextLong() % 9000L) + 1000L;
    String first = "" + Math.abs(first4);

    JTextField textName, textFName, textEmail, textadd, textCity, textPin, textState;
    JDateChooser dateChooser;
    JRadioButton r1,r2, m1,m2,m3;
    JButton nextNameBtn;


    SignUp() {

        super("APPLICATION FORM");

        setLayout(null);

        // Bank Logo
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25, 10, 100, 100);
        add(image);

        // Heading
        JLabel label1 = new JLabel("APPLICATION FORM NO. " + first);
        label1.setFont(new Font("Raleway", Font.BOLD, 32));
        label1.setBounds(200, 20, 600, 40);
        add(label1);

        JLabel label2 = new JLabel("PAGE 1");
        label2.setFont(new Font("Raleway", Font.BOLD, 22));
        label2.setBounds(390, 70, 200, 30);
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Raleway", Font.BOLD, 22));
        label3.setBounds(340, 100, 250, 30);
        add(label3);

        // Name
        JLabel labelName = new JLabel("Name                :");
        labelName.setFont(new Font("Raleway", Font.BOLD, 20));
        labelName.setBounds(100, 190, 150, 30);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Raleway", Font.BOLD, 14));
        textName.setBounds(300, 190, 400, 30);
        add(textName);

        // Father's Name
        JLabel labelFName = new JLabel("Father's Name :");
        labelFName.setFont(new Font("Raleway", Font.BOLD, 20));
        labelFName.setBounds(100, 240, 150, 30);
        add(labelFName);

        textFName = new JTextField();
        textFName.setFont(new Font("Raleway", Font.BOLD, 14));
        textFName.setBounds(300, 240, 400, 30);
        add(textFName);


        //DOB
        JLabel dob = new JLabel("Date Of Birth   :");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100, 290, 150, 30);
        add(dob);

        dateChooser=new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,290,400,30);
        add(dateChooser);

        //Gender
        JLabel labelGender = new JLabel("Gender            :");
        labelGender.setFont(new Font("Raleway", Font.BOLD, 20));
        labelGender.setBounds(100, 340, 150, 30);
        add(labelGender);

//        textGender = new JTextField();
//        textGender.setFont(new Font("Raleway", Font.BOLD, 14));
//        textGender.setBounds(300, 340, 400, 30);
//        add(textGender);

        r1=new JRadioButton("Male");
        r1.setFont(new Font("Raleway", Font.BOLD,14));
        r1.setBackground(new Color(222,255,228));
        r1.setBounds(300,340,60,30);
        add(r1);

        r2=new JRadioButton("Female");
        r2.setFont(new Font("Raleway", Font.BOLD,14));
        r2.setBackground(new Color(222,255,228));
        r2.setBounds(450,340,80,30);
        add(r2);

        ButtonGroup buttonGroup=new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        //Email
        JLabel labelEmail=new JLabel("Enter Email     :");
        labelEmail.setFont(new Font("Raleway", Font.BOLD,20));
        labelEmail.setBounds(100,390,150,30);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway", Font.BOLD, 14));
        textEmail.setBounds(300, 390, 400, 30);
        add(textEmail);

        //Married Satus
        JLabel labelMS=new JLabel("Marital Status :");
        labelMS.setFont(new Font("Raleway", Font.BOLD,20));
        labelMS.setBounds(100,440,150,30);
        add(labelMS);

//        textMS = new JTextField();
//        textMS.setFont(new Font("Raleway", Font.BOLD, 14));
//        textMS.setBounds(300, 440, 400, 30);
//        add(textMS);

        m1=new JRadioButton("Single");
        m1.setFont(new Font("Raleway", Font.BOLD,14));
        m1.setBackground(new Color(222,255,228));
        m1.setBounds(300,440,90,30);
        add(m1);

        m2=new JRadioButton("Married");
        m2.setFont(new Font("Raleway", Font.BOLD,14));
        m2.setBackground(new Color(222,255,228));
        m2.setBounds(450,440,90,30);
        add(m2);

        m3=new JRadioButton("Other");
        m3.setFont(new Font("Raleway", Font.BOLD,14));
        m3.setBackground(new Color(222,255,228));
        m3.setBounds(600,440,90,30);
        add(m3);

        ButtonGroup buttonGroup1=new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);
        buttonGroup1.add(m3);

        //Address
        JLabel labeladd=new JLabel("Address          :");
        labeladd.setFont(new Font("Raleway", Font.BOLD,20));
        labeladd.setBounds(100,490,150,30);
        add(labeladd);

        textadd = new JTextField();
        textadd.setFont(new Font("Raleway", Font.BOLD, 14));
        textadd.setBounds(300, 490, 400, 30);
        add(textadd);

        //City
        JLabel labelCity=new JLabel("City                  :");
        labelCity.setFont(new Font("Raleway", Font.BOLD,20));
        labelCity.setBounds(100,540,150,30);
        add(labelCity);

        textCity = new JTextField();
        textCity.setFont(new Font("Raleway", Font.BOLD, 14));
        textCity.setBounds(300, 540, 400, 30);
        add(textCity);

        //Pin
        JLabel labelPin=new JLabel("Pin Code         :");
        labelPin.setFont(new Font("Raleway", Font.BOLD,20));
        labelPin.setBounds(100,590,150,30);
        add(labelPin);

        textPin = new JTextField();
        textPin.setFont(new Font("Raleway", Font.BOLD, 14));
        textPin.setBounds(300, 590, 400, 30);
        add(textPin);

        //State
        JLabel labelState=new JLabel("State                :");
        labelState.setFont(new Font("Raleway", Font.BOLD,20));
        labelState.setBounds(100,640,150,30);
        add(labelState);

        textState = new JTextField();
        textState.setFont(new Font("Raleway", Font.BOLD, 14));
        textState.setBounds(300, 640, 400, 30);
        add(textState);

        //Button
        nextNameBtn=new JButton("Next");
        nextNameBtn.setFont(new Font("Raleway", Font.BOLD,14));
        nextNameBtn.setBackground(Color.BLACK);
        nextNameBtn.setForeground(Color.WHITE);
        nextNameBtn.setBounds(620,710,80,30);
       nextNameBtn.addActionListener(this);
        add(nextNameBtn);






        // Background Color
        getContentPane().setBackground(new Color(222, 255, 228));

        setSize(850, 800);
        setLocation(360, 40);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formNo=first;
        String name= textName.getText();
        String fname=textFName.getText();
        String dob=((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();

        String gender=null;
        if(r1.isSelected()){
            gender="Male";
        }else if(r2.isSelected()){
            gender="Female";
        }

        String email=textEmail.getText();

        String marital=null;
        if(m1.isSelected()){
            marital="Single";
        }else if(m2.isSelected()){
            marital="Married";
        }else {
            marital="Other";
        }

        String address=textadd.getText();
        String city=textCity.getText();
        String pincode=textPin.getText();
        String state=textState.getText();

        try{
            if(name.equals("") ||
                    fname.equals("") ||
                    dob.equals("") ||
                    gender == null ||
                    email.equals("") ||
                    marital == null ||
                    address.equals("") ||
                    city.equals("") ||
                    pincode.equals("") ||
                    state.equals("")) {

                JOptionPane.showMessageDialog(null, "Please fill all fields");
                return;
            }else{
                Connection con1=new Connection();
                String query1="Insert into signup values('"+formNo +"', '"+name +"', '"+fname +"', '"+dob +"', '"+gender +"', '"+ email+"', '"+marital +"', '"+ address+"', '"+ city+"', '"+ pincode+"', '"+ state+"')";
                con1.statement.executeUpdate(query1);
                new SignUp2(formNo);
                setVisible(false);
            }
        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new SignUp();
    }
}