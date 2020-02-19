
package javaapplication1;

public class JavaApplication1 {

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        f1.setCpf("123.454.789-10");
        f1.setNome("vitin");
        f1.setIdade(12);
        f1.setRg("1234124231423151");
        f1.setSenha("abc");
        f1.setMatricula(4758940);
        
        System.out.println("nome do funcionario "+f1.getNome());
        System.out.println("rg do funcionario "+f1.getRg());
        System.out.println("cpf do funcionario "+f1.getCpf());
        System.out.println("idade do funcionario "+f1.getIdade());
        System.out.println("matricula do funcionario "+f1.getMatricula());
        System.out.println("senha do funcionario "+f1.getSenha());
        
        Paciente p1= new Paciente();
        p1.setNome("joao");
        p1.setCpf("12315325345634");
        p1.setRg("123124230");
        p1.setIdade(12);
        p1.setSenha("dasdaafaf");
        p1.setCodPaciente(12312314);
        
        System.out.println("nome do paciente "+p1.getNome());
        System.out.println("cpf do paciente "+p1.getCpf());
        System.out.println("rg do paciente "+p1.getRg());
        System.out.println("idade do paciente "+p1.getIdade());
        System.out.println("senha do paciente "+p1.getSenha());
        System.out.println("cod do paciente "+p1.getCodPaciente());
        
        Enfermeiro e1 = new Enfermeiro();
        e1.setNome("jota");
        e1.setCpf("231435245345");
        e1.setRg("1231543252435");
        e1.setIdade(14);
        e1.setCoren("djlhgfkçsdghfdljkgjgvbjdfjkvbhflçihvhjsfjlhvjsfcbnfd~çobvjhfubfdshjvbdsj");
        e1.setMatricula(523345345);
        e1.setSenha("sdfasfsdf");
      
        
        System.out.println("salario com desconto"+ e1.calcularSalario(10));
        System.out.println("nome do enfermeiro "+e1.getNome());
        System.out.println("cpf do enfermeiro "+e1.getCpf());
        System.out.println("rg do enfermeiro "+e1.getRg());
        System.out.println("idade do enfermeiro "+e1.getIdade());
        System.out.println("matricula do enfermeiro "+e1.getMatricula());
        System.out.println("senha do enfermeiro "+e1.getSenha());
        System.out.println("coren do enfermeiro "+e1.getCoren());
        
        Medico m1= new Medico();
        m1.setNome("jotinha");
        m1.setCpf("sfdafsdfsdf");
        m1.setRg("13424234");
        m1.setIdade(16);
        m1.setMatricula(213414321);
        m1.setSenha("luala");
        m1.setCrm("32142345");
        m1.setEspecialidade("oftalmoligista");
       
        System.out.println("salario com desconto: "+m1.calcularSalario(10));
        System.out.println("nome do medico "+m1.getNome());
        System.out.println("cpf do medico "+m1.getCpf());
        System.out.println("rg do medico "+m1.getRg());
        System.out.println("idade do medico "+m1.getIdade());
        System.out.println("matricula do medico "+m1.getMatricula());
        System.out.println("senha do medico "+m1.getSenha());
        System.out.println("crm do medico "+m1.getCrm());
        System.out.println("especialidade do medico "+m1.getEspecialidade());
        System.out.println("bonus de salario "+m1.gerarBonus());
        
        Hospital h1 = new Hospital();
        
        h1.Hospital("santa casa da rosinha", 12314, "atras do outro hospital");
        h1.listarTodosFuncionarios();
        h1.listarMedicos();
        h1.listarEnfeirmeiros();
        
        System.out.println("nome do hospital "+h1.getNome());
        System.out.println("endereco"+ h1.getEndereco());
        System.out.println("identificaçao "+h1.getIdHospital());
        
        ProntoSocorro ps1 = new ProntoSocorro();
        
        ps1.ProntoSocorro(123123, h1, "sla onde");
        
        System.out.println("identidicaçao "+ps1.getIdFilial());
        System.out.println("matriz "+ps1.getMatriz());
        System.out.println("endereço " + ps1.getEndereco());
        
        
        
    }
    
}
