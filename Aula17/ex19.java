import java.util.Scanner;

public class ex19 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a quantidade de notas que deseja: ");
        int quant = scan.nextInt();
        double notas;
        double somaNotas = 0;
        int i;

        for (i = 0; i < quant; i++){
            System.out.print("Digite a " + (i+1) + "º nota: " );
            notas = scan.nextDouble();
            somaNotas += notas;
        }
        double media = somaNotas / quant;

        System.out.println("A média das notas é: " + media);
    }
}
