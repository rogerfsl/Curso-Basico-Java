package Aula36;

import java.util.Scanner;

public class ex02 {

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com o nome do curso: ");
        String nome = scan.nextLine();

        System.out.print("Entre com o horário do curso: ");
        String horario = scan.nextLine();

        System.out.print("Entre com o nome do professor: ");
        String nomeProf = scan.nextLine();

        System.out.print("Entre com o departamento do professor: ");
        String departProf = scan.nextLine();

        System.out.print("Entre com o email do professor: ");
        String emailProf = scan.nextLine();

        Curso curso = new Curso();

        curso.setNome(nome);
        curso.setHora(horario);

        Professor professor = new Professor();
        professor.setNome(nomeProf);
        professor.setDepartamento(departProf);
        professor.setEmail(emailProf);

        curso.setProfessor(professor);

        System.out.println("-=--=--=-ALUNO-=--=--=-");

        Aluno[] alunos = new Aluno[5];
        for (int i = 0; i < alunos.length; i++){

            scan.nextLine();

            System.out.print("Digite o nome do " + (i+1) + "º aluno(a): ");
            String nomeAluno = scan.nextLine();

            System.out.print("Digite a matricula do " + (i+1) + "º aluno(a): ");
            String matAluno = scan.nextLine();

            double[] notas = new double[4];

            for (int j = 0; j < 4; j++){
                System.out.print("Digite a " + (j+1) + "ª nota: ");
                notas[j] = scan.nextDouble();
            }

            Aluno aluno = new Aluno();
            aluno.setNome(nomeAluno);
            aluno.setMatricula(matAluno);
            aluno.setNotas(notas);

            alunos[i] = aluno;

        }
        curso.setAlunos(alunos);

    }
}
