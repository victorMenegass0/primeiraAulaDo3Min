/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

public class Enfermeiro extends Funcionario{
    private String coren;

    public String getCoren() {
        return coren;
    }

    public void setCoren(String coren) {
        this.coren = coren;
    }
    
    public double gerarBonus(){
        double bonus=calcularSalario()*0.10;
        return bonus;
    }
}
