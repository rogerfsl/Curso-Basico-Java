import java.util.Scanner;

public class ex10 {

    public static void main (String [] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Conversor de Temperatura.");
        System.out.println("----------------------------------");

        System.out.print("Digite a Temperatura em Celsius: ");
        double tempCels = scan.nextDouble();

        double tempFire = (tempCels * 1.8) + 32;

        System.out.println("Você digitou " + tempCels + " Graus Celsius");
        System.out.println("Essa temperatura convertida para graus Fahrenheit é de: " + tempFire);
    }
}