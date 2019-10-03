package database_console; 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.


package database_console;
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
/**
 *
 * @author DUTCHESS
 */
public class DBConnect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       try {  String host="jdbc:derby://localhost:1527/users";
        String username = "use12345";
        String password ="use12345";
        String SQL = "SELECT * FROM users";
        Connection con = DriverManager.getConnection( host, username, password );
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery( SQL );
   while ( rs.next( ) ) {        
  
int id_col = rs.getInt("SERIAL");
String first_name = rs.getString("FIRST_NAME");
String last_name = rs.getString("LAST_NAME");
String email = rs.getString("EMAIL");
System.out.println( id_col + " " + first_name + " " + last_name + " " + email );
} 
       
       }
catch ( SQLException err ) {
System.out.println( err.getMessage( ) );
}
        
        
    }
    
}
