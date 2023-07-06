import java.util.Scanner;

public class ex12 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor da sua hora de trabalho R$ ");
        double valorHora = scan.nextDouble();

        System.out.print("Digite quantas horas são trabalhadas no mês: ");
        double horaTrab = scan.nextDouble();

        double salBruto = valorHora * horaTrab;

        double impostoRenda = 0;
        double inss = (salBruto * 10) /100;
        double fgts = (salBruto * 11) /100;

        if (salBruto <= 900){
            impostoRenda = 0;
        } else if (salBruto <= 1500) {
            impostoRenda = (salBruto * 5) / 100;
        } else if (salBruto <= 2500) {
            impostoRenda = (salBruto * 10) / 100;
        }else {
            impostoRenda = (salBruto * 20) / 100;
        }
        double totDesc = impostoRenda + inss;
        double salLiq = salBruto - totDesc;

        System.out.println("Salário Bruto: R$ " + salBruto);
        System.out.println("Imposto de renda: R$ " + impostoRenda);
        System.out.println("INSS: R$ " + inss);
        System.out.println("FGTS: R$ " + fgts);
        System.out.println("Total de descontos: R$ " + totDesc);

        System.out.println("Salário líquido: R$ " + salLiq);
    }
}
