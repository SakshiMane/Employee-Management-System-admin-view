package Employ;
import java.util.*;
import java.sql.*;
public class conn {
    public Connection c;
    public Statement s;
     conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","");
            s = c.createStatement();
            //System.out.println("Success");
        } catch(Exception e) {
            
            e.printStackTrace();
        }
    }
}