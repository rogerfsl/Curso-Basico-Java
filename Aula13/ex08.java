import java.util.Scanner;

public class ex08 {

    public static void main (String [] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor da sua hora trabalhada: R$ ");
        double horaTrab = scan.nextDouble();

        System.out.print("Quantas horas mensais você trabalha? ");
        double horas = scan.nextDouble();

        double sal = horaTrab * horas;

        System.out.println("No total Você recebe " + sal + " reais de salário.");
    }
}
