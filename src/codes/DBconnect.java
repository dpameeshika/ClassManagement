
package codes;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class DBconnect {
    public static Connection connect()
    {
        Connection con = null;
        
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/student1","root","");
        
        }
        
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        
        }
        return con;
    
    }
}
