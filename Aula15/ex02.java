import java.util.Scanner;

public class ex02 {

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = scan.nextInt();

        if (num < 0){
            System.out.println("O número é negativo");
        } else {
            System.out.println("O número é positivo");
        }
    }
}
