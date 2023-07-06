import java.util.Scanner;

public class ex25 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Lojas Tabajara");

        boolean sair = false;
        String continuarCompra;
        int quantProd;
        double preco ;
        double total = 0;
        String output;
        double valor, troco;

        do {
            System.out.print("Deseja informar uma nova compra? [S | N] ");
            continuarCompra = scan.next();
            if(continuarCompra.equalsIgnoreCase("s")){

                output = "Supermercado Tabajara\n";

                System.out.print("Digite a quantidade de produtos da compra: ");
                quantProd = scan.nextInt();

                for (int i = 1; i <= quantProd; i++){
                    System.out.print("Digite o valor do " + i + "º produto R$ ");
                    preco = scan.nextDouble();
                    total += preco;
                    output += "Produto " + i + ": R$ " + preco + "\n";
                }
                output += "Total: R$ " + total + "\n";
                System.out.println("Total: R$ " + total);

                System.out.print("Entre com o valor pago: R$ ");
                valor = scan.nextDouble();

                output += "Dinheiro: R$ " + valor + "\n";

                troco = valor - total;

                output += "Troco: R$ " + troco;

                System.out.println(output);
            }else{
                sair = true;
            }

        }while (!sair);
        System.out.println("Muito obrigado. Volte sempre.");
    }
}


       /*do{
           System.out.print("Digite o valor do "+ cont + "º produto: ");
           valor = scan.nextDouble();
           soma += valor;
           cont ++;
       }while (valor != 0);
           System.out.println("Muito obrigado e volte sempre");

       System.out.println("Total da compra R$ " + soma);
       System.out.print("Valor pago em dinheiro R$ ");
       double pag = scan.nextDouble();
       System.out.println("Valor pago em dinheiro R$ " + pag);
       System.out.println("Total de troco R$ " + (pag - soma));
    */