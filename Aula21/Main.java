import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int [] notas = new int[10];
        Random aleatorio = new Random();

        for (int i = 0; i< notas.length; i++){
            notas[i] = aleatorio.nextInt(11);
        }

        for(int nota: notas){
            System.out.print(nota + " ");
        }

        int [][] notasAlunos = new int[3][4];
        System.out.println();

        for (int i = 0; i < notasAlunos.length; i++){
            for (int j = 0; j < notasAlunos[i].length; j++){
                System.out.print("Digite a " +(j+1) + "ª nota do aluno " + (i+1) + ": ");
                notasAlunos[i][j] = scan.nextInt();
            }
        }

        for(int [] notasAluno: notasAlunos){
            for(int nota : notasAluno){
                System.out.print(nota + " ");
            }
            System.out.println();
        }

    }
}