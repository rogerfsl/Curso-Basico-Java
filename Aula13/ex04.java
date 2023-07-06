import java.util.Scanner;

public class ex04 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Média Final");

        System.out.print("Digite a 1ª nota: ");
        double nota1 = scan.nextDouble();
        System.out.print("Digite a 2ª nota: ");
        double nota2 = scan.nextDouble();
        System.out.print("Digite a 3ª nota: ");
        double nota3 = scan.nextDouble();
        System.out.print("Digite a 4ª nota: ");
        double nota4 = scan.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.print("A média final do Aluno é: " + media);
    }
}
