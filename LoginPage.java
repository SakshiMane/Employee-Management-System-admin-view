package Employ;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
 class LoginPage implements ActionListener {
     JFrame J;
     JLabel J1,J2,bck;
     JTextField tf;
     JPasswordField ps;
     JButton b1,b2,b3;
     LoginPage() {
         J=new JFrame("Login");
         J.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         J.setLayout(null);
         JLabel background=new JLabel(new ImageIcon("C:\\Users\\dell 3521\\Desktop\\mini projects\\mini project 1B\\EmployeeManagement\\src\\main\\java\\Employ\\icons\\htt.jpeg"));
         
        bck = new JLabel(new ImageIcon("C:\\Users\\dell 3521\\Desktop\\mini projects\\mini project 1B\\EmployeeManagement\\src\\main\\java\\Employ\\icons\\ut.png"));
        background.add(bck);
        J.add(bck);
        bck.setBounds(18,60,200,228);

         J1=new JLabel("Username ");
         J1.setBounds(245,100,100,30);
         J1.setFont(new Font("Times New Roman",Font.BOLD,20));
         J1.setForeground(Color.WHITE);
         //J1.setForeground(Color.decode("#e60073"));
         J.add(J1);
         
         tf=new JTextField();
         tf.setBounds(360,100,120,25);
         tf.setBorder(null);
         tf.setFont(new Font("Times New Roman",0,18));
         J.add(tf);
         
         J2=new JLabel("Password ");
         J2.setBounds(245, 150, 100, 30);
         J2.setFont(new Font("Times New Roman",Font.BOLD,20));
         J2.setForeground(Color.WHITE);
         //J2.setForeground(Color.decode("#e60073"));
         J.add(J2);
         
         ps=new JPasswordField();
         ps.setBounds(360, 150, 120, 25);
         ps.setBorder(null);
         ps.setFont(new Font("Times New Roman",0,18));
         J.add(ps);
       
         b1=new JButton("Login");
         b1.setBounds(260,240,88,30);
         b1.setBorder(null);
         b1.setFont(new Font("Times New Roman",Font.BOLD,18));
         b1.setBackground(Color.decode("#990099"));
         b1.setForeground(Color.WHITE);
         b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
         b1.addActionListener(this);
         J.add(b1);
         
        /* b2=new JButton("Cancel");
         b2.setBounds(380,240,88,30);
         b2.setBorder(null);
         b2.setFont(new Font("Times New Roman",Font.BOLD,18));
         b2.setBackground(Color.decode("#ff6600"));
         b2.setForeground(Color.WHITE);
         J.add(b2);
         		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				System.exit(0);
			}
		});
         //b2.addActionListener(this);*/
         
         b3 = new JButton("Clear");
         b3.setBounds(380,240,88,30);
         b3.setBorder(null);
         b3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
         b3.setFont(new Font("Times New Roman",Font.BOLD,18));
         b3.setBackground(Color.decode("#ff0066"));
         b3.setForeground(Color.WHITE);
         J.add(b3);
         b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				tf.setText(null);
                                ps.setText(null);
			}
		});
         
         
         J.add(background);
         J.getContentPane().setBackground(Color.WHITE);
         background.setBounds(0,0,550,400);
         J.setVisible(true);
         J.setSize(530,400);
         J.setLocation(50,100);

     }
    
     public void actionPerformed(ActionEvent ae)  {

        try{
            conn c1 = new conn();
            String u = tf.getText();
            String v = ps.getText();
            
            String q = "select * from login where Username='"+u+"' and Password='"+v+"'";
            
            ResultSet rs = c1.s.executeQuery(q); 
            if(rs.next()) {
                new details().J.setVisible(true);
                J.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "Invalid login");
                //J.setVisible(false);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
         LoginPage Lr = new LoginPage();
    }
    
}
