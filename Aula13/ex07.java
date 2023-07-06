import java.util.Scanner;

public class ex07 {

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor de um dos lados de um quadrado: ");
        double lado = scan.nextDouble();

        double area = lado * lado;

        System.out.println("A área é: " + area);
        System.out.println("O dobro dessa área é: " + (area * 2));

    }
}
