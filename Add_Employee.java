package Employ;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.io.*;

class Add_Employee implements ActionListener {

    JFrame J;
    JLabel l1, bk, id, id1, id2,id3,id4,id5,id6,id7,id8,id9,id10,id11,id12;
    JTextField t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11,t12;
    JPanel jp;
    JButton b1,b2,b3;

    Add_Employee(int i) {
    }

    Add_Employee() {
        J = new JFrame("Add Employee");
        J.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bk = new JLabel(new ImageIcon("C:\\Users\\dell 3521\\Desktop\\mini projects\\mini project 1B\\EmployeeManagement\\src\\main\\java\\Employ\\icons\\tri.jpg"));
        J.add(bk);

        jp = new JPanel();
        jp.setBounds(48, 30, 600, 430);
        jp.setBackground(new Color(224, 224, 224, 225));
        jp.setLayout(null);
        J.add(jp);
        bk.add(jp);

        id = new JLabel("Add New Employee Details");
        id.setFont(new Font("Times New Roman",Font.BOLD, 30));
        id.setBounds(110, 15, 370, 50);
        id.setForeground(Color.BLACK);
        jp.add(id);
        
        id1=new JLabel("First Name ");
        id1.setFont(new Font("Times New Roman",0,18));
        jp.add(id1);
        id1.setOpaque(true);
        id1.setBackground(Color.BLACK);
        id1.setBounds(10,80,100,25);
        id1.setForeground(Color.WHITE);
        
        t1=new JTextField();
        t1.setBounds(110,80,170,25);
        jp.add(t1);
        t1.setHorizontalAlignment(JTextField.CENTER);
        t1.setBorder(null);
        t1.setBackground(Color.WHITE);
        
        id2=new JLabel("Last Name ");
        id2.setFont(new Font("Times New Roman",0,18));
        jp.add(id2);
        id2.setOpaque(true);
        id2.setBackground(Color.BLACK);
        id2.setBounds(10,130,100,25);
        id2.setForeground(Color.WHITE);
        
        t2=new JTextField();
        t2.setBounds(110,130,170,25);
        jp.add(t2);
        t2.setHorizontalAlignment(JTextField.CENTER);
        t2.setBorder(null);
        t2.setBackground(Color.WHITE);
        
        id3=new JLabel("Age ");
        id3.setFont(new Font("Times New Roman",0,18));
        jp.add(id3);
        id3.setOpaque(true);
        id3.setHorizontalAlignment(JTextField.CENTER);
        id3.setBackground(Color.BLACK);
        id3.setBounds(10,180,100,25);
        id3.setForeground(Color.WHITE);
        
        t3=new JTextField();
        t3.setBounds(110,180,170,25);
        jp.add(t3);
        t3.setHorizontalAlignment(JTextField.CENTER);
        t3.setBorder(null);
        t3.setBackground(Color.WHITE);
        
        id4=new JLabel("Birth Date ");
        id4.setFont(new Font("Times New Roman",0,18));
        jp.add(id4);
        id4.setOpaque(true);
        id4.setHorizontalAlignment(JTextField.CENTER);
        id4.setBackground(Color.BLACK);
        id4.setBounds(10,230,100,25);
        id4.setForeground(Color.WHITE);
        
        t4=new JTextField();
        t4.setBounds(110,230,170,25);
        jp.add(t4);
        t4.setHorizontalAlignment(JTextField.CENTER);
        t4.setBorder(null);
        t4.setBackground(Color.WHITE);
        
        id5=new JLabel("Address ");
        id5.setFont(new Font("Times New Roman",0,18));
        jp.add(id5);
        id5.setOpaque(true);
        id5.setHorizontalAlignment(JTextField.CENTER);
        id5.setBackground(Color.BLACK);
        id5.setBounds(10,280,100,25);
        id5.setForeground(Color.WHITE);
        
        t5=new JTextField();
        t5.setBounds(110,280,170,25);
        jp.add(t5);
        t5.setHorizontalAlignment(JTextField.CENTER);
        t5.setBorder(null);
        t5.setBackground(Color.WHITE);
        
        id6=new JLabel("Phone No. ");
        id6.setFont(new Font("Times New Roman",0,18));
        jp.add(id6);
        id6.setOpaque(true);
        id6.setHorizontalAlignment(JTextField.CENTER);
        id6.setBackground(Color.BLACK);
        id6.setBounds(10,330,100,25);
        id6.setForeground(Color.WHITE);
        
        t6=new JTextField();
        t6.setBounds(110,330,170,25);
        jp.add(t6);
        t6.setHorizontalAlignment(JTextField.CENTER);
        t6.setBorder(null);
        t6.setBackground(Color.WHITE);
        
        id7=new JLabel("Email ");
        id7.setFont(new Font("Times New Roman",0,18));
        jp.add(id7);
        id7.setOpaque(true);
        id7.setHorizontalAlignment(JTextField.CENTER);
        id7.setBackground(Color.BLACK);
        id7.setBounds(300,80,100,25);
        id7.setForeground(Color.WHITE);
        
        t7=new JTextField();
        t7.setBounds(400,80,170,25);
        jp.add(t7);
        t7.setHorizontalAlignment(JTextField.CENTER);
        t7.setBorder(null);
        t7.setBackground(Color.WHITE);
        
        id8=new JLabel("Qualification ");
        id8.setFont(new Font("Times New Roman",0,18));
        jp.add(id8);
        id8.setOpaque(true);
        id8.setBackground(Color.BLACK);
        id8.setBounds(300,130,120,25);
        id8.setForeground(Color.WHITE);
        
        t8=new JTextField();
        t8.setBounds(400,130,170,25);
        jp.add(t8);
        t8.setHorizontalAlignment(JTextField.CENTER);
        t8.setBorder(null);
        t8.setBackground(Color.WHITE);
        
        id9=new JLabel("Position ");
        id9.setFont(new Font("Times New Roman",0,18));
        jp.add(id9);
        id9.setOpaque(true);
        id9.setHorizontalAlignment(JTextField.CENTER);
        id9.setBackground(Color.BLACK);
        id9.setBounds(300,180,100,25);
        id9.setForeground(Color.WHITE);
        
        t9=new JTextField();
        t9.setBounds(400,180,170,25);
        jp.add(t9);
        t9.setHorizontalAlignment(JTextField.CENTER);
        t9.setBorder(null);
        t9.setBackground(Color.WHITE);
        
        id10=new JLabel("Aadhar No. ");
        id10.setFont(new Font("Times New Roman",0,18));
        jp.add(id10);
        id10.setOpaque(true);
        id10.setHorizontalAlignment(JTextField.CENTER);
        id10.setBackground(Color.BLACK);
        id10.setBounds(300,230,110,25);
        id10.setForeground(Color.WHITE);
        
        t10=new JTextField();
        t10.setBounds(400,230,170,25);
        jp.add(t10);
        t10.setHorizontalAlignment(JTextField.CENTER);
        t10.setBorder(null);
        t10.setBackground(Color.WHITE);
        
        id11=new JLabel("Employee ID ");
        id11.setFont(new Font("Times New Roman",0,18));
        jp.add(id11);
        id11.setOpaque(true);
        id11.setBackground(Color.BLACK);
        id11.setBounds(300,280,110,25);
        id11.setForeground(Color.WHITE);
        
        t11=new JTextField();
        t11.setBounds(400,280,170,25);
        jp.add(t11);
        t11.setHorizontalAlignment(JTextField.CENTER);
        t11.setBorder(null);
        t11.setBackground(Color.WHITE);
        
        id12=new JLabel("City ");
        id12.setFont(new Font("Times New Roman",0,18));
        jp.add(id12);
        id12.setOpaque(true);
        id12.setHorizontalAlignment(JTextField.CENTER);
        id12.setBackground(Color.BLACK);
        id12.setBounds(300,330,110,25);
        id12.setForeground(Color.WHITE);
        
        t12=new JTextField();
        t12.setBounds(400,330,170,25);
        jp.add(t12);
        t12.setHorizontalAlignment(JTextField.CENTER);
        t12.setBorder(null);
        t12.setBackground(Color.WHITE);
        
        b1=new JButton("Submit");
        b1.setBackground(Color.decode("#ff00bf"));
        b1.setFont(new Font("Times New Roman",Font.BOLD,20));
        b1.setForeground(Color.WHITE);
        b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        b1.setBorder(null);
        b1.setBounds(70,380,145,38);
        jp.add(b1);
        
        b2=new JButton("Cancel");
        b2.setBackground(Color.decode("#0099ff"));//#800080
        b2.setBorder(null);
        b2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        b2.setFont(new Font("Times New Roman",Font.BOLD,20));
        b2.setForeground(Color.WHITE);
        b2.setBounds(235,380,145,38);
        jp.add(b2);
        
        b3=new JButton("Clear");
        b3.setBackground(Color.decode("#800080"));//
        b3.setBorder(null);
        b3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        b3.setFont(new Font("Times New Roman",Font.BOLD,20));
        b3.setForeground(Color.WHITE);
        b3.setBounds(400,380,145,38);
        jp.add(b3);
        b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				t1.setText(null);
                                t2.setText(null);
                                t3.setText(null);
                                t4.setText(null);
                                t5.setText(null);
                                t6.setText(null);
                                t7.setText(null);
                                t8.setText(null);
                                t9.setText(null);
                                t10.setText(null);
                                t11.setText(null);
                                t12.setText(null);
			}
		});
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        
        

        bk.setBounds(0, 0, 700, 500);
        J.setVisible(true);
        J.setSize(700, 500);
        J.setLocation(50, 100);
        J.setBackground(Color.WHITE);
    }
       public void actionPerformed (ActionEvent ae){
        
        String a = t1.getText();
        String bb =t2.getText();
        String c = t3.getText();
        String d = t4.getText();
        String e = t5.getText();
        String ff =t6.getText();
        String g = t7.getText();
        String h = t8.getText();
        String i = t9.getText();
        String j = t10.getText();
        String k = t11.getText();
        String l = t12.getText();
        if(ae.getSource() == b1){
            try{
                conn cc = new conn();
                String q = "insert into employeedata values('"+a+"','"+bb+"','"+c+"','"+d+"','"+e+"','"+ff+"','"+g+"','"+h+"','"+i+"','"+j+"','"+k+"','"+l+"')";
                cc.s.executeUpdate(q);
                JOptionPane.showMessageDialog(null,"Details Successfully Inserted");
                J.setVisible(false);
                new details();
            } catch(Exception ee){
                System.out.println("The error is:"+ee);
            }
        } else if(ae.getSource() == b2){
            J.setVisible(false);
            new details();
        }
    }

    public static void main(String[] args) {
        new Add_Employee();
    }

}
