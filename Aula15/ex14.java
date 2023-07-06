import java.util.Scanner;

public class ex14 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a 1ª nota: ");
        double nota1 = scan.nextDouble();

        System.out.print("Digite a 2ª nota: ");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);

        if (media <= 10 && media >= 9){
            System.out.println("Média parcial é: " + media);
            System.out.println("Conceito A");
            System.out.println("Aprovado.");
        } else if (media < 9 && media >= 7.5) {
            System.out.println("Média parcial é: " + media);
            System.out.println("Conceito B");
            System.out.println("Aprovado.");
        } else if(media < 7.5 && media >= 6){
            System.out.println("Média parcial é: " + media);
            System.out.println("Conceito C");
            System.out.println("Aprovado.");
        } else if (media < 6 && media >= 4) {
            System.out.println("Média parcial é: " + media);
            System.out.println("Conceito D");
            System.out.println("Reprovado.");
        }else if (media < 4 && media >= 0) {
            System.out.println("Média parcial é: " + media);
            System.out.println("Conceito E");
            System.out.println("Reprovado.");
        }
    }
}
