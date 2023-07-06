import java.util.Scanner;

public class ex20 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a quantidade de alunos da turma: ");
        int quant = scan.nextInt();

        int idade;
        int somaIdade = 0;

        for (int i = 0; i < quant; i++ ){
            System.out.print("Digite a idade da " + (i + 1) + "ª pessoa: ");
            idade = scan.nextInt();
            somaIdade += idade;
        }

        double media = somaIdade / quant;

        System.out.println("A media de idade da turma é: " + media + " anos.");
        if (media > 0 && media <= 25){
            System.out.print("A turma é jovem.");
        } else if (media >= 26 && media <= 60) {
            System.out.print("A turma é adulta.");
        } else {
            System.out.print("A turma é idosa.");
        }
    }

}
