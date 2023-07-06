package Aula33;

import java.util.Scanner;

public class ex03 {
    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Welson");
        aluno1.setMatricula(123);
        aluno1.setCurso("Analise e Desenvolvimento de sistemas");



        for (int i = 0; i < aluno1.getDisciplinas().length; i++) {
            System.out.print("Digite o nome da disciplina " + (i+1) + ": " );
            aluno1.setDisciplinaPos(i, scan.next());
        }

        for (int i = 0; i < aluno1.getNotas().length; i++){
            System.out.println("Obtendo notas da disciplina " +  aluno1.getDisciplinas()[i]);
            for (int j = 0; j < aluno1.getNotas()[i].length; j++){
                System.out.print("Digite a " + ( j+ 1) + "ª nota: ");
                aluno1.setNomePosIJ(i, j, scan.nextDouble());
            }
        }
        aluno1.mostrarInfo();


    }

}
