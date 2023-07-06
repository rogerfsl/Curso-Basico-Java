import java.util.Scanner;

public class ex21 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Posto de abastecimento");
        System.out.println("-------------------------");
        System.out.println("Digite 1 para Álcool \n" +
                "Digite 2 para Gasolina");
        int resp = scan.nextInt();

        double descAlcool = 0;
        double descGas = 0;
        double quantidade = 0;
        double preco = 0;

        if (resp == 1){
            System.out.print("Você escolheu ÁLCOOL. Agora digite a quantidade escolhida: ");
            quantidade = scan.nextDouble();
            if (quantidade <= 20){
                descAlcool = ((1.90 * quantidade) * 3 )/ 100;
                preco = (1.90 * quantidade) - descAlcool;
                System.out.println("Quantidade escolhida: " + quantidade  +" Litros.");
                System.out.println("Preço a pagar sem desconto: R$ " + 1.90 * quantidade);
                System.out.println("Desconto de 3% no valor de: R$ " + descAlcool);
                System.out.println("Total a pagar: R$ " + preco);
            } else if (quantidade > 20) {
                descAlcool = ((1.90 * quantidade) * 5 )/ 100;
                preco = (1.90 * quantidade) - descAlcool;
                System.out.println("Quantidade escolhida: " + quantidade  +" Litros.");
                System.out.println("Preço a pagar sem desconto: R$ " + 1.90 * quantidade);
                System.out.println("Desconto de 5% no valor de: R$ " + descAlcool);
                System.out.println("Total a pagar: R$ " + preco);
            }
        } else if (resp == 2){
            System.out.println("Você escolheu GASOLINA. Agora digite a quantidade escolhida: ");
            quantidade = scan.nextDouble();
            if(quantidade <= 20){
                descGas = ((2.50 * quantidade) * 4 )/ 100;
                preco = (2.50 * quantidade) - descGas;
                System.out.println("Quantidade escolhida: " + quantidade  +" Litros.");
                System.out.println("Preço a pagar sem desconto: R$ " + 2.50 * quantidade);
                System.out.println("Desconto de 4% no valor de: R$ " + descGas);
                System.out.println("Total a pagar: R$ " + preco);
            } else if (quantidade > 20) {
                descGas = ((2.50* quantidade) * 6 )/ 100;
                preco = (2.50 * quantidade) - descGas;
                System.out.println("Quantidade escolhida: " + quantidade  +" Litros.");
                System.out.println("Preço a pagar sem desconto: R$ " + 2.50 * quantidade);
                System.out.println("Desconto de 6% no valor de: R$ " + descGas);
                System.out.println("Total a pagar: R$ " + preco);

            }
        }


    }
}
