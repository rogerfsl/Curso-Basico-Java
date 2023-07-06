import java.util.Scanner;

public class ex22 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a quantidade de CD's que você tem em sua coleção: ");
        int quant = scan.nextInt();
        double valor, soma = 0;

        for (int i = 1; i <= quant; i++){
            System.out.print("Digite o valor do " + i + "º CD em reais R$ ");
            valor = scan.nextDouble();
            soma += valor;

        }
        double media = soma / quant;
        System.out.println("O valor médio de cada CD em sua coleção é de R$ " + media);
    }
}
