import java.util.Scanner;

public class ex06 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int n1 = scan.nextInt();

        System.out.print("Digite outro número: ");
        int n2 = scan.nextInt();

        System.out.print("Digite mais um número: ");
        int n3 = scan.nextInt();

        int maior = n1;

        if (n2 >= maior && n2 >= n3){
            maior = n2;
            System.out.println("O maior número digitado é: " + maior);
        }else if (n3 >= maior && n3 >= n2){
            maior = n3;

            System.out.println("O maior número é: " + maior);
        }else {
            System.out.println("O maior número é: " + maior);
        }
    }
}
