package Aula40;

public class Teste {

    public static void main(String[] args){

        Pessoa pessoa = new Pessoa();

        Pessoa aluno  = new Aluno();

        Pessoa professsor = new Professor();

        pessoa.setEndereco("Rua 1, num 1");
        aluno.setEndereco("Rua 2, num 2");
        professsor.setEndereco("Rua 3, num 3");

        System.out.println(pessoa.obterEtiquetaEndereco());
        System.out.println(aluno.obterEtiquetaEndereco());
        System.out.println(professsor.obterEtiquetaEndereco());





    }
}
