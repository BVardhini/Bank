package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener {

    String pno;
    JButton b1,b2;
    TextField textField;
    Deposit(String pno){
        this.pno=pno;
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2=i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l3=new JLabel(i3);
        l3.setBounds(0,0,1550,700);
        add(l3);

        JLabel l1=new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System",Font.BOLD,16));
        l1.setBounds(460,180,400,35);
        l3.add(l1);

        textField=new TextField();
        textField.setBackground(new Color(65,125,128));
        textField.setForeground(Color.WHITE);
        textField.setBounds(460,230,320,25);
        textField.setFont(new Font("Railway",Font.BOLD,22));
        l3.add(textField);

        b1=new JButton("Deposit");
        b1.setBounds(700,302,150,35);
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        l3.add(b1);

        b2=new JButton("Back");
        b2.setBounds(700,346,150,35);
        b2.setBackground(new Color(65,125,128));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        l3.add(b2);

        setSize(1550,1080);
        setLayout(null);
        setLocation(0,0);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            String amount=textField.getText();
            Date date=new Date();
            if(e.getSource()==b1){
               if(textField.getText().equals("")){
                   JOptionPane.showMessageDialog(null,"Please enter the amount you want to deposit");
               }else{
                   Con c=new Con();
                   c.statement.executeUpdate("insert into bank values('"+pno+"','"+date+"','Deposit','"+amount+"')");
                   JOptionPane.showMessageDialog(null,"Rs. "+amount+" Deposited Successfully");
                   setVisible(false);
                   new main_Class(pno);
               }
            } else if (e.getSource()==b2) {
                setVisible(false);
                new main_Class(pno);
            }
        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Deposit("");
    }
}