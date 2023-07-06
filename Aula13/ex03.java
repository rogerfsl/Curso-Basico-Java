import java.util.Scanner;

public class ex03 {
    public static void main(String [] args ){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n1 = scan.nextInt();
        System.out.print("Digite outro número: ");
        int n2 = scan.nextInt();

        System.out.println("Você digitou os números " + n1 + " e " + n2);
        System.out.println("E a soma deles é: " + (n1 + n2));

    }
}
