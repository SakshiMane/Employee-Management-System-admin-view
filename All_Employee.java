package Employ;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;
class All_Employee {
    JFrame J;
    JLabel ol;
    JScrollPane scrollPane;
    JTable table;
    JButton gd,back;
    All_Employee() {
        ArrayList columnNames = new ArrayList();
        ArrayList data = new ArrayList();
        J=new JFrame("All Employee");
        J.setLayout(null);
        J.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        J.getContentPane().setBackground(Color.decode("#ff99ff"));
        ol=new JLabel("Details");
        ol.setBounds(300,9,160,30);
        ol.setFont(new Font("Times new roman",Font.BOLD,35));
        ol.setForeground(Color.black);
        J.add(ol);
        
        Icon ic = new ImageIcon("C:\\Users\\dell 3521\\Desktop\\mini projects\\mini project 1B\\EmployeeManagement\\src\\main\\java\\Employ\\icons\\arw.png");
        back=new JButton(ic);
        back.setBounds(5,4,40,40);
        back.setBorder(null);
        back.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        back.setFont(new Font("serif",Font.BOLD,18));
        back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				new details().J.setVisible(true);
                                J.setVisible(false);
			}
		});
        J.add(back);
        try {
            conn con = new conn();
            String sq = "SELECT fname,lname,address,phone,email,position,employee_id FROM employeedata";
            ResultSet rs = con.s.executeQuery(sq);
            ResultSetMetaData md = rs.getMetaData();
            int columns = md.getColumnCount();
            for (int i = 1; i <= columns; i++)
            {
                columnNames.add( md.getColumnName(i) );
            }            
            while (rs.next())
            {
                ArrayList row = new ArrayList(columns);

                for (int i = 1; i <= columns; i++)
                {
                    row.add( rs.getObject(i) );
                }

                data.add( row );
            }
        }
        catch (SQLException e)
        {
            System.out.println( e.getMessage() );
        }
        Vector columnNamesVector = new Vector();
        Vector dataVector = new Vector();

        for (int i = 0; i < data.size(); i++)
        {
            ArrayList subArray = (ArrayList)data.get(i);
            Vector subVector = new Vector();
            for (int j = 0; j < subArray.size(); j++)
            {
                subVector.add(subArray.get(j));
            }
            dataVector.add(subVector);
        }

        for (int i = 0; i < columnNames.size(); i++ )
            columnNamesVector.add(columnNames.get(i));

        //  Create table with database data    
        table = new JTable(dataVector, columnNamesVector)
        {
            public Class getColumnClass(int column)
            {
                for (int row = 0; row < getRowCount(); row++)
                {
                    Object o = getValueAt(row, column);

                    if (o != null)
                    {
                        return o.getClass();
                    }
                }

                return Object.class;
            }
        };
        TableColumnModel columnModel = table.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(50);
        columnModel.getColumn(1).setPreferredWidth(50);
        columnModel.getColumn(2).setPreferredWidth(160);
        columnModel.getColumn(3).setPreferredWidth(60);
        columnModel.getColumn(4).setPreferredWidth(140);
        columnModel.getColumn(5).setPreferredWidth(55);
        columnModel.getColumn(6).setPreferredWidth(60);
        table.setRowHeight(23);
        table.setBounds(5,40,695,300);
        scrollPane = new JScrollPane(table);
        scrollPane.setBackground(Color.CYAN);
        scrollPane.setBounds(0,50,695,400);
        scrollPane.setPreferredSize(new Dimension(700, 300));
        scrollPane.getViewport().setBackground(Color.WHITE);
        J.add(scrollPane);

       
        J.setSize(710, 510);
        J.setLocation(50, 100);
        J.setVisible(true);
    }  
    public static void main(String[] args) {
        All_Employee frame = new All_Employee();
    }
    
}
/*
public class TableFromMySqlDatabase extends JFrame
{
    public TableFromMySqlDatabase()
    {
        ArrayList columnNames = new ArrayList();
        ArrayList data = new ArrayList();

        //  Connect to an MySQL Database, run query, get result set
        String url = "jdbc:mysql://localhost:3306/yourdb";
        String userid = "root";
        String password = "sesame";
        String sql = "SELECT * FROM animals";

        // Java SE 7 has try-with-resources
        // This will ensure that the sql objects are closed when the program 
        // is finished with them
        try (Connection connection = DriverManager.getConnection( url, userid, password );
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery( sql ))
        {
            ResultSetMetaData md = rs.getMetaData();
            int columns = md.getColumnCount();

            //  Get column names
            for (int i = 1; i <= columns; i++)
            {
                columnNames.add( md.getColumnName(i) );
            }

            //  Get row data
            while (rs.next())
            {
                ArrayList row = new ArrayList(columns);

                for (int i = 1; i <= columns; i++)
                {
                    row.add( rs.getObject(i) );
                }

                data.add( row );
            }
        }
        catch (SQLException e)
        {
            System.out.println( e.getMessage() );
        }

        // Create Vectors and copy over elements from ArrayLists to them
        // Vector is deprecated but I am using them in this example to keep 
        // things simple - the best practice would be to create a custom defined
        // class which inherits from the AbstractTableModel class
        Vector columnNamesVector = new Vector();
        Vector dataVector = new Vector();

        for (int i = 0; i < data.size(); i++)
        {
            ArrayList subArray = (ArrayList)data.get(i);
            Vector subVector = new Vector();
            for (int j = 0; j < subArray.size(); j++)
            {
                subVector.add(subArray.get(j));
            }
            dataVector.add(subVector);
        }

        for (int i = 0; i < columnNames.size(); i++ )
            columnNamesVector.add(columnNames.get(i));

        //  Create table with database data    
        JTable table = new JTable(dataVector, columnNamesVector)
        {
            public Class getColumnClass(int column)
            {
                for (int row = 0; row < getRowCount(); row++)
                {
                    Object o = getValueAt(row, column);

                    if (o != null)
                    {
                        return o.getClass();
                    }
                }

                return Object.class;
            }
        };

        JScrollPane scrollPane = new JScrollPane( table );
        getContentPane().add( scrollPane );

        JPanel buttonPanel = new JPanel();
        getContentPane().add( buttonPanel, BorderLayout.SOUTH );
    }

    public static void main(String[] args)
    {
        TableFromMySqlDatabase frame = new TableFromMySqlDatabase();
        frame.setDefaultCloseOperation( EXIT_ON_CLOSE );
        frame.pack();
        frame.setVisible(true);
    }
}
*/