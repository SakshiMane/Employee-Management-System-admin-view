package Employ;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
class Remove_Employee implements ActionListener{
    JFrame J;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8;
    JTextField t;
    JButton b,b1,b2,b3;
    JPanel jp,jo;
    Remove_Employee() {
        J = new JFrame("Remove Employee");
        J.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        l5=new JLabel();
        l5.setBounds(0,0,750,440);
        l5.setLayout(null);
        l5 = new JLabel(new ImageIcon("C:\\Users\\dell 3521\\Desktop\\mini projects\\mini project 1B\\EmployeeManagement\\src\\main\\java\\Employ\\icons\\lp.jpg"));

        jp = new JPanel();
        jp.setBounds(60, 25, 600, 400);
        jp.setBackground(new Color(240,240,240,210));
        jp.setLayout(null);
        
       
        l1=new JLabel("Employee Id");
        l1.setBounds(100,30,240,34);
        l1.setBackground(Color.decode("#ff1ac6"));
        l1.setOpaque(true);
        l1.setForeground(Color.white);//#ffccff
        Font f2 = new Font("Georgia",Font.BOLD,25); 
        l1.setFont(f2);
        jp.add(l1);

        t=new JTextField();
        t.setBounds(265,30,150,34);
        t.setHorizontalAlignment(JTextField.CENTER);
        t.setFont(new Font("Times New Roman",0,16));
        t.setBorder(null);
        //t.setBorder(BorderFactory.createLineBorder(Color.decode("#ff1ac6"),1));
        jp.add(t);


        b=new JButton("Search");
        b.setBounds(200,80,120,35);
        b.setBackground(Color.BLACK);
        b.setForeground(Color.white);
        Font fe = new Font("Georgia",Font.BOLD,20); 
        b.setFont(fe);
        b.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        b.addActionListener(this);
        jp.add(b);

        b3=new JButton("Back");
        b3.setBounds(350,80,120,35); 
        b3.setBackground(Color.BLACK);
        b3.setFont(fe);
        b3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        b3.setForeground(Color.white);
        b3.addActionListener(this);
        jp.add(b3);


        l2=new JLabel("Name:"); 
        l2.setBounds(50,150,250,30);
        l2.setForeground(Color.BLACK);
        Font f3 = new Font("Georgia",Font.BOLD,20); 
        l2.setFont(f3);
        jp.add(l2);

        l6=new JLabel();    
        l6.setBounds(200,150,350,30);
        l6.setForeground(Color.BLACK);
        Font F6=new Font("serif",Font.BOLD,20); 
        l6.setFont(F6);
        jp.add(l6);

        l3=new JLabel("Mobile No:");
        l3.setBounds(50,200,250,30);
        l3.setForeground(Color.BLACK);
        Font f4 = new Font("Georgia",Font.BOLD,20); 
        l3.setFont(f4);
        jp.add(l3);


        l7=new JLabel();
        l7.setBounds(200,200,350,30);
        l7.setForeground(Color.BLACK);
        Font F7=new Font("serif",Font.BOLD,20); 
        l7.setFont(F7);
        jp.add(l7);



        l4=new JLabel("Email Id:");
        l4.setBounds(50,250,250,30);
        l4.setForeground(Color.BLACK);
        Font F5=new Font("Georgia",Font.BOLD,20); 
        l4.setFont(F5);
        jp.add(l4);

        l8=new JLabel();
        l8.setBounds(200,250,350,30);
        l8.setForeground(Color.BLACK);
        Font f8=new Font("serif",Font.BOLD,20); 
        l8.setFont(f8);
        jp.add(l8);

        b1=new JButton("Remove");
        b1.setBounds(120,300,100,35);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        b1.setFont(new Font("Times New Roman",0,18));
        jp.add(b1);


        b2=new JButton("Cancel");
        b2.setBounds(300,300,100,35);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        b2.setFont(new Font("Times New Roman",0,18));
        b2.addActionListener(this);
        jp.add(b2);
        
        l2.setVisible(false);
        l3.setVisible(false);
        l4.setVisible(false);
        l6.setVisible(false);
        l7.setVisible(false);
        l8.setVisible(false);
        b1.setVisible(false);
        b2.setVisible(false);
        
        
        J.add(l5);
        l5.add(jp);
        J.setVisible(true);
        J.setSize(750,500);
        J.setLocation(50,100);
        J.setBackground(Color.WHITE);
    }
    public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==b){
            try{
                conn con = new conn();
                String str = "select fname,phone,email from employeedata where employee_id ='"+t.getText()+"' ";
                ResultSet rs = con.s.executeQuery(str);

                int i=0;
                if(rs.next()){
                    String name = rs.getString(1);
                    String mob = rs.getString(2);
                    String email =rs.getString(3);

                    l2.setVisible(true);
                    l3.setVisible(true);
                    l4.setVisible(true);
                    b1.setVisible(true);
                    b2.setVisible(true);
                    l6.setVisible(true);
                    l7.setVisible(true);
                    l8.setVisible(true);
                    i=1;
                    l6.setText(name);
                    l7.setText(mob);
                    l8.setText(email);
                    
                }
                if(i==0)
                    JOptionPane.showMessageDialog(null,"Id not found");
            }catch(Exception ex){}
        }
        if(ae.getSource()==b1){
            try{
                conn con = new conn();
                String str = "delete from employeedata where employee_id = '"+t.getText()+"'";
                con.s.executeUpdate(str);
                JOptionPane.showMessageDialog(null,"deleted successfully");
                l2.setVisible(false);
                l3.setVisible(false);
                l4.setVisible(false);
                l6.setVisible(false);
                l7.setVisible(false);
                l8.setVisible(false);
                b1.setVisible(false);
                b2.setVisible(false);

            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,"Exception occured while delting record "+ex);
            }
        }
        if(ae.getSource()==b2){
            J.setVisible(false);
            details d=new details();
        }
        if(ae.getSource()==b3){
            J.setVisible(false);
            details d=new details();
        }
    }

    public static void main(String[] args) {
        new Remove_Employee();
    }
    
}
