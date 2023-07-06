import java.util.Scanner;

public class ex15 {
    public static void main (String [] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor da sua hora trabalhada: R$ ");
        double horaTrab = scan.nextDouble();

        System.out.print("Quantas horas mensais você trabalha? ");
        int horasMens = scan.nextInt();

        double sal = horaTrab * horasMens;

        double ir = (sal * 11) / 100;

        double inss = (sal * 8) / 100;

        double sind = (sal * 5) /100;

        double totdesc = ir + inss + sind;

        double salLiq = sal - totdesc;

        System.out.println("A) No total Você recebe " + sal + " reais de salário bruto.");

        System.out.println("B) Foi pago ao INSS o valor de: R$" + inss);

        System.out.println("C) Foi pago ao sindicato o valor de R$" + sind);

        System.out.println("D) No total foi descontado R$" + totdesc +". Ficando um salário líquido de R$ "+ salLiq);
    }
}
