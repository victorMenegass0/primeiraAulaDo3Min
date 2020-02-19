
package javaapplication1;

public class Funcionario extends Pessoa{
    private int matricula;
    private String senha;
    private double valorHora;
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    public double calcularSalario(){
        return valorHora*72;
    }
    public double calcularSalario(double descontos){
        return (valorHora*72)-descontos;
    }
    public double gerarBonus(){
    return 1;
    }

    
}
