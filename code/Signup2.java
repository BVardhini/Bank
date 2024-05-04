package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {
    JComboBox comboBox,comboBox2,comboBox3,comboBox4,comboBox5;
    JTextField pan,ano;
    JRadioButton r1,r2,e1,e2;
    JButton next;
    String fno;
    Signup2(String fno){
        super("APPLICATION FORM");
        ImageIcon i1 = new ImageIcon(Login.class.getResource("/icon/bank.png"));
        Image i2=i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        image.setBounds(150, 5, 100, 100);
        add(image);

        this.fno=fno;
        JLabel l1=new JLabel("Page 2");
        l1.setFont(new Font("Railway", Font.BOLD,22));
        l1.setBounds(300,30,600,40);
        add(l1);

        JLabel l2=new JLabel("Additional Details");
        l2.setFont(new Font("Railway", Font.BOLD,22));
        l2.setBounds(300,60,600,40);
        add(l2);

        JLabel l3=new JLabel("Religion:");
        l3.setFont(new Font("Railway", Font.BOLD,18));
        l3.setBounds(100,120,100,30);
        add(l3);

        String rel[]={"Hindu","Muslim","Sikh","Christian","Other"};
        comboBox=new JComboBox(rel);
        comboBox.setBackground(new Color(252,208,76));
        comboBox.setFont(new Font("Railway", Font.BOLD,14));
        comboBox.setBounds(350,120,320,30);
        add(comboBox);

        JLabel l4=new JLabel("Category:");
        l4.setFont(new Font("Railway", Font.BOLD,18));
        l4.setBounds(100,160,100,30);
        add(l4);

        String cat[]={"General","OBC","SC","ST","Other"};
        comboBox2=new JComboBox(cat);
        comboBox2.setBackground(new Color(252,208,76));
        comboBox2.setFont(new Font("Railway", Font.BOLD,14));
        comboBox2.setBounds(350,160,320,30);
        add(comboBox2);

        JLabel l5=new JLabel("Income:");
        l5.setFont(new Font("Railway", Font.BOLD,18));
        l5.setBounds(100,200,100,30);
        add(l5);

        String inc[]={"Null","<1,50,000","<2,50,000","5,00,000","Upto 10,00,000","Above 10,00,000"};
        comboBox3=new JComboBox(inc);
        comboBox3.setBackground(new Color(252,208,76));
        comboBox3.setFont(new Font("Railway", Font.BOLD,14));
        comboBox3.setBounds(350,200,320,30);
        add(comboBox3);

        JLabel l6=new JLabel("Educational:");
        l6.setFont(new Font("Railway", Font.BOLD,18));
        l6.setBounds(100,240,150,30);
        add(l6);

        String edu[]={"Non-Graduate","Graduate","Post-Graduate","Doctrate","Other"};
        comboBox4=new JComboBox(edu);
        comboBox4.setBackground(new Color(252,208,76));
        comboBox4.setFont(new Font("Railway", Font.BOLD,14));
        comboBox4.setBounds(350,240,320,30);
        add(comboBox4);

        JLabel l7=new JLabel("Occupation:");
        l7.setFont(new Font("Railway", Font.BOLD,18));
        l7.setBounds(100,280,150,30);
        add(l7);

        String occ[]={"Salaried","Self-Employed","Business","Student","Retired","Other"};
        comboBox5=new JComboBox(occ);
        comboBox5.setBackground(new Color(252,208,76));
        comboBox5.setFont(new Font("Railway", Font.BOLD,14));
        comboBox5.setBounds(350,280,320,30);
        add(comboBox5);

        JLabel l8=new JLabel("PAN Number:");
        l8.setFont(new Font("Railway", Font.BOLD,18));
        l8.setBounds(100,320,150,30);
        add(l8);

        pan=new JTextField();
        pan.setBounds(350,320,320,30);
        pan.setFont(new Font("Railway", Font.BOLD,18));
        add(pan);

        JLabel l9=new JLabel("Aadhaar Number:");
        l9.setFont(new Font("Railway", Font.BOLD,18));
        l9.setBounds(100,360,200,30);
        add(l9);


        ano=new JTextField();
        ano.setBounds(350,360,320,30);
        ano.setFont(new Font("Railway", Font.BOLD,18));
        add(ano);

        JLabel l10=new JLabel("Senior Citizen:");
        l10.setFont(new Font("Railway", Font.BOLD,18));
        l10.setBounds(100,400,150,30);
        add(l10);

        r1=new JRadioButton("Yes");
        r1.setFont(new Font("Railway", Font.BOLD,14));
        r1.setBackground(new Color(252,208,76));
        r1.setBounds(350,400,100,30);
        add(r1);

        r2=new JRadioButton("No");
        r2.setFont(new Font("Railway", Font.BOLD,14));
        r2.setBackground(new Color(252,208,76));
        r2.setBounds(460,400,100,30);
        add(r2);

        JLabel l11=new JLabel("Existing Account:");
        l11.setFont(new Font("Railway", Font.BOLD,18));
        l11.setBounds(100,440,200,30);
        add(l11);

        e1=new JRadioButton("Yes");
        e1.setFont(new Font("Railway", Font.BOLD,14));
        e1.setBackground(new Color(252,208,76));
        e1.setBounds(350,440,100,30);
        add(e1);

        e2=new JRadioButton("No");
        e2.setFont(new Font("Railway", Font.BOLD,14));
        e2.setBackground(new Color(252,208,76));
        e2.setBounds(460,440,100,30);
        add(e2);

        JLabel l12=new JLabel("Form No:");
        l12.setFont(new Font("Railway", Font.BOLD,13));
        l12.setBounds(500,10,80,30);
        add(l12);

        JLabel l13=new JLabel(fno);
        l13.setFont(new Font("Railway", Font.BOLD,13));
        l13.setBounds(600,10,80,30);
        add(l13);

        next=new JButton("Next");
        next.setFont(new Font("Railway", Font.BOLD,14));
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.setBounds(620,470,100,30);
        next.addActionListener(this);
        add(next);

        setSize(800,550);
        setLocation(400,80);
        getContentPane().setBackground(new Color(252,208,76));
        setLayout(null);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String reli=(String) comboBox.getSelectedItem();
        String cato=(String) comboBox2.getSelectedItem();
        String inco=(String) comboBox3.getSelectedItem();
        String educ=(String) comboBox4.getSelectedItem();
        String ocu=(String) comboBox5.getSelectedItem();
        String pno=pan.getText();
        String aan=ano.getText();
        String sc=" ";
        if(r1.isSelected()){
            sc="Yes";
        }else if(r2.isSelected()){
            sc="No";
        }
        String ea=" ";
        if(e1.isSelected()){
            ea="Yes";
        }else if(e2.isSelected()){
            ea="No";
        }
        try{
            if(pan.getText().equals("")||ano.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }else{
                Con c1=new Con();
                String q="insert into signuptwo values ('"+fno+"','"+reli+"','"+cato+"','"+inco+"','"+educ+"','"+ocu+"','"+pno+"','"+aan+"','"+sc+"','"+ea+"')";
                c1.statement.executeUpdate(q);
                new Signup3(fno);
                setVisible(false);
            }
        }catch (Exception E){
            E.printStackTrace();
        }
    }
    public static void main(String args[]){
        new Signup2("");
    }


}
