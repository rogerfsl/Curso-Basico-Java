import java.util.Scanner;

public class ex13 {

    public static void main (String [] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a sua altura em metros: ");
        double altura = scan.nextDouble();

        System.out.print("Digite seu sexo: [M/F] ");
        String sexo = scan.next();

        System.out.println("Agora digite o Seu peso: ");
        double peso = scan.nextDouble();

        double pesoIdealH = (72.7 * altura) - 58;

        double pesoIdealM = (62.1 * altura) - 44.7;


        System.out.println("O peso ideal para homens dessa altura é: " + pesoIdealH);

        System.out.println("O peso ideal para mulheres dessa altura é: " + pesoIdealM);

        








    }
}
