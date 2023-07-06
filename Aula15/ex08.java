import java.util.Scanner;

public class ex08 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor do 1º produto em reais: R$ ");
        double p1 = scan.nextDouble();

        System.out.print("Digite o valor do 2º produto em reais: R$ ");
        double p2 = scan.nextDouble();

        System.out.print("Digite o valor do 3º produto em reais: R$ ");
        double p3 = scan.nextDouble();

        double menor = p1;

        if (p2 < p1 && p2 < p3){
            menor = p2;
            System.out.println("Você deve comprar o 2º produto que custa R$ " + menor);
        } else if (p3 < p1 && p3 < p2) {
            menor = p3;
            System.out.println("Você deve comprar o 3º produto que custa R$ " + menor);
        } else{
            System.out.println("Você deve comprar o 1º produto que custa R$ " + menor);
        }
    }
}
