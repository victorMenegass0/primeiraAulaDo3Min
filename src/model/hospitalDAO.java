package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class hospitalDAO {
    private Connection con = new ConnectionFactory1().getConnection();
    
    public void cadastrar(Hospital hosp){
        try{
            String query= "insert into tb_hospital(nm_hospital, ds_endereco) values (?, ?)";
            
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setString (1, hosp.getNome());
            preparedStmt.setString (2, hosp.getEndereco());
            
            con.close();
        } 
        catch(Exception e){
            
        }
    }
    public ArrayList<Hospital> buscar(){
        ArrayList<Hospital> ah = new ArrayList();
        try{
            String query = "select * from tb_hospital";
            PreparedStatement preparedStmt = con.prepareStatement(query);
            ResultSet rs = preparedStmt.executeQuery(query);
            
            while(rs.next()){
                Hospital h = new Hospital(rs.getString("nm_hospital"));
                h.setIdHospital(rs.getInt("id_hospital"));
                
                ah.add(h);
                
            }
            con.close();
        }catch(Exception e){
            
        }
        return ah;
    }
}
