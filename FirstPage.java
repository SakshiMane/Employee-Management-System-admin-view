package Employ;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Thread;
public class FirstPage {
JFrame J;
JLabel l1,back;
JButton b;
FirstPage() {
    J=new JFrame("First Page");
    J.setLayout(null);
    J.getContentPane().setBackground(Color.BLACK);
    l1=new JLabel("Employee Management System");
    l1.setFont(new Font("AR Julian",0,38));
    l1.setForeground(Color.WHITE);
    l1.setBounds(80,15,4000,30);
    J.add(l1);
    
    back=new JLabel(new ImageIcon("C:\\Users\\dell 3521\\Desktop\\mini projects\\mini project 1B\\EmployeeManagement\\src\\main\\java\\Employ\\icons\\mange.jpg"));
    back.setBounds(0,20,700,500);
    J.add(back);
    
    b=new JButton("Click Here to Continue");
    b.setBounds(270,380,200,35);
    b.setBorder(null);
    b.setFont(new Font("Times New Roman",0,18));
    b.setForeground(Color.BLACK);
    b.setBackground(Color.WHITE);
    b.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    b.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent ae) {
            J.setVisible(false);
            new LoginPage();
        }
    });
    back.add(b);
    
    J.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    J.setSize(700,500);
    J.setLocation(50, 100);
    J.setVisible(true);
    while(true) {
        l1.setVisible(false);
        try {
            Thread.sleep(500);
        }
        catch(Exception e) {}
         l1.setVisible(true);
         try {
            Thread.sleep(500);
        }
        catch(Exception e) {}
        
    }
}
    public static void main(String[] args) {
        new FirstPage();
    }
    
}
