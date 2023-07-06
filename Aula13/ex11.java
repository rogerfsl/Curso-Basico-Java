import java.util.Scanner;

public class ex11 {

    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int n1 = scan.nextInt();

        System.out.print("Digite outro número inteiro: ");
        int n2 = scan.nextInt();

        System.out.print("Digite um número real: ");
        double n3 = scan.nextDouble();

        int prod = (n1 * 2) * (n2 / 2);
        System.out.println("A) O produto do dobro do primeiro número com metade do segundo número é: "+ prod);

        double somaTriplo = (n1 * 3) + n3;
        System.out.println("B) A soma do triplo do primeiro número com o terceiro é: " + somaTriplo);

        System.out.println("C) O terceiro número elevado ao cubo é: " + Math.pow(n3,3));
    }
}
