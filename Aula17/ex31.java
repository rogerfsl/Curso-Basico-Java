import java.text.DecimalFormat;
import java.util.Scanner;

public class ex31 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print(" Digite o Salário inicial: R$ ");
        double salario = scan.nextDouble();
        double percentual = 1.5;
        salario += (salario * percentual) / 100;

        DecimalFormat format = new DecimalFormat("###,###.##");

        System.out.println("1996 = " + format.format(salario) + " - " + percentual);

        for (int i = 1997; i <= 2015; i++){

            percentual *= 2;
            salario += (salario * percentual) / 100;
            System.out.println(i + " = R$ " + format.format(salario) + " - " + percentual);
        }




    }
}
