
package model;

public class Paciente extends Pessoa{
   private int codPaciente;
   private String senha;

    public int getCodPaciente() {
        return codPaciente;
    }

    public void setCodPaciente(int codPaciente) {
        this.codPaciente = codPaciente;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
