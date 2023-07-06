package Aula27;

public class Aluno {

    String nome;
    int matricula;
    String curso;
    String[] disciplinas = new String[3];;
    double[][] notas = new double[3][4];

    void mostrarInfo(){
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Curso do aluno: " + curso);
        System.out.println("Matrícula do aluno: " + matricula);

        for (int i = 0; i < notas.length; i++){
            System.out.print("Notas da disciplina " + disciplinas[i] + ": ");
            for (int j = 0; j < notas[i].length; j++ ){
                System.out.print(notas[i][j] + " ");
            }
            System.out.println();
            System.out.print("Média: "+ obterMedia(i) + " ");
            System.out.println();
            System.out.print("Situação: ");
            verificaMedia(i);
            System.out.println();
        }
    }

    double obterMedia(int indice){
        double soma = 0;
        for (int i= 0; i < notas[indice].length; i++){
            soma += notas[indice][i];

        }
        double media = soma / 4;

        return  media;
    }

    void verificaMedia (int indice){

        if (obterMedia(indice) >= 7){
            System.out.println("Aprovado.");
        }else{
            System.out.println("Reprovado.");
        }
    }



}
