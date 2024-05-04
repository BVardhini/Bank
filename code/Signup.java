package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import com.toedter.calendar.JDateChooser;
public class Signup extends JFrame implements ActionListener {
    JRadioButton r1,r2,r3,r4,r5;
    JButton next;
    JTextField t1,t2,t3,t5,t6,t7,t8;
    JDateChooser dc;

    Random rn=new Random();
    long f4=(rn.nextLong()%9000L)+1000L;
    String first=" "+Math.abs(f4);
    Signup(){
        super("APPLICATION FORM");
        ImageIcon i1 = new ImageIcon(Login.class.getResource("/icon/bank.png"));
        Image i2=i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        image.setBounds(25, 10, 100, 100);
        add(image);

        JLabel l1=new JLabel("APPLICATION FORM NO:"+first);
        l1.setBounds(160,20, 600, 40);
        l1.setFont(new Font("Railway", Font.BOLD, 38));
        add(l1);

        JLabel l2=new JLabel("Page 1");
        l2.setBounds(330,70, 600, 30);
        l2.setFont(new Font("Railway", Font.BOLD, 22));
        add(l2);

        JLabel l3=new JLabel("Personal Details");
        l3.setBounds(290,90, 600, 30);
        l3.setFont(new Font("Railway", Font.BOLD, 22));
        add(l3);

        JLabel lname=new JLabel("Name :");
        lname.setBounds(100,150, 100, 30);
        lname.setFont(new Font("Railway", Font.BOLD, 20));
        add(lname);

        t1=new JTextField();
        t1.setFont(new Font("Railway", Font.BOLD, 14));
        t1.setBounds(300,150, 300, 30);
        add(t1);

        JLabel fname=new JLabel("Father's Name :");
        fname.setBounds(100,180, 150, 30);
        fname.setFont(new Font("Railway", Font.BOLD, 20));
        add(fname);

        t2=new JTextField();
        t2.setFont(new Font("Railway", Font.BOLD, 14));
        t2.setBounds(300,180, 300, 30);
        add(t2);

        JLabel dob=new JLabel("Date of Birth:");
        dob.setBounds(100,210, 200, 30);
        dob.setFont(new Font("Railway", Font.BOLD, 20));
        add(dob);

        dc=new JDateChooser();
        dc.setForeground(new Color(105,105,105));
        dc.setBounds(300,210,400,30);
        add(dc);

        JLabel gen=new JLabel("Gender:");
        gen.setFont(new Font("Railway", Font.BOLD, 20));
        gen.setBounds(100,240,200,30);
        add(gen);

        r1=new JRadioButton("Male");
        r1.setFont(new Font("Railway", Font.BOLD, 14));
        r1.setBounds(300,240,60,30);
        r1.setBackground(new Color(222,255,228));
        add(r1);

        r2=new JRadioButton("Female");
        r2.setFont(new Font("Railway", Font.BOLD, 14));
        r2.setBackground(new Color(222,255,228));
        r2.setBounds(450,240,90,30);
        add(r2);

        ButtonGroup bg=new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        JLabel em=new JLabel("Email address:");
        em.setBounds(100,270,200,30);
        em.setFont(new Font("Railway", Font.BOLD, 20));
        add(em);

        t3=new JTextField();
        t3.setFont(new Font("Railway", Font.BOLD, 14));
        t3.setBounds(300,270, 400, 30);
        add(t3);

        JLabel ms=new JLabel("Martial Status:");
        ms.setBounds(100,300,200,30);
        ms.setFont(new Font("Railway", Font.BOLD, 20));
        add(ms);

        r3=new JRadioButton("Married");
        r3.setBounds(300,300,100,30);
        r3.setBackground(new Color(222,255,228));
        r3.setFont(new Font("Railway", Font.BOLD, 14));
        add(r3);

        r4=new JRadioButton("Unmarried");
        r4.setBounds(400,300,100,30);
        r4.setBackground(new Color(222,255,228));
        r4.setFont(new Font("Railway", Font.BOLD, 14));
        add(r4);

        r5=new JRadioButton("Other");
        r5.setBounds(500,300,100,30);
        r5.setFont(new Font("Railway", Font.BOLD, 14));
        r5.setBackground(new Color(222,255,228));
        add(r5);

        ButtonGroup bg1=new ButtonGroup();
        bg1.add(r3);
        bg1.add(r4);
        bg1.add(r5);

        JLabel ad=new JLabel("Address:");
        ad.setBounds(100,330,200,30);
        ad.setFont(new Font("Railway", Font.BOLD, 20));
        add(ad);

        t5=new JTextField();
        t5.setFont(new Font("Railway", Font.BOLD, 14));
        t5.setBounds(300,330, 400, 30);
        add(t5);

        JLabel city=new JLabel("City:");
        city.setBounds(100,360,200,30);
        city.setFont(new Font("Railway", Font.BOLD, 20));
        add(city);

        t6=new JTextField();
        t6.setFont(new Font("Railway", Font.BOLD, 14));
        t6.setBounds(300,360, 400, 30);
        add(t6);

        JLabel pc=new JLabel("Pin Code:");
        pc.setBounds(100,390,200,30);
        pc.setFont(new Font("Railway", Font.BOLD, 20));
        add(pc);

        t7=new JTextField();
        t7.setFont(new Font("Railway", Font.BOLD, 14));
        t7.setBounds(300,390, 400, 30);
        add(t7);

        JLabel state=new JLabel("State:");
        state.setBounds(100,420,200,30);
        state.setFont(new Font("Railway", Font.BOLD, 20));
        add(state);

        t8=new JTextField();
        t8.setFont(new Font("Railway", Font.BOLD, 14));
        t8.setBounds(300,420, 400, 30);
        add(t8);

        next=new JButton("Next");
        next.setFont(new Font("Railway", Font.BOLD, 14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,480,80,30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(800, 700);
        setLocation(350,40);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String fno=first;
        String na=t1.getText();
        String fna=t2.getText();
        String d=((JTextField) dc.getDateEditor().getUiComponent()).getText();
        String gen=null;
        if(r1.isSelected()){
            gen="Male";
        }else if(r2.isSelected()){
            gen="Female";
        }
        String ema=t3.getText();
        String mss=null;
        if(r3.isSelected()){
            mss="Married";
        }else if(r4.isSelected()){
            mss="Unmarried";
        }else if(r5.isSelected()){
            mss="Other";
        }
        String addr=t5.getText();
        String ci=t6.getText();
        String pic=t7.getText();
        String st=t8.getText();

        try{
            if(t1.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }else{
                Con con1=new Con();
                String q="insert into signup values('"+fno+"','"+na+"','"+fna+"','"+d+"','"+gen+"','"+ema+"','"+mss+"','"+addr+"','"+ci+"','"+pic+"','"+st+"')";
                con1.statement.executeUpdate(q);
                new Signup2(fno);
                setVisible(false);

            }
        }catch(Exception E){
            E.printStackTrace();
        }

    }
    public static void main(String args[]) {
        new Signup();
    }
}
