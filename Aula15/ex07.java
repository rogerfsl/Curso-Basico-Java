import java.util.Scanner;

public class ex07 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n1 = scan.nextInt();

        System.out.print("Digite mais um número: ");
        int n2 = scan.nextInt();

        System.out.print("Digite o último número: ");
        int n3 = scan.nextInt();

        int maior = n1;
        int menor = n1;

        if (n2 > maior && n2 > n3){
            maior = n2;
            System.out.println("O maior número digitado é: " + maior);
        }else if (n3 > maior && n3 > n2){
            maior = n3;
            System.out.println("O maior número é: " + maior);
        }else {
            System.out.println("O maior número é: " + maior);
        }

        if (n2 < menor && n2 < n3){
            menor = n2;
            System.out.println("O menor número digitado é: " + menor);
        } else if (n3 < menor && n3 < n2) {
            menor = n3;
            System.out.println("O menor número digitado é: " + menor);
        }else {
            System.out.println("O menor número digitado é: " + menor);
        }
    }
}
