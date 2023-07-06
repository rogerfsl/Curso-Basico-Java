import java.util.Scanner;

public class ex08 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        int i, num, soma = 0;

        for (i = 0; i < 5; i++){
            System.out.print("Digite o " + (i + 1) + "º número: ");
            num = scan.nextInt();
            soma += num;
        }
        double media = soma / i;

        System.out.println("A soma entre os números digitados é: " + soma);
        System.out.println("A média dos números digitados é " + media);

    }
}
