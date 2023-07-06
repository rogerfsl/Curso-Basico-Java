import java.util.Scanner;

public class aula20Parte3 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o número de pessoas que serão entrevistadas: ");
        int numEntrevistados = scan.nextInt();
        int qtdFilhos;

        String [][] nomesFIlhos = new String[numEntrevistados][];

        for (int i = 0;i < nomesFIlhos.length; i++){
            System.out.print("Digite a quantidade de filhos(as) que tem o entrevistado número " + (i+1) + ": ");
            qtdFilhos = scan.nextInt();

            nomesFIlhos[i] = new String[qtdFilhos];

            for (int j = 0; j< nomesFIlhos[i].length; j++){
                System.out.print( "Digite o nome do filho " + (j+1) + ": ");
                nomesFIlhos[i][j] = scan.next();
            }
        }
        for (int i = 0;i < nomesFIlhos.length; i++){
            System.out.println("Pessoa " + (i+1) +" tem " + nomesFIlhos[i].length + " filhos.");
            for (int j = 0; j< nomesFIlhos[i].length; j++) {
                System.out.println(nomesFIlhos[i][j]);
            }
        }
    }
}
