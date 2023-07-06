package Aula45;

public class Teste {

    public static void main(String[] args) {

        /*Aluno aluno = new Aluno();
        Aluno pessoaAluno = aluno; // upcasting

        Pessoa aluno2 = (Pessoa) new Aluno();

        Pessoa aluno3 = new Pessoa();
        Aluno aluno4 = (Aluno) aluno3;*/

        Pessoa pessoa = new Pessoa();
        Aluno aluno  = new Aluno();
        Professor professor = new Professor();

        if (pessoa instanceof Pessoa){
            System.out.println("é do tipo Pessoa");
        }
        if (aluno instanceof Aluno){
            System.out.println("é do tipo Aluno");
        }
        if (professor instanceof Professor){
            System.out.println("é do tipo Professor");
        }


    }



}
