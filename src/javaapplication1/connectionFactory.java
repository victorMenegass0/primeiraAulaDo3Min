package javaapplication1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectionFactory {
    public Connection getConnection(){
        try{
            return DriverManager.getConnection("jdbc:mysql://localhost:3307/hospital", "root", "usbw");
        }
        catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
}