import java.util.Scanner;

public class ex12 {

    public static void main (String [] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a sua altura em metros: ");
        double altura = scan.nextDouble();

        double pesoIdeal = (72.7 * altura) - 58;
        System.out.println("O Seu peso ideal é: " + pesoIdeal);


    }
}
