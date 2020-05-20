package prjHospital;

import java.sql.Connection;
import javax.swing.JOptionPane;
import model.ConnectionFactory1;
import view.cadastrarHospital;
import view.cadastroPaciente;
import view.cadastraProntoSocorro;

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
        
        cadastrarHospital cadh = new cadastrarHospital();
        cadh.setVisible(true);
        
        cadastroPaciente cp = new cadastroPaciente();
        cp.setVisible(true);
        
        cadastraProntoSocorro ps = new cadastraProntoSocorro();
        ps.setVisible(true);
        
    }
    
}
