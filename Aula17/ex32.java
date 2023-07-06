import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;

public class ex32 {
    public static void main(String [] args) {

        Scanner scan = new Scanner(System.in);

        boolean naoTerminar = true;
        System.out.println("Produto            Código       Preço");
        System.out.println("Cachorro quente    100          R$1,20");
        System.out.println("Bauru Simples      101          R$1,30");
        System.out.println("Bauru com ovo      102          R$1,50");
        System.out.println("Hamburguer         103          R$1,20");
        System.out.println("Cheeseburguer      104          R$1,30");
        System.out.println("Refrigerante       105          R$1,00");
        System.out.println();
        double preco = 0;
        int cod, quant;
        String output = "";


        do {
            System.out.print("Digite o código do produto desejado: (Digite 00 para sair) ");
            cod = scan.nextInt();

            System.out.print("Digite a quantidade desejada: (Digite 0 para sair) ");
            quant = scan.nextInt();

            if (cod == 0){
                naoTerminar = false;
                output += "Total a pagar: R$ " + preco;
            } else {
                switch (cod){
                    case 100:
                        output += "Cachorro quente -> R$ 1,20 x " + quant;
                        output += " = R$ " + (1.20 * quant) + "\n";
                        preco += 1.20 * quant;
                        break;
                    case 101:
                        output += "Bauru simples -> R$ 1,30 x " + quant;
                        output += " = R$ " + (1.30 * quant) + "\n";
                        preco += 1.30 * quant;
                        break;
                    case 102:
                        output += "Bauru com ovo -> R$ 1,50 x " + quant;
                        output += " = R$ " + (1.50 * quant) + "\n";
                        preco += 1.50 * quant;
                        break;
                    case 103:
                        output += "Hamburguer -> R$ 1,20 x " + quant;
                        output += " = R$ " + (1.20 * quant) + "\n";
                        preco += 1.20 * quant;
                        break;
                    case 104:
                        output += "Cheeseburguer -> R$ 1,30 x " + quant;
                        output += " = R$ " + (1.30 * quant) + "\n";
                        preco += 1.30 * quant;
                        break;
                    case 105:
                        output += "Refrigerante -> R$ 1,00 x " + quant;
                        output += " = R$ " + (1 * quant) + "\n";
                        preco += 1 * quant;
                        break;
                    default: System.out.println("Entrada inválida");
                }
            }
        } while (naoTerminar);
        System.out.println(output);
    }
}
