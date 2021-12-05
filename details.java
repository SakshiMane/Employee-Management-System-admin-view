package Employ;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 class details implements ActionListener {
    JFrame J;
    JLabel l2;
    JButton b1,b2,b3,b4,back;
    JMenu mn,log;
    JMenuItem vw,ll;
    details() {
        J=new JFrame("Employee Detail");
        J.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        J.setLayout(null);
        JLabel bckgr = new JLabel(new ImageIcon("C:\\Users\\dell 3521\\Desktop\\mini projects\\mini project 1B\\EmployeeManagement\\src\\main\\java\\Employ\\icons\\imm.jpg"));
        J.add(bckgr);
        
        l2 = new JLabel("Employee Details");
        l2.setBounds(320,20,300,40);
        l2.setFont(new Font("AR Julian",Font.BOLD,35));
        l2.setForeground(Color.white);
        bckgr.add(l2);
        
        Icon ic = new ImageIcon("C:\\Users\\dell 3521\\Desktop\\mini projects\\mini project 1B\\EmployeeManagement\\src\\main\\java\\Employ\\icons\\add.jpg");
        b1=new JButton(ic);
        b1.setBounds(340,70,150,150);
        b1.setBorder(null);
        /*b1.setBackground(Color.GREEN);
        b1.setForeground(Color.BLACK);*/
        b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        b1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        b1.setFont(new Font("serif",Font.BOLD,18));
        b1.addActionListener(this);
        bckgr.add(b1);
        
        JMenuBar mbt= new JMenuBar();
        mn= new JMenu("View");
        log=new JMenu("Logout");
        vw=new JMenuItem("All Employee");
        ll=new JMenuItem("Logout");
        mn.add(vw);
        log.add(ll);
        bckgr.add(mn);
        mbt.add(mn);
        mbt.add(log);
        
        mbt.setLocation(6,20);
        mbt.setBackground(Color.decode("#4d0099"));
        mn.setForeground(Color.white);
        mn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        mn.setFont(new Font("Times New Roman",0,19));
        vw.setFont(new Font("Times New Roman",0,17));
        vw.setBackground(Color.WHITE);
        vw.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        log.setFont(new Font("Times New Roman",0,19));
        log.setForeground(Color.white);
        log.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        J.setJMenuBar(mbt);
        ll.setFont(new Font("Times New Roman",0,17));
        ll.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        ll.setBackground(Color.WHITE);
        ll.addActionListener(this);
        vw.addActionListener(this);
       
        Icon ic1 = new ImageIcon("C:\\Users\\dell 3521\\Desktop\\mini projects\\mini project 1B\\EmployeeManagement\\src\\main\\java\\Employ\\icons\\Search-male-User-icon.png");
        b2=new JButton(ic1);
        b2.setBounds(520,70,150,150);
        b2.setBorder(null);
        /*b2.setBackground(Color.GREEN);
        b2.setForeground(Color.BLACK);*/
        b2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        b2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        b2.setFont(new Font("serif",Font.BOLD,18));
        b2.addActionListener(this);
        bckgr.add(b2);

        Icon ic2 = new ImageIcon("C:\\Users\\dell 3521\\Desktop\\mini projects\\mini project 1B\\EmployeeManagement\\src\\main\\java\\Employ\\icons\\male-user-remove.png");
        b3=new JButton(ic2);
        b3.setBounds(340,270,150,150);
        b3.setBorder(null);
        b3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        /*b3.setBackground(Color.GREEN);
        b3.setForeground(Color.BLACK);*/
        b3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        //b3.setFont(new Font("serif",Font.BOLD,18));
        b3.addActionListener(this);
        bckgr.add(b3);

        Icon ic3 = new ImageIcon("C:\\Users\\dell 3521\\Desktop\\mini projects\\mini project 1B\\EmployeeManagement\\src\\main\\java\\Employ\\icons\\update.jpg");
        b4=new JButton(ic3);
        b4.setBounds(520,270,150,150);
        b4.setBorder(null);
        b4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        /*b4.setBackground(Color.GREEN);
        b4.setForeground(Color.BLACK);*/
        b4.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        b4.setFont(new Font("serif",Font.BOLD,18));
        b4.addActionListener(this);
        bckgr.add(b4);
        
       /* back=new JButton("Logout");
        back.setBounds(30,30,68,30);
        back.setBorder(null);
        back.setBackground(Color.WHITE);
        back.setForeground(Color.BLACK);
        back.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        back.setFont(new Font("Times New Roman",Font.BOLD,18));
        bckgr.add(back);
        back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				new LoginPage().J.setVisible(true);
                                J.setVisible(false);
			}
		});*/

        
        J.setVisible(true);
        J.setSize(700,500);
        J.setLocation(50,100);
        bckgr.setBounds(0,0,700,500);
        J.setBackground(Color.WHITE);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            J.setVisible(false);
            new Add_Employee();
        }
        if(ae.getSource()==b2){
            J.setVisible(false);
            new View_Employee();
        }
        if(ae.getSource()==b3){
            J.setVisible(false);
            new Remove_Employee();
        }
        if(ae.getSource()==b4){
            J.setVisible(false);
            new Search_Employee();
        }
        if(ae.getSource()==ll) {
            new LoginPage().J.setVisible(true);
            J.setVisible(false);
        }
        if(ae.getSource()==vw) {
            J.setVisible(false);
            All_Employee ds = new All_Employee();
        }
    }
    public static void main(String[] args) {
        details dt = new details();
    }
    
}
