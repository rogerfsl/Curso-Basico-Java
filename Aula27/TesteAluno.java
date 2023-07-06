package Aula27;

import java.util.Scanner;

public class TesteAluno {
    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        Aluno aluno1 = new Aluno();

        aluno1.nome = "Welson";
        aluno1.matricula = 123;
        aluno1.curso = "Analise e Desenvolvimento de sistemas";

        for (int i = 0; i < aluno1.disciplinas.length; i++) {
            System.out.print("Digite o nome da disciplina " + (i+1) + ": " );
            aluno1.disciplinas[i] = scan.next();
        }

        for (int i = 0; i < aluno1.notas.length; i++){
            System.out.println("Obtendo notas da disciplina " +  aluno1.disciplinas[i]);
            for (int j = 0; j < aluno1.notas[i].length; j++){
                System.out.print("Digite a " + ( j+ 1) + "ª nota: ");
                aluno1.notas[i][j] = scan.nextDouble();
            }
        }
        aluno1.mostrarInfo();


    }
}
