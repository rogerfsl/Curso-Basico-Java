import java.util.Scanner;

public class ex06 {
    public static void main (String [] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o raio de um círculo: ");
        double raio = scan.nextDouble();

        double area = 3.14 * (raio * raio);
        //double area = Math.PI * Math.pow(raio, 2);
        System.out.println(area);
    }
}
