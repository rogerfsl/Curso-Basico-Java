import java.util.Scanner;

public class ex18 {

    public static void main(String[] arg) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o tamanho do arquivo que deseja efetuar o download em megabytes: ");
        double tamArquivo = scan.nextDouble();

        System.out.print("Digite a velocidade da internet usada em megabytes: ");
        int velInternet = scan.nextInt();

        double tempo = tamArquivo / velInternet;

        System.out.printf("Temnpo de download: " + tempo);

    }
}