import java.util.Scanner;

public class ex23 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o tipo de carde desejada: ");
        System.out.println("1 - Filé duplo");
        System.out.println("2 - Alcatra");
        System.out.println("3 - Picanha");
        int resp = scan.nextInt();

        System.out.println("Digite a quantidade desejada em quilos: ");
        double quant = scan.nextDouble();

        double precoKg = 0;
        double totDesc = 0;

        switch (resp){
            case 1:
                System.out.println("Você escolheu " + quant + " quilos de Filé duplo" );
                if (quant <= 5){
                    precoKg = 4.90;
                }else {
                    precoKg = 5.80;
                }
                break;
            case 2:
                System.out.println("Você escolheu " + quant + " quilos de Alcatra" );
                if (quant <= 5){
                    precoKg = 5.90;
                }else {
                    precoKg = 6.80;
                }
                break;
            case 3:
                System.out.println("Você escolheu " + quant + " quilos de Picanha" );
                if (quant <= 5){
                    precoKg = 6.90;
                }else {
                    precoKg = 7.80;
                }
                break;
            default: System.out.println("Opção inválida!" );
        }
        double precoParcial = precoKg * quant;
        double precoTotal = precoParcial;

        System.out.println("Digite a forma de pagamento: ");
        System.out.println("Digite 1 para cartão Tabajara \n" +
                "Digite 2 para dinheiro");
        int opc = scan.nextInt();
        System.out.println();
        if(opc == 1){
            totDesc = (precoTotal * 5) / 100;
            precoTotal = precoTotal - totDesc;
            System.out.println("Você recebeu 5% de desconto no valor de R$" + totDesc);
            System.out.println("Valor a pagar R$ " + precoTotal);
        } else if (opc == 2) {
            System.out.println("Valor a pagar R$ " + precoTotal);
        }


    }
}
