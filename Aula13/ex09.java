import javax.swing.*;
import java.util.Scanner;

public class ex09 {

    public static void main (String [] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Conversor de Temperatura.");
        System.out.println("----------------------------------");

        System.out.print("Digite a Temperatura em Farenheit: ");
        double tempFire = scan.nextDouble();

        double tempCels = (5 *(tempFire - 32) / 9);

        System.out.println("Você digitou " + tempFire + " Graus Firenheit");
        System.out.println("Essa temperatura convertida para graus Celsius é de: " + tempCels);
    }
}
