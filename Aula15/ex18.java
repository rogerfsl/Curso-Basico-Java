import java.util.Scanner;

public class ex18 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = scan.nextInt();

        System.out.println("Você digiotou o número " + num);
        if (num % 2 == 0){
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é impar.");
        }
    }
}
