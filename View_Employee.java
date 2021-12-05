package Employ;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class View_Employee implements ActionListener {
    JFrame J;
    JTextField t;
    JLabel l2;
    JButton b,b2;
    View_Employee() {
        J=new JFrame("View");
        J.setBackground(Color.green);
        J.setLayout(null);

        JLabel bck = new JLabel(new ImageIcon("C:\\Users\\dell 3521\\Desktop\\mini projects\\mini project 1B\\EmployeeManagement\\src\\main\\java\\Employ\\icons\\key.jpg"));


        l2=new JLabel("Employee Id");
        l2.setVisible(true);
        l2.setBounds(40,60,250,30);
        l2.setForeground(Color.white);
        Font F1 = new Font("serif",Font.BOLD,30);
        l2.setFont(F1); 
        bck.add(l2);
        J.add(bck);


        t=new JTextField();
        t.setBounds(240,60,220,30);
        bck.add(t);

        b=new JButton("Search");
        b.setBounds(240,150,100,30);
        b.setBackground(Color.WHITE);
        b.setForeground(Color.BLACK);
        b.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        b.setFont(new Font("Times New Roman",Font.BOLD,18));
        b.addActionListener(this);
        bck.add(b);

        b2=new JButton("Cancel");
        b2.setBounds(360,150,100,30);
        b2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        b2.setBackground(Color.WHITE);
        b2.setForeground(Color.BLACK);
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
            Print_Data p = new Print_Data(t.getText());
        }

    }
    public static void main(String[] args) {
        View_Employee v = new View_Employee();
    }
    
}
