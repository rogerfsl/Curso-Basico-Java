import java.util.Scanner;

public class ex05 {

    public static void main (String [] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite uma medida em metros: ");
        double distM = scan.nextDouble();

        double distC = distM * 100;
        System.out.println("Você digitou a medida " + distM + " metros.");
        System.out.println("Essa medida convertida em centimetos é igual a: " + distC + " cm");
    }
}
