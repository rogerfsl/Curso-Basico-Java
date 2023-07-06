import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class ex11 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o salário do colaborador: ");
        double salario = scan.nextDouble();
        double novoSalario = 0;
        double aumento = 0;

        if(salario <= 280){
            aumento = (salario * 20) / 100;
            novoSalario = salario + aumento;

            System.out.println("O salario atual é de: R$ " + salario);
            System.out.println("Será acrescentado um aumento de 20% sobre o salário, no valor de: " + aumento);
            System.out.println("O salário atual é de: R$ " + novoSalario);
        } else if (salario > 280 && salario < 700) {
            aumento = (salario * 15) / 100;
            novoSalario = salario + aumento;

            System.out.println("O salario atual é de: R$ " + salario);
            System.out.println("Será acrescentado um aumento de 15% sobre o salário, no valor de: " + aumento);
            System.out.println("O salário atual é de: R$ " + novoSalario);
        } else if (salario >= 700 && salario < 1500) {
            aumento = (salario * 10) / 100;
            novoSalario = salario + aumento;

            System.out.println("O salario atual é de: R$ " + salario);
            System.out.println("Será acrescentado um aumento de 10% sobre o salário, no valor de: " + aumento);
            System.out.println("O salário atual é de: R$ " + novoSalario);
        } else {
            aumento = (salario * 5) / 100;
            novoSalario = salario + aumento;

            System.out.println("O salario atual é de: R$ " + salario);
            System.out.println("Será acrescentado um aumento de 5% sobre o salário, no valor de: " + aumento);
            System.out.println("O salário atual é de: R$ " + novoSalario);
        }


    }
}
