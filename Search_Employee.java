package Employ;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Search_Employee implements ActionListener{
    JFrame J;
    JTextField t;
    JLabel l2;
    JButton b,b2;
    Search_Employee() {
        J = new JFrame("Search Employee");
        J.setLayout(null);

        JLabel bck = new JLabel(new ImageIcon("C:\\Users\\dell 3521\\Desktop\\mini projects\\mini project 1B\\EmployeeManagement\\src\\main\\java\\Employ\\icons\\keyboard.jpeg"));

        l2=new JLabel("Employee Id");
        l2.setVisible(true);
        l2.setBounds(40,60,250,30);
        l2.setForeground(Color.WHITE);
        Font F1 = new Font("serif",Font.BOLD,30);
        l2.setFont(F1); 
        bck.add(l2);
        J.add(bck);


        t=new JTextField();
        t.setBounds(240,60,220,30);
        t.setFont(new Font("Times New Roman",0,18));
        bck.add(t);

        b=new JButton("Search");
        b.setBounds(240,150,100,35);
        b.setBackground(Color.WHITE);
        b.setForeground(Color.BLACK);
        b.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        b.setFont(new Font("Times New Roman",Font.BOLD,18));
        b.addActionListener(this);
        bck.add(b);

        b2=new JButton("Cancel");
        b2.setBounds(360,150,100,35);
        b2.setBackground(Color.WHITE);
        b2.setForeground(Color.BLACK);
        b2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        b2.setFont(new Font("Times New Roman",Font.BOLD,18));
        b2.addActionListener(this);
        bck.add(b2);
        
        bck.setBounds(0,0,500,270);
        J.setSize(500,270);
        J.setLocation(50,100);
        J.setVisible(true);
    }
    
     public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b2){
            J.setVisible(false);
            details d=new details();
        }
        if(ae.getSource()==b){
            J.setVisible(false);
            new Update_Employee(t.getText());
            //J.setVisible(false);
        }

    }
    public static void main(String[] args) {
        new Search_Employee();
    }
    
}
