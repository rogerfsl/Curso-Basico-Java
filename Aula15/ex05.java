import java.util.Scanner;

public class ex05 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scan.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.println("A média do aluno é: " + media);

        if (media >= 7 && media < 10){
            System.out.println("O aluno está aprovado");
        } else if (media < 7) {
            System.out.println("O aluno está reprovado.");
        } else if (media == 10.0) {
            System.out.println("O aluno esá aprovado com distinção");
        }
    }
}
