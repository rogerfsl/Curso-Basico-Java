import java.util.Scanner;

public class aula14 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor do produto: R$");
        double valorProd = scan.nextDouble();

        if (valorProd <= 10){
            System.out.println("O preço está ótimo. Pode comprar!");
        } else if (valorProd > 10 && valorProd < 15) {
            System.out.println("O preço está razoável, você pode pedir um desconto.");
        } else if (valorProd >= 15 && valorProd < 17) {
            System.out.println("O preço está caro, você deve pesquisar mais.");
        }else {
            System.out.println("Preço fora do comum.");
        }
    }
}
 /*System.out.print("Digite a sua idade: ");
        int idade = scan.nextInt();

        if (idade >= 18){
            System.out.println("É maior de idade");
        } else {
            System.out.println("Não é maior de idade");
        }*/