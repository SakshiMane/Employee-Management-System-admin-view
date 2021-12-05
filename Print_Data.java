package Employ;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import java.awt.geom.Line2D;
class Print_Data implements ActionListener {
    JFrame J;
    JLabel img,id,id1,id2,id3,id4,id5,id6,id7,id8,id9,id10,id11,id12,d1,d2,d3,d4,d5,d6,d7,d8,d9,d10,d11,d12;
    String emp_id,name,Lname,address,phone,email,quali,post,age,dob,aadhar,city;
    JButton v1,v2;
    int i=0;
    Print_Data(String e_id) {
          try{
            conn con = new conn();
            String str = "select * from employeedata where employee_id = '"+e_id+"'";
            ResultSet rs= con.s.executeQuery(str);
          

            while(rs.next()){         
                name = rs.getString("fname");
                Lname = rs.getString("lname");
                age = rs.getString("age");
                dob = rs.getString("dob");
                address = rs.getString("address");
                phone = rs.getString("phone");
                email = rs.getString("email");
                quali = rs.getString("qualification");
                post = rs.getString("position");
                aadhar = rs.getString("aadhar_number");
                emp_id = rs.getString("employee_id");
                city=rs.getString("city");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
          
        J = new JFrame("Print Data");
        J.setLayout(null);
        J.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        img = new JLabel(new ImageIcon("C:\\Users\\dell 3521\\Desktop\\mini projects\\mini project 1B\\EmployeeManagement\\src\\main\\java\\Employ\\icons\\bck.jpg"));
        img.setBounds(0,0,700,500);
        
        id=new JLabel("Employee Details");
        id.setBounds(260,40,366,35);
        id.setFont(new Font("Georgia",Font.BOLD,40));
        id.setForeground(Color.decode("#660033"));
        img.add(id);
        
        id1=new JLabel("First Name: ");
        id1.setBounds(200,100,110,30);
        id1.setFont(new Font("Times New Roman",Font.BOLD,20));
        id1.setForeground(Color.decode("#660066"));
        img.add(id1);
        
        d1 = new JLabel(name);
        d1.setBounds(310,100,200,30);
        d1.setFont(new Font("serif",0,18));
        img.add(d1);
        
        JLabel h2=new JLabel("_______________");
        img.add(h2);
        h2.setBounds(300,110,250,20);
        
        id2=new JLabel("Last Name: ");
        id2.setBounds(200,150,110,30);
        id2.setFont(new Font("Times New Roman",Font.BOLD,20));
        id2.setForeground(Color.decode("#660066"));
        img.add(id2);
        
        JLabel h3=new JLabel("_______________");
        img.add(h3);
        h3.setBounds(300,160,250,20);
        
        d2 = new JLabel(Lname);
        d2.setBounds(310,150,200,30);
        d2.setFont(new Font("serif",0,18));
        img.add(d2);
        
        id3=new JLabel("Age: ");
        id3.setBounds(200,200,110,30);
        id3.setFont(new Font("Times New Roman",Font.BOLD,20));
        id3.setForeground(Color.decode("#660066"));
        img.add(id3);
        
        d3 = new JLabel(age);
        d3.setBounds(290,200,200,30);
        d3.setFont(new Font("serif",0,18));
        img.add(d3);
        
        JLabel h4=new JLabel("_______________");
        img.add(h4);
        h4.setBounds(270,210,250,20);
        
        id4=new JLabel("Birth Date: ");
        id4.setBounds(200,250,110,30);
        id4.setFont(new Font("Times New Roman",Font.BOLD,20));
        id4.setForeground(Color.decode("#660066"));
        img.add(id4);
        
        d4 = new JLabel(dob);
        d4.setBounds(300,250,200,30);
        d4.setFont(new Font("serif",0,18));
        img.add(d4);
        
        JLabel h5=new JLabel("_______________");
        img.add(h5);
        h5.setBounds(300,260,250,20);
        
        id5=new JLabel("Address: ");
        id5.setBounds(200,300,180,30);
        id5.setFont(new Font("Times New Roman",Font.BOLD,20));
        id5.setForeground(Color.decode("#660066"));
        img.add(id5);
        
        d5 = new JLabel(address);
        d5.setBounds(278,300,260,30);
        d5.setFont(new Font("serif",0,18));
        img.add(d5);
        
        JLabel hl=new JLabel("__________________________________________");
        img.add(hl);
        hl.setBounds(278,310,360,20);
        
        
        id6=new JLabel("Phone no: ");
        id6.setBounds(200,350,110,30);
        id6.setFont(new Font("Times New Roman",Font.BOLD,20));
        id6.setForeground(Color.decode("#660066"));
        img.add(id6);
        
        d6 = new JLabel(phone);
        d6.setBounds(300,350,200,30);
        d6.setFont(new Font("serif",0,18));
        img.add(d6);
        
        JLabel h6=new JLabel("_______________");
        img.add(h6);
        h6.setBounds(300,360,250,20);
        
        id7=new JLabel("Email: ");
        id7.setBounds(430,100,110,30);
        id7.setFont(new Font("Times New Roman",Font.BOLD,20));
        id7.setForeground(Color.decode("#660066"));
        img.add(id7);
        
        d7 = new JLabel(email);
        d7.setBounds(490,100,200,30);
        d7.setFont(new Font("serif",0,18));
        img.add(d7);
        
        JLabel h7=new JLabel("_______________________");
        img.add(h7);
        h7.setBounds(500,110,250,20);
        
        id8=new JLabel("Qualification: ");
        id8.setBounds(440,150,130,30);
        id8.setFont(new Font("Times New Roman",Font.BOLD,20));
        id8.setForeground(Color.decode("#660066"));
        img.add(id8);
        
        d8 = new JLabel(quali);
        d8.setBounds(580,150,200,30);
        d8.setFont(new Font("serif",0,18));
        img.add(d8);
        
        JLabel h8=new JLabel("_______________");
        img.add(h8);
        h8.setBounds(560,160,250,20);
        
        id9=new JLabel("Position: ");
        id9.setBounds(440,200,110,30);
        id9.setFont(new Font("Times New Roman",Font.BOLD,20));
        id9.setForeground(Color.decode("#660066"));
        img.add(id9);
        
        d9 = new JLabel(post);
        d9.setBounds(530,200,220,30);
        d9.setFont(new Font("serif",0,18));
        img.add(d9);
        
        JLabel h9=new JLabel("_______________");
        img.add(h9);
        h9.setBounds(520,210,270,20);
        
        
        id11=new JLabel("Employee Id: ");
        id11.setBounds(440,250,140,30);
        id11.setFont(new Font("Times New Roman",Font.BOLD,20));
        id11.setForeground(Color.decode("#660066"));
        img.add(id11);
        
        d11 = new JLabel(emp_id);
        d11.setBounds(580,250,200,30);
        d11.setFont(new Font("serif",0,18));
        img.add(d11);
        
        JLabel h10=new JLabel("____________");
        img.add(h10);
        h10.setBounds(570,260,250,20);
        
        id12=new JLabel("City: ");
        id12.setBounds(440,350,110,30);
        id12.setFont(new Font("Times New Roman",Font.BOLD,20));
        id12.setForeground(Color.decode("#660066"));
        img.add(id12);
        
        d12 = new JLabel(city);
        d12.setBounds(520,350,350,30);
        d12.setFont(new Font("serif",0,18));
        img.add(d12);
        
        JLabel h11=new JLabel("_______________");
        img.add(h11);
        h11.setBounds(520,360,250,20);
              
        v1=new JButton("Print");
        v1.setBackground(Color.BLACK);
        v1.setForeground(Color.WHITE);
        v1.setFont(new Font("Times New Roman",Font.BOLD,18));
        v1.setBorder(null);
        img.add(v1);
        v1.setBounds(250,400,100,35);
        v1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        v1.addActionListener(this);
        

        v2=new JButton("Cancel");
        v2.setBackground(Color.BLACK);
        v2.setBorder(null);
        v2.setFont(new Font("Times New Roman",Font.BOLD,18));
        v2.setForeground(Color.WHITE);
        v2.setBounds(380,400,100,35);
        v2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        v2.addActionListener(this);
        img.add(v2);
        
        J.add(img);
        J.setVisible(true);
        J.setSize(700,500);
        J.setLocation(50,100);
        J.setBackground(Color.WHITE);
    }
    public void actionPerformed (ActionEvent ae){

        if(ae.getSource()==v1){
            JOptionPane.showMessageDialog(null,"printed successfully");
            J.setVisible(false);
            details d=new details();
        }
        if(ae.getSource()==v2){
            J.setVisible(false);
            new View_Employee();
        }
    }
    public static void main(String[] args) {
        new Print_Data("Print Data");
    }
    
}
