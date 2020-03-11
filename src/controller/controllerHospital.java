package controller;

import java.util.ArrayList;
import model.Hospital;
import model.hospitalDAO;

public class controllerHospital {
    public void CadastrarHospital(Hospital hospital){
        hospitalDAO hDAO = new hospitalDAO();
        hDAO.cadastrar(hospital);
    }
    public ArrayList<Hospital> listarHospital(){
        hospitalDAO hDAO = new hospitalDAO();
        return hDAO.buscar();
    }
}
