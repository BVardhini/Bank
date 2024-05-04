package bank.management.system;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.*;
public class Login extends JFrame implements ActionListener {
    JLabel jl;
    JLabel l2;
    JLabel l3;
    JTextField t1;
    JPasswordField p1;
    JButton b1,b2,b3;
    Login(){
        super("Bank Management System");

        ImageIcon i1 = new ImageIcon(Login.class.getResource("/icon/bank.png"));
        Image i2=i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        image.setBounds(350, 10, 100, 100);
        add(image);

        ImageIcon ii1 = new ImageIcon(Login.class.getResource("/icon/card.png"));
        Image ii2=ii1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon ii3=new ImageIcon(ii2);
        JLabel image1= new JLabel(ii3);
        image1.setBounds(630, 350, 100, 100);
        add(image1);

        jl=new JLabel("WELCOME TO ATM");
        jl.setForeground(Color.WHITE);
        jl.setFont(new Font("AvantGarde", Font.BOLD, 38));
        jl.setBounds(230, 125, 450, 40);
        add(jl);

        l2=new JLabel("Card No:");
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("Railway", Font.BOLD, 28));
        l2.setBounds(150, 190, 375, 30);
        add(l2);

        t1=new JTextField(15);
        t1.setBounds(325, 190, 230, 30);
        t1.setFont(new Font("Arial",Font.BOLD,14));
        add(t1);

        l3=new JLabel("PIN: ");
        l3.setForeground(Color.WHITE);
        l3.setFont(new Font("AvantGarde", Font.BOLD, 28));
        l3.setBounds(150, 250, 375, 30);
        add(l3);

        p1=new JPasswordField(15);
        p1.setBounds(325, 250, 230, 30);
        p1.setFont(new Font("Arial", Font.BOLD, 14));
        add(p1);

        b1=new JButton("SIGN IN");
        b1.setBounds(300, 300, 100, 30);
        b1.setFont(new Font("Arial", Font.BOLD, 14));
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.BLACK);
        b1.addActionListener(this);
        add(b1);

        b2=new JButton("CLEAR");
        b2.setBounds(430, 300, 100, 30);
        b2.setFont(new Font("Arial", Font.BOLD, 14));
        b2.setForeground(Color.WHITE);
        b2.setBackground(Color.BLACK);
        b2.addActionListener(this);
        add(b2);

        b3=new JButton("SIGN UP");
        b3.setBounds(300, 350, 230, 30);
        b3.setFont(new Font("Arial", Font.BOLD, 14));
        b3.setForeground(Color.WHITE);
        b3.setBackground(Color.BLACK);
        b3.addActionListener(this);
        add(b3);

        ImageIcon iii1 = new ImageIcon(Login.class.getResource("/icon/backbg.png"));
        Image iii2=iii1.getImage().getScaledInstance(800, 480, Image.SCALE_DEFAULT);
        ImageIcon iii3=new ImageIcon(iii2);
        JLabel iiimage= new JLabel(iii3);
        iiimage.setBounds(0, 0, 800, 480);
        add(iiimage);




        setLayout(null);
        setSize(800, 480);
        setLocation(350,150);
        setUndecorated(true);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == b1) {
                Con c=new Con();
                String cno=t1.getText();
                String pno=p1.getText();
                String q="select * from login where card_no='"+cno+"' and pin='"+pno+"'";
                ResultSet resultSet=c.statement.executeQuery(q);
                if(resultSet.next()){
                    setVisible(false);
                    new main_Class(pno);
                }else {
                    JOptionPane.showMessageDialog(null,"Incorrect card number or PIN");
                }

            }else if(e.getSource()==b2) {
                t1.setText("");
                p1.setText("");

            }else if(e.getSource()==b3) {
                new Signup();
                setVisible(false);

            }
        }catch(Exception E) {
            E.printStackTrace();
        }
    }
    public static void main(String args[]) {
        new Login();
    }
}
