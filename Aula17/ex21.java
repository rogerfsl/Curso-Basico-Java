import javax.swing.table.TableRowSorter;
import java.util.Scanner;

public class ex21 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a quantidade de turmas: ");
        int quantTurma = scan.nextInt();

        int quantAluno;
        int somaAluno = 0;
        boolean invalido = false;


        for(int i = 1; i <= quantTurma; i++){

            invalido = false;

            do{
                System.out.print("Digite a quantidade de alunos da " + i + "ª turma: ");
                quantAluno = scan.nextInt();
                if (quantAluno <= 40){
                    invalido = true;
                }else{
                    System.out.println("A turma não pode ter mais de 40 alunos.");
                }
            }while (!invalido);
            somaAluno += quantAluno;
        }
        double media = somaAluno / quantTurma;
        System.out.println("A média de alunos das turmas é : " + media);

    }
}
