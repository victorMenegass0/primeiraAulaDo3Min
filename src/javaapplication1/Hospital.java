package javaapplication1;
import java.util.ArrayList; 

public class Hospital {
   private String nome;
   private int idHospital;
   private ArrayList<Funcionario> funcionarios = new ArrayList<>();
   private String endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdHospital() {
        return idHospital;
    }

    public void setIdHospital(int idHospital) {
        this.idHospital = idHospital;
    }

    public void listarTodosFuncionarios() {
        for (Funcionario f: funcionarios){
            System.out.println("nome: "+f.getNome());
        }
    }

    public void addFuncionarios(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void Hospital(String end, int id){
        System.out.println("identificaçao do hospital: "+id+" endereço: "+end);
    }
    public void listarMedicos(){
         for (Funcionario f: funcionarios){
            if(f instanceof Medico){
                System.out.println("nome: "+f.getNome());
            }
        }
    }
    public void listarEnfeirmeiros(){
         for (Funcionario f: funcionarios){
            if(f instanceof Enfermeiro){
                System.out.println("nome: "+f.getNome());
            }
        }
    }
   
   
   
}
