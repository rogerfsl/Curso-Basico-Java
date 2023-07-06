import java.util.Scanner;

public class ex01 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int n1 = scan.nextInt();

        System.out.print("Digite mais um número: ");
        int n2 = scan.nextInt();

        if (n2 > n1){
            System.out.println("O maior número é: " + n2);
        } else {
            System.out.println("O maior número é: " + n1);
        }
    }
}
