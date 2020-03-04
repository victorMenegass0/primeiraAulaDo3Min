
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory1 {
    public Connection getConnection(){
        try{
            return DriverManager.getConnection("jdbc:mysql://localhost:3307/db_saude", "root", "usbw");
        }
        catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
}
