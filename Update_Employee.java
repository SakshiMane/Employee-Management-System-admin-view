package Employ;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
class Update_Employee extends Add_Employee implements ActionListener{
    JFrame J;
    JLabel l1, bkc, id, id1, id2,id3,id4,id5,id6,id7,id8,id9,id10,id11,id12;
    JTextField t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11,t12;
    JPanel jn;
    JButton b1,b2;
    String id_emp;
    Update_Employee(String idd) {
        super(0);
        J = new JFrame("Update Employee");
        J.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bkc = new JLabel(new ImageIcon("C:\\Users\\dell 3521\\Desktop\\mini projects\\mini project 1B\\EmployeeManagement\\src\\main\\java\\Employ\\icons\\print.jpg"));
        J.add(bkc);
        
        id_emp=idd;
        
        id = new JLabel("Update Employee Details");
        id.setFont(new Font("Times New Roman",Font.BOLD, 35));
        id.setBounds(110, 15, 400, 50);
        id.setBackground(Color.CYAN);
        id.setOpaque(true);
        id.setForeground(Color.BLACK);
        bkc.add(id);
        
        id1=new JLabel("First Name ");
        id1.setFont(new Font("Times New Roman",0,18));
        bkc.add(id1);
        id1.setOpaque(true);
        id1.setBackground(Color.BLACK);
        id1.setBounds(20,100,100,25);
        id1.setForeground(Color.WHITE);
        
        t1=new JTextField();
        t1.setBounds(120,100,170,25);
        bkc.add(t1);
        t1.setHorizontalAlignment(JTextField.CENTER);
        t1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        t1.setBackground(Color.WHITE);
        
        id2=new JLabel("Last Name ");
        id2.setFont(new Font("Times New Roman",0,18));
        bkc.add(id2);
        id2.setOpaque(true);
        id2.setBackground(Color.BLACK);
        id2.setBounds(20,150,100,25);
        id2.setForeground(Color.WHITE);
        
        t2=new JTextField();
        t2.setBounds(120,150,170,25);
        bkc.add(t2);
        t2.setHorizontalAlignment(JTextField.CENTER);
        t2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        t2.setBackground(Color.WHITE);
        
        id3=new JLabel("Age ");
        id3.setFont(new Font("Times New Roman",0,18));
        bkc.add(id3);
        id3.setOpaque(true);
        id3.setHorizontalAlignment(JTextField.CENTER);
        id3.setBackground(Color.BLACK);
        id3.setBounds(20,200,100,25);
        id3.setForeground(Color.WHITE);
        
        t3=new JTextField();
        t3.setBounds(120,200,170,25);
        bkc.add(t3);
        t3.setHorizontalAlignment(JTextField.CENTER);
        t3.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        t3.setBackground(Color.WHITE);
        
        
        id5=new JLabel("Address ");
        id5.setFont(new Font("Times New Roman",0,18));
        bkc.add(id5);
        id5.setOpaque(true);
        id5.setHorizontalAlignment(JTextField.CENTER);
        id5.setBackground(Color.BLACK);
        id5.setBounds(20,250,100,25);
        id5.setForeground(Color.WHITE);
        
        t5=new JTextField();
        t5.setBounds(120,250,170,25);
        bkc.add(t5);
        t5.setHorizontalAlignment(JTextField.CENTER);
        t5.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        t5.setBackground(Color.WHITE);
        
        id6=new JLabel("Phone No. ");
        id6.setFont(new Font("Times New Roman",0,18));
        bkc.add(id6);
        id6.setOpaque(true);
        id6.setHorizontalAlignment(JTextField.CENTER);
        id6.setBackground(Color.BLACK);
        id6.setBounds(20,300,100,25);
        id6.setForeground(Color.WHITE);
        
        t6=new JTextField();
        t6.setBounds(120,300,170,25);
        bkc.add(t6);
        t6.setHorizontalAlignment(JTextField.CENTER);
        t6.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        t6.setBackground(Color.WHITE);
        
        id7=new JLabel("Email ");
        id7.setFont(new Font("Times New Roman",0,18));
        bkc.add(id7);
        id7.setOpaque(true);
        id7.setHorizontalAlignment(JTextField.CENTER);
        id7.setBackground(Color.BLACK);
        id7.setBounds(310,100,100,25);
        id7.setForeground(Color.WHITE);
        
        t7=new JTextField();
        t7.setBounds(410,100,170,25);
        bkc.add(t7);
        t7.setHorizontalAlignment(JTextField.CENTER);
        t7.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        t7.setBackground(Color.WHITE);
        
        id8=new JLabel("Qualification ");
        id8.setFont(new Font("Times New Roman",0,18));
        bkc.add(id8);
        id8.setOpaque(true);
        id8.setBackground(Color.BLACK);
        id8.setBounds(310,150,120,25);
        id8.setForeground(Color.WHITE);
        
        t8=new JTextField();
        t8.setBounds(410,150,170,25);
        bkc.add(t8);
        t8.setHorizontalAlignment(JTextField.CENTER);
        t8.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        t8.setBackground(Color.WHITE);
        
        id9=new JLabel("Position ");
        id9.setFont(new Font("Times New Roman",0,18));
        bkc.add(id9);
        id9.setOpaque(true);
        id9.setHorizontalAlignment(JTextField.CENTER);
        id9.setBackground(Color.BLACK);
        id9.setBounds(310,200,110,25);
        id9.setForeground(Color.WHITE);
        
        t9=new JTextField();
        t9.setBounds(410,200,170,25);
        bkc.add(t9);
        t9.setHorizontalAlignment(JTextField.CENTER);
        t9.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        t9.setBackground(Color.WHITE);
        
        
        id11=new JLabel("Employee ID ");
        id11.setFont(new Font("Times New Roman",0,18));
        bkc.add(id11);
        id11.setOpaque(true);
        id11.setBackground(Color.BLACK);
        id11.setBounds(310,250,110,25);
        id11.setForeground(Color.WHITE);
        
        t11=new JTextField();
        t11.setBounds(410,250,170,25);
        bkc.add(t11);
        t11.setHorizontalAlignment(JTextField.CENTER);
        t11.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        t11.setBackground(Color.WHITE);
        
        id12=new JLabel("City ");
        id12.setFont(new Font("Times New Roman",0,18));
        bkc.add(id12);
        id12.setOpaque(true);
        id12.setHorizontalAlignment(JTextField.CENTER);
        id12.setBackground(Color.BLACK);
        id12.setBounds(310,300,110,25);
        id12.setForeground(Color.WHITE);
        
        t12=new JTextField();
        t12.setBounds(400,300,180,25);
        bkc.add(t12);
        t12.setHorizontalAlignment(JTextField.CENTER);
        t12.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        t12.setBackground(Color.WHITE);
        
        b1=new JButton("Update");
        b1.setBackground(Color.decode("#00cc00"));
        b1.setFont(new Font("Times New Roman",Font.BOLD,20));
        b1.setForeground(Color.WHITE);
        b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        b1.setBorder(null);
        b1.setBounds(150,360,145,38);
        b1.addActionListener(this);
        bkc.add(b1);
        
        b2=new JButton("Cancel");
        b2.setBackground(Color.decode("#0099ff"));//#800080
        b2.setBorder(null);
        b2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        b2.setFont(new Font("Times New Roman",Font.BOLD,20));
        b2.setForeground(Color.WHITE);
        b2.setBounds(300,360,145,38);
        b2.addActionListener(this);
        bkc.add(b2);
        
        bkc.setBounds(0,0,670,445);
        J.setVisible(true);
        J.setSize(670,445);
        J.setLocation(50, 100);
        J.setBackground(Color.WHITE);
        
        showData(idd);
        
    }
    int i=0;
    String dat,aadhar;

