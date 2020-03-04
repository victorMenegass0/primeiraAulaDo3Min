package prjHospital;

import java.sql.Connection;
import javax.swing.JOptionPane;
import model.ConnectionFactory1;

public class prjHospital {
    public static void main(String[] args) {
        try{
             Connection con= new ConnectionFactory1().getConnection();    
            JOptionPane.showMessageDialog(null, "conectado ao banco");
            con.close();
        }
        catch (Exception e){
            JOptionPane.showConfirmDialog(null, e);
        }
    }
    
}
