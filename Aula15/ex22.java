import java.util.Scanner;

public class ex22 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("-=-=-=-=-Sacolão-=-=-=-=-");
        System.out.println("-------------------------");

        System.out.print("Digite quantidade de MORANGO desejada: ");
        double quantMorango = scan.nextDouble();

        System.out.print("Digite a quantidade de MAÇA desejada: ");
        double quantMaca = scan.nextDouble();

        double precoMorango =0;
        double precoMaca = 0;

        if (quantMorango <=5 ){
            precoMorango =  2.50;
        }else{
            precoMorango =  2.20;
        }

        if (quantMaca <=5 ){
            precoMaca =  1.80;
        }else {
            precoMaca =  1.50;
        }

        double totMorango = precoMorango * quantMorango;
        double totMaca = precoMaca * quantMaca;
        double precoParcial = totMaca + totMorango;
        double precoTotal = precoParcial;


        System.out.println("Você comprou " + quantMorango + " quilos de MORANGO.");
        System.out.println("No valor de R$ " + totMorango);
        System.out.println();
        System.out.println("Você comprou " + quantMaca + " quilos de MAÇÃ.");
        System.out.println("No valor de " + totMaca);
        System.out.println();

        if(quantMorango + quantMaca > 8 || precoParcial > 25){
            double totDesc = (precoParcial * 10) / 100;
            precoTotal = precoParcial - totDesc;
            System.out.println("Você recebeu um desconto de 10% no valor de R$ " + totDesc);
        }

        System.out.println("O valor total da sua compra é de R$ " + precoTotal);




    }

}
/*
switch (resp){
            case 1:
                System.out.println("Você escolheu MORANGO.");
                System.out.print("Digite a quantidade desejada em quilos: ");
                quantMorango = scan.nextDouble();
                if (quantMorango <= 5){
                    precoMorango = (2.50 * quantMorango);
                    System.out.println("Você comprou " + quantMorango + " quilos de MORANGO.");
                    System.out.println("Totalizando um valor de R$ " + precoMorango);
                    break;
                } else if (quantMorango > 5 && quantMorango < 8) {
                    precoMorango = (2.20 * quantMorango);
                    System.out.println("Você comprou " + quantMorango + " quilos de MORANGO.");
                    System.out.println("Totalizando um valor de R$ " + precoMorango);
                    break;
                } else if (quantMorango > 8 || precoMorango > 25) {
                    precoMorango = (2.20 * quantMorango);
                    totDesconto = (precoMorango * 10) / 100;
                    System.out.println("Você comprou " + quantMorango + " quilos de MORANGO.");
                    System.out.println("Você ganhou um desconto de 10% no valor de R$ "+ totDesconto);
                    System.out.println("Totalizando um valor de R$ " + (precoMorango - totDesconto));
                    break;
                }
            case 2:
                System.out.println("Você escolheu MAÇA.");
                System.out.print("Digite a quantidade desejada em quilos: ");
                quantMaca = scan.nextDouble();
                if (quantMaca <= 5) {
                    precoMaca = (1.80 * quantMaca);
                    System.out.println("Você comprou " + quantMaca + " quilos de MAÇÃ.");
                    System.out.println("Totalizando um valor de R$ " + precoMaca);
                    break;
                } else if(quantMaca > 5 && quantMaca < 8){
                    precoMaca = (1.50 * quantMaca);
                    System.out.println("Você comprou " + quantMaca + " quilos de MAÇÃ.");
                    System.out.println("Totalizando um valor de R$ " + precoMaca);
                    break;
                } else if (quantMaca > 8) {
                    precoMaca = (1.50 * quantMaca);
                    totDesconto = (precoMaca * 10) / 100;
                    System.out.println("Você comprou " + quantMaca + " quilos de MAÇÃ.");
                    System.out.println("Você ganhou um desconto de 10% no valor de R$ "+ totDesconto);
                    System.out.println("Totalizando um valor de R$ " + (precoMaca - totDesconto));
                    break;
                }
            default: System.out.println("Opção inválida.");
        }
 */