    void showData(String s){
        try{
            conn con = new conn();
            String str = "select * from employeedata where employee_id = '"+s+"'";
            ResultSet rs = con.s.executeQuery(str);

            if(rs.next()){
                J.setVisible(true);
                i=1;

                t1.setText(rs.getString(1));
                t2.setText(rs.getString(2));
                t3.setText(rs.getString(3));
                t5.setText(rs.getString(5));
                t6.setText(rs.getString(6));
                t7.setText(rs.getString(7));
                t8.setText(rs.getString(8));
                t9.setText(rs.getString(9));
                t11.setText(rs.getString(11));
                t12.setText(rs.getString(12));
                dat=rs.getString(4);
                aadhar=rs.getString(10);
            }
            if(i==0) 
                JOptionPane.showMessageDialog(null,"Id not found");
            new Search_Employee();
        }catch(Exception ex){}
        J.setVisible(true);
        J.setSize(700,500);
        J.setLocation(400,100);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1 && i==1){
            try{
                conn con = new conn();
                String str = "update employeedata set fname='"+t1.getText()+"',lname='"+t2.getText()+"',age='"+t3.getText()+"',dob='"+dat+"',address='"+t5.getText()+"',phone='"+t6.getText()+"',email='"+t7.getText()+"',qualification='"+t8.getText()+"',position='"+t9.getText()+"',aadhar_number='"+aadhar+"',employee_id='"+t11.getText()+"',city='"+t12.getText()+"' where employee_id='"+id_emp+"'";
                con.s.executeUpdate(str);
                JOptionPane.showMessageDialog(null,"Successfully updated");
                J.setVisible(false);
                new Search_Employee();
            } catch(Exception e){
                System.out.println("The error is:"+e);
            }
        }
        if(ae.getSource()==b2){
            J.setVisible(false);
            details d=new details();
        }
    }
    public static void main(String[] args) {
        new Update_Employee("Update Employee");
    }
    
}
