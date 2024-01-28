package baocaopizza.java;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
import java.sql.*;

public class KetNoi {
    String urlConnection = "jdbc:sqlserver://localhost:1433;" + "database=PIZZA;encrypt=false;username=sa;password=hieudz01082003";
    Connection conn;
    Statement st;
    PreparedStatement prst;
    
    
    public KetNoi()
    {
        try {
            // nap trinh dieu khien 
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
            // tao ket noi 
            conn = DriverManager.getConnection(urlConnection);
            System.out.println("Ket noi ok");
        }
        catch(ClassNotFoundException cl)
        {           
        }
        catch(SQLException sql)
        {          
        }
        
    }
    
    public ResultSet LayDuLieu(String query)
    {
        try {
            ResultSet rs;
            // tao doi tuong statement
            st = conn.createStatement();
            
            rs = st.executeQuery(query);
            
            return rs;
        }
        catch (SQLException sqle){
            return null;
        }    
    }
    
    public Boolean ThucThi(String query)
    {
        try {
            // tao doi tuong prepareCall bang connection
            prst = conn.prepareCall(query);
            
            int r = prst.executeUpdate();
            
            return r > 0;
        }
        catch(SQLException sql) {
            return false;
        }
    } 
}


