import java.util.Scanner;

public class ex23 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        double preco = 1.99;
        double soma = preco;
        int cont = 1;

        System.out.print("Digite a quantidade de produtos que deseja: ");
        int quant = scan.nextInt();

        System.out.println("Lojas quase dois - Tabela de preços.");

        while (cont <= quant){
            System.out.println(cont + "º - R$ " + soma);
            soma += preco;
            cont ++;

        }

        /*for(int i = 1; i <= 50;  i ++){
            System.out.println(i + "º - " + " R$ " + soma);
            soma += preco;
        }*/
    }
}
