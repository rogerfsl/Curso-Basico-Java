import java.text.DecimalFormat;
import java.util.Scanner;

public class ex20 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        double[] vetorA = new double[3];
        double cotacao;

        System.out.print("Digite a cotação atual do dólar: ");
        cotacao = scan.nextDouble();

        for (int i =0; i < vetorA.length; i++){
            vetorA[i] = cotacao * (i + 1);
        }

        DecimalFormat df = new DecimalFormat("####,####.##");

        System.out.println();
        System.out.print("Vetor A = ");
        for (double i:vetorA){
            System.out.print(df.format(i) + " ");
        }

    }
}
